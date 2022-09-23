package Group7_2;

public class ErnieEvenOdd {

    public static void main(String[] args) {
        numbers(22);
    }

//Task 1 Even/Odd
    public static void numbers(int numbers){
    if (numbers % 2 == 0){
        System.out.println(numbers + " is even");
    }else {
        System.out.println(numbers + "is odd");
    }
  }
}
