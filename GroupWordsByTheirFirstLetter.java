package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByTheirFirstLetter {
    public static void main(String[] args) {

        List<String> words = List.of("apple", "avocado", "banana", "berry", "blueberry", "cherry");

        System.out.println(words.stream().collect(Collectors.groupingBy(i-> i.charAt(0), Collectors.toList())));;

    }
}
