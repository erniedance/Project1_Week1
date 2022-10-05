package Group7_2.Marija;

public class EvanOdd {

    public static void main(String[] args) {
        identify (10);
    }

    /*
    Task 1 Number odd & even
    Write a method which can identify given number is even or odd
     */

    public static void identify (int number){

        if(number % 2 == 0){
            System.out.println(number + " is Even number");
        } else {
            System.out.println(number + " is Odd number");
        }
    }
}
