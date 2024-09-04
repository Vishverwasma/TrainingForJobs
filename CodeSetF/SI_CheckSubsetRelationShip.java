package RailworldTraining.Day16;
//5. *Check Subset Relationship*
//        - *Description*: Write a function that checks if one set is a subset of another set.

import java.util.*;
    public class SI_CheckSubsetRelationShip {

        public static <T> boolean isSubset(Set<T> set1, Set<T> set2) {
            // Check if all elements of set1 are present in set2
            for (T element : set1) {
                if (!set2.contains(element)) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            // Example sets
            Set<Integer> set1 = Set.of(1, 2, 3);
            Set<Integer> set2 = Set.of(1, 2, 3, 4, 5);
            Set<Integer> set3 = Set.of(3, 4, 5);

            // Test cases
            System.out.println("Is set1 a subset of set2? " + isSubset(set1, set2)); // true
            System.out.println("Is set1 a subset of set3? " + isSubset(set1, set3)); // false
        }
    }
