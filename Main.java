import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(2,5,3,6,33,66,3,77,45,322,2);

        Consumer<Integer> intPrint = System.out::println;

        System.out.println(list.stream().reduce((i,j)->i+j).get());
        System.out.println(list.stream().min(Comparator.naturalOrder()).get());;

        Stream.of("anna", "bob", "charlie", "mukesh", "sam").filter(i->i.length()>3).forEach(System.out::println);

        String s = "Hello world";
        s.chars().forEach(System.out::println);

        String str = "kanak";

        System.out.println();

        Stream.of(1,2,3).flatMap(i-> Stream.of(i+1)).forEach(System.out::println);




    }

    static boolean palindrome(String str, int n) {
        return str.chars().limit(n/2).sum() == str.chars().skip(n%2==0?n/2:n/2+1).sum();
    }
    static boolean isPalindrome(String str, int n) {
        return IntStream.range(0, n / 2).allMatch(i -> str.charAt(i) == str.charAt(n - 1 - i));
    }

}