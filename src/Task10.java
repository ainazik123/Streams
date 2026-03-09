import java.util.*;

public class Task10 {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Anna","A1",3.8),
                new Student("Bob","A1",3.2),
                new Student("Kate","B1",3.9),
                new Student("Mike","B1",3.7),
                new Student("John","A2",3.6)
        );

        List<Student> result = students.stream()
                .filter(s -> s.getGpa() > 3.5)
                .limit(3)
                .toList();

        System.out.println(result);
    }
}