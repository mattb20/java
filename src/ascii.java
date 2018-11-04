import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SubStringCons{
    public static void main(String args[]) {
        byte ascii[] = {65,66,67,68,69,70};

        String s1 = new String(ascii);
        System.out.println(s1);

        String s2 = new String(ascii, 2, 3);
        System.out.println(s2);

        List<String> strings = Arrays.asList("this", "is", "a", "long", "list", "of", "strings", "to", "use", "as", "a", "demo");

        System.out.println(hasTenDigits("0123456789"));

        List<String> strings = Arrays.asList("this", null, "is",
                "a", null, "list", "of", null "strings");
        List <String> nonNullStrings = strings.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        System.out.println(nonNullStrings);
        Random r = new Random();
        r.inst(5)
                .sorted()
                .forEach(System.out::println);
    }

    private static boolean hasTenDigits(String s) {
        return s.matches(".*[0-9]{10}.*");
    }

    private BigInteger fib(long i) {
        if (i == 0) return BigInteger.ZERO;
        if (i == 1) return BigInteger.ONE;

        return cache.computeIfAbsent(i, n -> fib(n - 2).add(fib(n-1)));

    }

    public Map<String, Integer> countWords(String passage, String... strings) {
        Map<String, Integer> wordCounts = new HashMap<>();

        Arrays.stream(strings).forEach(s -> wordCounts.put(s, 0));

        Arrays.stream(passage.split(" ")).forEach(word ->
                wordCounts.computeIfPresent(word, (key, val) -> val + 1));

        return wordCounts;
    }

    List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
    List<String> sorted = strings.stream()
                    .sorted((s1, s2) -> s1.compareTo(s2))
                    .collect(Collectors.toList());

    List<String> sorted = strings.stream()
            .sorted(String::compareToIgnoreCase)
            .collect(Collectors.toList()); // method reference and equivalent lambda

    List<String> names = Arrays.asList("Grace Hopper", "Barbara Liskov", "Ada Lovelace","Emmanuel Frimpong");

    List<Person> people = names.stream()
                .map(name -> new Person(name))
                .collect(Collectors.toList());

    // alternatively

    List<Person> people = names.stream()
            .map(Person::new)
            .collect(Collectors.toList());

    List<String> sorted = names.stream()
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());

    sorted = names.stream()
            .sorted(Comparator.comparing(String::toLowerCase))
            .collect(Collectors.toList());

    sorted = names.stream()
            .sorted(Comparator.comparingInt(String::length))
            .collect(Collectors.toList());

    Optional<String> firstEven = Stream.of("five", "even", "length", "string", "values")
            .filter(s -> s.length() % 2 == 0)
            .findFirst();


}

