package Group7_2.Tolga;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(num % 2 == 0 ? " is Odd number " : " is Even number");

    }
}
