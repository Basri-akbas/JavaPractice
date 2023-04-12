package java_;

import java.util.Arrays;

public class F0036 {

    public static void main(String[] args) {
    /*
		 * Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların toplamını birer birer bulan
			ve herbir sonucu yeni bir array’in elemanı yapan ve yeni array’i ekrana yazdıran bir program yazınız
			{ {1,2,3}, {4,5}, {6,7} }
			Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
		 */

        int[][] arr = { {1,2,3}, {4,5}, {6,7} };
        int[] sums = new int[arr.length]; // Yeni dizi oluşturulur.
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) { // Her bir iç dizi taranır.
                sum += arr[i][j]; // Toplam hesaplanır.
            }
            sums[i] = sum; // Yeni dizide saklanır.
        }
        // Yeni dizi yazdırılır.
        System.out.print("{ " + sums[0]);
        for (int i = 1; i < sums.length; i++) {
            System.out.print(", " + sums[i]);
        }
        System.out.println(" }");

    }


}
