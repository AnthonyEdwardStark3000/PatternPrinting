import java.util.*;

public class CountCommonCharactersinStrings {

    public static void main(String[] args) {

        String s1 = "energy";
        String s2 = "every";

        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();

        for(char c : s1.toCharArray()) {
            set1.add(c);
        }
        for(char c : s2.toCharArray()) {
            set2.add(c);
        }

        // Stores the intersection of set1 and set2 inside set1
        set1.retainAll(set2);

        for(char c : set1) {
            System.out.print(" " + c);
        }

        System.out.println("\nTotal number of common characters: "
            + set1.size());
    }
}