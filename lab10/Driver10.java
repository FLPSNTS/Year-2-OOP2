import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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


        double average = students.stream()
                        .mapToDouble(Student :: getGrade) // maping each Student object to their grade (done in background)
                                .average() // gets the average of all the mapped grades
                                        .getAsDouble(); // converts to a double

        System.out.println(average);

        IntStream.range(90, 101)
                .map(n -> n * n * n)
                .forEach(System.out::println);

        Stream.generate(Math::random) // infinite random doubles
                .map(n -> (int)(n * 5 + 1)) // intergers 1-5
                .limit(10)
                .forEach(System.out::println);


//
//        Collect the values into a List of
//        integer values, then display the list using a traditional for
//        loop, e.g.
//                List<Integer> numList = …stream methods
//        for(int next : numList)
//            System.out.println("Next value is : " + next);
//        3. What additional intermediate method could be added to the
//        above statement to ensure any duplicate values were removed
//        from the resultant collection? Add this to the solution.








    }
}
