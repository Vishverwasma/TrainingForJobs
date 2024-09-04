package TelegramProjects;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        int number1,number2,number3;
        Scanner sc = new Scanner(System.in);
        System.out.print("1st : ");
        number1=sc.nextInt();
        System.out.print("2nd : ");
        number2=sc.nextInt();
        System.out.print("3rd : ");
        number3=sc.nextInt();
        System.out.println("Sum of This Three Number is : "+(number1+number2+number3));

        System.out.println("Star Pattern : ");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Number Pattern : ");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
