package Group7_2;
import java.util.Scanner;
public class DivideWithoutOperators {

        public static void main(String[] args) {
            int numbers =100;
            int numbers1=10;
            System.out.println(DivideWithoutOperators(numbers, numbers1));
        }
        public static int DivideWithoutOperators(int nums1, int nums2) {
            int result = 0;
            while (nums1 >= nums2) {
                nums1 = nums1 - nums2;
                result++;
            }
            return result;
        }
    }
