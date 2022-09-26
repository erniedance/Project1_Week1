package Group7_2.ernie;

public class DivideNumberWithoutOperators {

    public static void main(String[] args) {

        int numbers = 300;
        int numbers1= 30;
        System.out.println( DivideNumberWithoutOperators(numbers,numbers1));
    }
    public static int DivideNumberWithoutOperators(int nums1, int nums2){
        int result = 0;
        while (nums1>= nums2){
            nums1 = nums1 - nums2;
            result++;
        }
        return result;
    }

}
