import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Census {

    private List<Person> people = new ArrayList<Person>();


    void addPerson(Person person){

        people.add(person);
    }
    boolean removePerson(Person person){

        return people.remove(person);
    }
    int countPeople(){

        return people.size();
    }
    int countMales(){
        int count = 0;
        for (Person p: people){
            if (p.getIsMale()){
                count++;
            }

        }
        return count;
    }
    int countFemales(){
        int count = 0;
        for (Person p: people){
            if (!p.getIsMale()){
                count++;
            }

        }
        return count;
    }

//    void sortOnAge() {
//        people.sort(Comparator.comparingInt(Person::getAge));
//    }
//
//    void sortOnHeight(){
//        people.sort (Comparator.comparingInt(Person::getHeight));
//
//    }
//    void sortOnGender(){
//        people.sort (Comparator.comparing(Person::getIsMale));
//
//    }




    void sortOnAge() {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });
    }


    void sortOnHeight() {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getHeight(), p2.getHeight());
            }
        });
    }


    void sortOnGender() {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Boolean.compare(p1.getIsMale(), p2.getIsMale());
            }
        });
    }

    @Override
    public String toString() {
        return "Total people: " + countPeople() + "\n" +
                "Total males: " + countMales() + "\n" +
                "Total females: " + countFemales() + "\n";
    }


}
