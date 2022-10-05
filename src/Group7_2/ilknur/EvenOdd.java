package Group7_2.ilknur;

public class EvenOdd {

    public static void main(String[] args) {


        identify (10);
    }

    public static void identify (int num){

        if(num % 2 == 0){
            System.out.println("Even number" + num);
        } else {
            System.out.println("Odd number" + num);
        }
    }
}
