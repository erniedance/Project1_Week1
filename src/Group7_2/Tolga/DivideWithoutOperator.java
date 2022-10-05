package Group7_2.Tolga;

import java.util.Scanner;

public class DivideWithoutOperator {
    public static void main(String[] args) {


        int result = 0;//variable declaration
        Scanner scan=new Scanner(System.in); //create a scanner instance for receives input from the user

        System.out.print("Enter the value to num1: ");
        int num1=scan.nextInt();//Reading the input for num1


        System.out.print("Enter the value to num2: ");
        int num2=scan.nextInt();//Reading the input for num2


        while(num1 >= num2) {
            num1 = num1-num2;
            result++;

        }
        System.out.println("Division is:"+ result);
    }
}
