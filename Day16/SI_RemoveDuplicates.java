package RailworldTraining.Day16;
//1. *Remove Duplicates from an Array*
//        - *Description*: Given an array of integers, remove duplicates and return the array with unique elements.

import java.util.*;

public class SI_RemoveDuplicates {
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : array) {
            uniqueElements.add(num);
        }

        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4, 5};
        System.out.println("Original array: " + Arrays.toString(array));
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array with unique elements: " + Arrays.toString(uniqueArray));
    }
}
