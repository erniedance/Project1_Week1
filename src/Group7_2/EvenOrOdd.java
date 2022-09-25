package Group7_2;
public class EvenOrOdd {
            public static void main(String[] args) {
            int numbers = 20;
            System.out.println(evenOrOdd(numbers));
        }
        public static String evenOrOdd(int nums) {
            String message = "";
            if (nums % 2 == 0) {
                message = "Even";
            } else {
                message = "Odd";
            }
            return message;
        }

    }
