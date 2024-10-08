import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUtils {
    public static void main(String[] args) throws IOException {
        List<Fox> foxList = new ArrayList<>();

        Fox fox1 = new Fox("fox1", "red", 3);
        Fox fox2 = new Fox("fox2", "black", 5);
        Fox fox3 = new Fox("fox3", "white", 10);
        Fox fox4 = new Fox("fox4", "red", 7);
        Fox fox5 = new Fox("fox5", "black", 9);
        Fox fox6 = new Fox("fox6", "red", 8);
        Fox fox7 = new Fox("fox7", "red", 2);
        Fox fox8 = new Fox("fox8", "orange", 4);
        Fox fox9 = new Fox("fox9", "green", 4);

        foxList.add(fox1);
        foxList.add(fox2);
        foxList.add(fox3);
        foxList.add(fox4);
        foxList.add(fox5);
        foxList.add(fox6);
        foxList.add(fox7);
        foxList.add(fox8);
        foxList.add(fox9);

        System.out.println(exercise11("florida-state-road.txt"));
    }

    public static List<Integer> exercise1(List<Integer> numbers) {
        return numbers.stream()
                .filter(p -> p % 2 == 0)
                .toList();
    }

    public static List<Integer> exercise2(List<Integer> numbers) {
        Function<Integer, Integer> square = x -> x * x;

        return numbers.stream()
                .filter(p -> p > 0)
                .map(square)
                .toList();
    }

    public static List<Integer> exercise3(List<Integer> numbers, final int minSquare) {
        Function<Integer, Integer> square = x -> x * x;

        return numbers.stream()
                .filter(p -> square.apply(p) > minSquare)
                .toList();

    }

    public static double exercise4(List<Integer> numbers) {
        return numbers.stream()
                .filter(p -> !(p % 2 == 0))
                .collect(Collectors.summingDouble(p -> p))
                /
                numbers.stream()
                        .filter(p -> !(p % 2 == 0))
                        .count();
    }

    public static int exercise5(List<Integer> numbers) {
        return numbers.stream()
                .filter(p -> !(p % 2 == 0))
                .collect(Collectors.summingDouble(p -> p))
                .intValue();

    }

    public static List<Character> exercise6(String s) {
        Character[] c = new String(s.toCharArray()).chars().mapToObj(c1 -> (char) c1).toArray(Character[]::new);
        List<Character> output = Arrays.asList(c);

        return output.stream()
                .filter(c1 -> Character.isUpperCase(c1))
                .toList();
    }

    public static List<String> exercise7(List<String> cities, String startingChar) {
        return cities.stream()
                .filter(s -> s.startsWith(startingChar))
                .toList();
    }

    public static String exercise8(List<Character> characters) {
        return characters.stream()
                .collect(Collector.of(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append,
                        StringBuilder::toString
             ));

    }

    public static Map<Character, Long> exercise9(String s) {
        return Stream.of(s)
                .flatMap(s1 -> s.chars().boxed())
                .map(x -> (char) x.intValue())
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
    }

    public static List<Fox> exercise10Part1(List<Fox> foxList) {
        return foxList.stream()
                .filter(x -> x.getColor().equals("green"))
                .toList();
    }

    public static List<Fox> exercise10Part2(List<Fox> foxList) {
        return foxList.stream()
                .filter(fox -> fox.getColor().equals("green"))
                .filter(fox -> fox.getAge() < 5)
                .toList();
    }

    public static Map<String, Long> exercise10Part3(List<Fox> foxList) {
        return foxList.stream()
                .collect(Collectors.groupingBy((Fox fox) -> fox.getColor(),
                        Collectors.counting()));
    }

    public static Map<String, Long> exercise11(String file) throws IOException {
        Path filePath = Paths.get(file);
        return Files.readAllLines(filePath).stream()
                .flatMap(x -> Arrays.stream(x.split(" ")).toList().stream())
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));
    }
}
