package RailworldTraining.Day16;

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
        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(2, 3, 4);
        Set<Integer> set3 = Set.of(3, 4, 5);

        List<Set<Integer>> sets = List.of(set1, set2, set3);

        Set<Integer> union = unionOfSets(sets);
        System.out.println("Union of sets: " + union);
    }
}
