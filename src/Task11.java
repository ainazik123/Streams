import java.util.*;

public class Task11 {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Anna","A1",3.8),
                new Student("Bob","A1",3.2),
                new Student("Kate","B1",3.9),
                new Student("Mike","B1",3.4)
        );

        long count = students.stream()
                .filter(s -> s.getGpa() > 3.5)
                .count();

        System.out.println("Students with GPA > 3.5: " + count);
    }
}