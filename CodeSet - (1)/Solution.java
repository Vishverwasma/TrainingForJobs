package TelegramProjects;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number Of entries : ");
        int n = sc.nextInt();
        System.out.println();
        String[] students = new String[n];
        int[] ranks = new int[n];
        System.out.println("Students Names: ");
        for(int i=0;i<n;i++){
            students[i]= sc.next();
        }
        System.out.println("Students Ranks: ");
        for(int i=0;i<n;i++){
            ranks[i]= sc.nextInt();
        }
        Admacs a = new Admacs(students,ranks);
        System.out.println("Students name with Highest rank : "+a.highestRankStudent());
        System.out.println("Students name with Lowest rank : "+a.lowestRankStudent());
    }
}
