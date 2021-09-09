package streamsApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordsCounter {
    public static void main(String[] args) {
        new BufferedReader(new InputStreamReader(System.in)).lines()
                .flatMap(s -> Arrays.asList(s.split("[^А-Яа-яa-zA-Z0-9_]+")).stream())
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(10)
                .forEach(x -> System.out.println(x.getKey()));
    }
}
