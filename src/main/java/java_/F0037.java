package java_;

public class F0037 {

    /*
		 * Aşağıdaki multi dimensional array’lerin iç array’lerinde aynı index’e sahip elemanların toplamını
			ekrana yazdıran bir program yazınız. (Zor soru)
			arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
		 */

    public static void main(String[] args) {
        int ar1[][]= { {1,2}, {3,4,5}, {6} };

        int ar2[][]= { {7,8,9}, {10,11}, {12} };
        int sum=0;
        for(int i=0;i<ar1.length;i++) {
            for(int j=0;j<ar1[i].length;j++) {
                for(int k=0;k<ar2.length;k++) {
                    //int sum=0;
                    for(int l=0;l<ar2[k].length;l++) {
                        if (i==k && j==l) {
                            sum=sum+(ar1[i][j])+(ar2[k][l]);
                            //	System.out.print(sum+" ");
                        }
                    }
                }
            }
        }
        System.out.print(sum+" ");

    }

}

