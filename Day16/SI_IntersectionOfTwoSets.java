package RailworldTraining.Day16;
//3. *Find the Intersection of Two Sets*
//        - *Description*: Write a function that finds the intersection of two sets and returns a new set containing the common elements.

import java.util.*;

public class SI_IntersectionOfTwoSets {
    public static <T> Set<T> findIntersection(Set<T> set1, Set<T> set2) {
        Set<T> intersectionSet = new HashSet<>();
        for (T element : set1) {
            if (set2.contains(element)) {
                intersectionSet.add(element);
            }
        }
        return intersectionSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Set<Integer> intersection = findIntersection(set1, set2);
        System.out.println("Intersection of set1 and set2: " + intersection);
    }
}
