import java.util.Arrays;
import java.util.List;

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
}

