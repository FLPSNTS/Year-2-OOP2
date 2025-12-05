import java.util.ArrayList;
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

    @Override
    public String toString() {
        return "Total people: " + countPeople() + "\n" +
                "Total males: " + countMales() + "\n" +
                "Total females: " + countFemales() + "\n";
    }


}
