import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,2,9,1,7);

        int max = numbers.stream().max(Integer::compare).get();
        int min = numbers.stream().min(Integer::compare).get();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}