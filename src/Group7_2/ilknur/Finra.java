package Group7_2.ilknur;

public class Finra {

    public static void main(String[] args) {


        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println(i + " FINRA");
            } else if (i % 5 == 0) {
                System.out.println(i + " RA");
            } else if (i % 3 == 0) {
                System.out.println(i + " FIN");
            }
        }

    }

}