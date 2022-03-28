import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TestRegex {
    private static final List<Character> WORD_BOUNDARY_CHARACTERS =
            Arrays.asList(' ', '=', '!', '@', '#', '$', '%', '^', '&', '(', ')', '-', '+', '`', '~', '[',
                    '{', ']', '}', '\\', '|', ';', ':', '\"', ',', '<', '>', '/', '?');
    private static final String WORD_BOUNDARY_OPERATOR = "|";
    private static final String SPLIT_REGEX =
            WORD_BOUNDARY_CHARACTERS
                    .stream()
                    .map(character -> "\\" + character)
                    .collect(Collectors.joining(WORD_BOUNDARY_OPERATOR));
    private static final String SPLIT_REGEX2 = "([^\"]\\S*|\".+?\")\\s*";

    private static final Pattern WORD_BOUNDARY_CHARACTERS_PATTERN = Pattern.compile(SPLIT_REGEX2);

    private static final String TOKEN_REGEX = "([^\"]\\S*|\".+?\")\\s*";
    private static final Pattern TOKEN_PATTERN = Pattern.compile(TOKEN_REGEX);
    public static void main(String[] args) {
        System.out.println("split regex: " + SPLIT_REGEX);
        System.out.println("---");
        String value = "\"Harry Potter\"";
        Arrays.stream(WORD_BOUNDARY_CHARACTERS_PATTERN.split(value))
                .forEach(t -> System.out.println(t));

        System.out.println("---");
        String str = "Location \"Welcome  to india\" Bangalore " +
                "Channai \"IT city\"  Mysore";
        // System.out.println(split(str));

        System.out.println(split(""));
    }

    public static List<String> split(String value) {
        final List<String> list = new ArrayList<>();
        final Matcher m = TOKEN_PATTERN.matcher(value);
        while (m.find()) {
            list.add(m.group(1));
        }
        return list;
    }
}
