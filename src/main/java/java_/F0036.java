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

        int ar1[][]= {{1,2,3},{4,5},{6,7}};
        int ar2[]=new int[ar1.length];


        Comparable<Arrays> arr=ar1.
        for(int i=0;i<ar1.length;i++) {
            int sum=0;
            for(int j=0;j<ar1[i].length;j++) {
                sum=sum+ar1[i][j];
            }
            ar2[i]=sum;
        }

        System.out.println(Arrays.toString(ar2));

    }


}
