import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver10 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student(1, "JJ. Jognson", 38));
        students.add(new Student(2, "P. Tibbs", 48));
        students.add(new Student(3, "W. Major", 28));
        students.add(new Student(4, "P. Turner", 60));
        students.add(new Student(5, "A. Ball", 20));
        students.add(new Student(6, "B. Smithy", 90));
        students.add(new Student(7, "R. Jules", 71));
        students.add(new Student(8, "T. Verne", 97));


        // create your Stream solutions here

        students.stream()
                .forEach(System.out::println);


        students.stream()
                .filter(s -> s.getGrade() > 70)
                .forEach(System.out::println);


        Object [] studentArray = students.stream()
                        .map(s -> s.getName().toUpperCase()) //mapping each student object inside the array to a name
                                .sorted()
                                        .toArray(); // converting from object to array


        System.out.println(Arrays.toString(studentArray));


    }
}
