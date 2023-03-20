package java_;

import java.util.Arrays;

public class F0027 {

    /*
   Ebay Interview Question:
   Put all zeros to end in a integer array
   Bir tamsay� dizisinde t�m s�f�rlar� sona koyan bir program create ediniz.

   input : {3, 0, 4, 2, 0}
   output: {3, 4, 2, 0, 0}
    */
    public static void main(String[] args) {
        int []arr={3, 0, 4, 2, 0};
        int []arr2=new int[arr.length];
        int uzunluk=arr.length-1;
        Arrays.sort(arr);
        int a=0;
        for (int i =uzunluk; i >=0 ; i--) {

            arr2[a]=arr[i];
            a++;
        }

        for (int i : arr2) {
            System.out.print(i);
        }
    }


}
