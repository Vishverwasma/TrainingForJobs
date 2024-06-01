package RailworldTraining.Day16;
//2. *Check if Two Sets are Disjoint*
//        - *Description*: Write a function that checks if two sets are disjoint (i.e., they have no elements in common).

import java.util.*;

public class SI_TwoSetsAreDisjoints {
    public static <T> boolean areDisjoint(Set<T> set1, Set<T> set2) {
        Set<T> hashSet = new HashSet<>(set1);

        for (T element : set2) {
            if (hashSet.contains(element)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Set<Integer> set3 = new HashSet<>();
        set3.add(3);
        set3.add(4);
        set3.add(5);

        System.out.println("Are set1 and set2 disjoint? " + areDisjoint(set1, set2)); // true
        System.out.println("Are set1 and set3 disjoint? " + areDisjoint(set1, set3)); // false
    }
}
