import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> even = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(even);
    }
}