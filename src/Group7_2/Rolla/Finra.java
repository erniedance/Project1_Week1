package Group7_2.Rolla;

public class Finra {
    public static void main(String[] args) {

        for(int i=0; i<30; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FINRA");
            }else if (i%3==0){
                System.out.println("FIN");
            }else if(i%5==0){
                System.out.println("RA");
            }
        }
    }
}
