import java.util.*;

public class Task6 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,2,3,4,4,5);

        List<Integer> unique = numbers.stream()
                .distinct()
                .toList();

        System.out.println(unique);
    }
}