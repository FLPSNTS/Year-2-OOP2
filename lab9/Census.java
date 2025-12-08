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
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("total people: ").append(countPeople()).append("\n");
        sb.append("Total males: ").append(countMales()).append("\n");
        sb.append("Total females: ").append(countFemales()).append("\n");

        for (Person p : people){
            sb.append(p.toString()).append("\n");
        }

        return sb.toString();
    }

//    @Override
//    public String toString() {
//        String result = "Total people: " + countPeople() + "\n" +
//                "Total males: " + countMales() + "\n" +
//                "Total females: " + countFemales() + "\n\n";
//
//        for (Person p : people) {
//            result += p.toString() + "\n";  // less efficient, but valid
//        }
//
//        return result;
//    }
    //no stringbuilder works but not correct way



}
