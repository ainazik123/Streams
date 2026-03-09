import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,2,9,1,7);

        List<Integer> sorted = numbers.stream()
                .sorted((a,b) -> b-a)
                .toList();

        System.out.println(sorted);
    }
}