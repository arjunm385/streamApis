package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlattenWordsIntoCharacters {
    public static void main(String[] args) {

        List<String> words = List.of("hello", "world");

        List<String> res = words.stream().flatMap(i-> Arrays.stream(i.split(""))).toList();

        System.out.println(res);

        res = words.stream()
                .flatMap(i-> i.chars().mapToObj(c->String.valueOf((char) c))).toList();

        System.out.println(res);

    }
}
