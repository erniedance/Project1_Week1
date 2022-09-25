package Group7_2;
    import org.w3c.dom.ls.LSOutput;
import java.sql.Array;
import java.util.Arrays;
    public class FINRA {
        public static void main(String[] args) {
            int[] numbers = new int[30];
            for (int i =0; i< numbers.length; i++){
                numbers[i] = i+1;
            }
            System.out.println(finra(numbers));
        }
        public static String finra (int []nums){
            String message = "";
            for (int i = 1; i <= nums.length; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    message=message +  "FINRA ";
                    continue;
                } else if (i % 5 == 0) {
                    message =message + "RA ";
                    continue;
                } else if (i % 3 == 0) {
                    message =message + "FIN ";
                    continue;
                }
                message = message + i + " ";
            }
            return message;
        }

    }
