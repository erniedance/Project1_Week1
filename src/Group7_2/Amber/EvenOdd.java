package Group7_2.Amber;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " Even");
        }else{
            System.out.println(num + " Odd");
        }

    }
    }

