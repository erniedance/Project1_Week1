package Group7_2.ilknur;

public class DivideWithNoOperator {

    public static void main(String[] args){
        System.out.println(noOperator(11,2));
    }

    public static int noOperator(double x, double y){
        int count = 0;
        while (x!=0){
            x = x-y;
            count++;

            if(x<y){
                break;
            }
        }

        return count;
    }

}
