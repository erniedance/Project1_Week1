package Group7_2.Rolla;

import java.util.Scanner;


    public class EvenOdd {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = input.nextInt();
            if (num % 2 == 1) {
                System.out.println(num + " is odd");
            } else {
                System.out.println(num + " is even");

            }
        }
    }