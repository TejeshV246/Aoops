import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("vijayawada");
        strings.add("hyderabad");
        strings.add("aziznagar");
        strings.add("jubliehills");

        // Sort the list in descending order using a lambda expression
        strings.sort((s1, s2) -> s2.compareTo(s1));

        // Print the sorted list
        System.out.println(strings);
    }
}
