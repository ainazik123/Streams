import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple","banana","avocado","orange");

        long count = words.stream()
                .filter(w -> w.startsWith("a"))
                .count();

        System.out.println(count);
    }
}