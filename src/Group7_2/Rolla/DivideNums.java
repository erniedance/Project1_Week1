package Group7_2.Rolla;

import java.util.Scanner;



    public class DivideNums {
        public static void main(String[] args) {
            int result = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the value of num1: ");

            int num1 = scan.nextInt();
            System.out.println("Enter the value of num2: ");
            int num2 = scan.nextInt();

            while(num1>=num2) {
                num1=num1-num2;
                result++;
            }
            System.out.println("Result equals " + result);
        }
    }


