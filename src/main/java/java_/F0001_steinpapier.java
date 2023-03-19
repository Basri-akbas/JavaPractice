package java_;

import java.util.Random;
import java.util.Scanner;

public class F0001_steinpapier {
    public static void main(String[] args) {
        /*
         *  tas >makas    makas>kagit    kagit>tas
         */

        int numberOfMyWin=0;
        int numberOfComWin=0;
        int gameOver=3;

//		List<String> elemanlar=new ArrayList<>();
//		elemanlar.add("Tas");
//		elemanlar.add("Makas");
//		elemanlar.add("Kagit")	;
        Scanner scan=new Scanner(System.in);

        while(numberOfMyWin<gameOver &&   numberOfComWin<gameOver) {
            System.out.println("Tas icin 0 \n Makas icin 1 \n Kagit icin 2");
            int myGuess=scan.nextInt();
            int comGuess=new Random().nextInt(3);
            System.out.println("Benim Tahminim="+myGuess +"\n"+"Bilgisayarin Tahmini="+comGuess);

            if(myGuess==comGuess) {
                System.out.println("berabere");
            }else if((myGuess==0  && comGuess==1) || (myGuess==1 && comGuess==2) || (myGuess==2  && comGuess==0)) {
                System.out.println("kazandiniz");
                numberOfMyWin++;
            }else {
                System.out.println("bilgisayar kazandi ");
                numberOfComWin++;
            }

        }

        if(numberOfMyWin==3) {
            System.out.println("========Game over=========");
            System.out.println("sizin kazandiginiz="+numberOfMyWin);
            System.out.println("Kaybettiniz="+numberOfComWin);
        }else if (numberOfComWin==3) {
            System.out.println("========Game over=========");
            System.out.println("bilgisayarin kazandigi="+numberOfComWin);
            System.out.println("Kaybettiniz="+numberOfMyWin);
        }



        scan.close();
    }
}
