package Group7_2.ferhat;

public class FerhatEvenOdd {
    public static void main(String[] args) {

        int[] num = {1, 3, 2, 6, 8, 9, 24, 23};

        for (int each : num) {

            if (each % 2 == 0 ){
                System.out.println(each + " is Even Number");
            }else
            System.out.println(num + " is Odd Number");
        }
    }

}
