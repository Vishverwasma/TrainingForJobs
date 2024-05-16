package RailworldTraining.Day09;

import java.util.Scanner;

/*
* Electricity bill questions condition
1. Bill according to unit if unit is less
*  than 50 calculate 4 rupees per unit if unit
*  50-100 calculate 4 rupees for 1-50 unit and 6
*  rupees for 51 to 100 unit and so on
* */
public class ElectricityBill {
    public static double Electricity(int electricity_bill){
        double rate = 0;
        if (electricity_bill <= 50) {
            // For electricity_bill less than or equal to 50, charge 4 rupees per unit
            rate = electricity_bill * 4;
        } else if (electricity_bill <= 100) {
            // For electricity_bill between 51 and 100, charge 4 rupees for the first 50 electricity_bill and 6 rupees for the remaining electricity_bill
            rate = (50 * 4) + ((electricity_bill - 50) * 6);
        } else if (electricity_bill <= 150) {
            // For electricity_bill between 101 and 150, charge 4 rupees for the first 50 electricity_bill, 6 rupees for the next 50 electricity_bill, and 8 rupees for the remaining electricity_bill
            rate = (50 * 4) + (50 * 6) + ((electricity_bill - 100) * 8);
        } else {
            // For electricity_bill above 150, charge 4 rupees for the first 50 electricity_bill, 6 rupees for the next 50 electricity_bill, 8 rupees for the next 50 electricity_bill, and 10 rupees for the remaining electricity_bill
            rate = (50 * 4) + (50 * 6) + (50 * 8) + ((electricity_bill - 150) * 10);
        }
        return rate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int electricity_bill ;
        double rate = 0;
        System.out.println("Enter Your Electricity Unit : ");
        electricity_bill = sc.nextInt();
        rate=Electricity(electricity_bill);
        System.out.println("So for Electricity unit of "+electricity_bill + " rate comes out to be "+rate);
    }
}
