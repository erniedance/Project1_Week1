package Group7_2.ernie;

public class ErnieFinra {

    public static void main(String[] args) {

        int[] numbers = new int[60];
        for (int i = 0; i< numbers.length ; i++) {
            numbers[i] =i+1;
        }
        System.out.println(finra(numbers));
    }
    public static String finra(int []nums){
        String verse = "";
        for (int i = 1; i <= nums.length; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)){
                verse=verse + "FINRA";
                continue;
            }else if (i % 5 == 0){
                verse=verse + "RA";
                continue;
            }else if(i % 3 == 0){
                verse=verse + "FIN";
                continue;
            }
            verse=verse+"FIN";
        }
        return verse;
    }
}

