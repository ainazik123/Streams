import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple","banana","orange");

        List<String> upper = words.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(upper);
    }
}