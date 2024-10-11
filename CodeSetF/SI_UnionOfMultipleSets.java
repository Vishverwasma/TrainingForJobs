package CodeSetF;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//4. *Union of Multiple Sets*
//        - *Description*: Write a function that takes a list of sets and returns their union.

public class SI_UnionOfMultipleSets {
    public static <T> Set<T> unionOfSets(List<Set<T>> sets) {
        // Create a new set to store the union of all sets
        Set<T> unionSet = new HashSet<>();

        // Iterate through each set in the list and add its elements to the union set
        for (Set<T> set : sets) {
            unionSet.addAll(set);
        }

        return unionSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(3, 4, 5));

        List<Set<Integer>> sets = Arrays.asList(set1, set2, set3);

        Set<Integer> union = unionOfSets(sets);
        System.out.println("Union of sets: " + union);
    }
}
