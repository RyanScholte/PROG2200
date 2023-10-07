import java.util.*;

public class SortNamesUsingTreeSet {
    public static void main(String[] args) {
        // Create an array of names
        String[] names = {
            "Riley", "Zoe", "Bob", "Emmett", "Charlie",
            "Daniel", "Scott", "Morgan", "Jared", "Ashton"
        };

        // Create a TreeSet to automatically sort the names
        SortedSet<String> sortedNames = new TreeSet<>(Arrays.asList(names));

        // Print the sorted names
        System.out.println("Sorted Names:");
        for (String name : sortedNames) {
            System.out.println(name);
        }
    }
}