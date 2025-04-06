package streams;
import java.util.*;
import java.util.stream.Collectors;

public class FrequencyMap {
    public static void main(String[] args) {
        List<String> input = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> map = input.stream().collect(Collectors.groupingBy(i->i, Collectors.counting()));

        System.out.println(map);

        //first non-repeating character:
        String str = "swwsiytssi";

        Map<String, Long> freq = str.chars().mapToObj(i->String.valueOf((char) i)).collect(Collectors.groupingBy(i->i, Collectors.counting()));
        System.out.println(str.chars().mapToObj(i->String.valueOf((char) i)).filter(i->freq.get(i) == 1).findFirst().orElse("not found"));



    }
}
