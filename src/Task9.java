import java.util.*;

public class Task9 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Anna","A1",3.8),
                new Student("Bob","A1",3.2),
                new Student("Kate","B1",3.9)
        );

        double avg = students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0);

        System.out.println(avg);
    }
}