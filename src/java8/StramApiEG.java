package java8;
import java.util.Arrays;
import java.util.List;

public class StramApiEG {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 10, 3, 5, 12);
        // filter() - keep numbers greater than 4
        System.out.println("filter:");
        numbers.stream().filter(n -> n > 4).forEach(n -> System.out.print(n + " "));
        System.out.println();
        // map() - multiply every number by 2
        System.out.println("map:");
        numbers.stream().map(n -> n * 2).forEach(n -> System.out.print(n + " "));
        System.out.println();
        // sorted() - sort numbers
        System.out.println("sorted:");
        numbers.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        // distinct() - remove duplicates
        System.out.println("distinct:");
        numbers.stream()
                .distinct()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        // limit() - take first 3
        System.out.println("limit:");
        numbers.stream()
                .limit(3)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        // skip() - skip first 3
        System.out.println("skip:");
        numbers.stream()
                .skip(3)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        // count() - count elements
        long count = numbers.stream()
                .filter(n -> n > 4)
                .count();
        System.out.println("count: " + count);
        // findFirst() - get first element
        int first = numbers.stream()
                .findFirst()
                .get();
        System.out.println("findFirst: " + first);
        // anyMatch() - is at least one number > 10?
        boolean any = numbers.stream()
                .anyMatch(n -> n > 10);
        System.out.println("anyMatch: " + any);
        // allMatch() - are all numbers positive?
        boolean all = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println("allMatch: " + all);
    }
}
