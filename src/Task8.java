import java.util.*;
import java.util.stream.Collectors;

public class Task8 {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Anna","A1",3.8),
                new Student("Bob","A1",3.2),
                new Student("Kate","B1",3.9),
                new Student("Mike","B1",3.4)
        );

        Map<String, List<Student>> grouped =
                students.stream()
                        .collect(Collectors.groupingBy(Student::getGroup));

        System.out.println(grouped);
    }
}