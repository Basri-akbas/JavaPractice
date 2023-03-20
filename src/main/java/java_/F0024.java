package java_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F0024 {

    /*

    We are organizing a horse race with horses having distinct strengths.
    The strength of the horses is represented by an array of integers.
    In order to make the race competitive,  your program should find out the pair of
    horses with similar str
    Farkl� g��leri olan atlarla bir at yar��� d�zenliyor. Atlar�n g�c� bir tamsay� dizi assign  edilirse.
    bir birine yak�n g��lere sahip at �iftlerini bulunuz.
    For example :{3, 67, 9, 46, 55, 48}
    output : 46,48

     */
    static List<Integer> yeniList= new ArrayList<>();

    public static void main(String[] args) {

        Integer [] arr={3, 67, 9, 46, 55, 48,70,71,68};
        List<Integer> list=new ArrayList<>(Arrays.asList(arr));

        atCifti(list);

        System.out.println(yeniList);



    }
    public static void atCifti(List<Integer> list) {
        atlarArasiFarklar(list);
        int min=Integer.MAX_VALUE;
        int index=0;
        for (int i=0;i<yeniList.size();i=i+3) {

            if (yeniList.get(i)<min) {
                min=yeniList.get(i);
                index=i;
            }
        }
        System.out.println("Iki at arasindaki guc farki:"+min+"\n"+"1.atin gucu:"+yeniList.get(index+1)+"\n"+"2.atin gucu:"+yeniList.get(index+2));
    }

    public static void atlarArasiFarklar(List<Integer> list) {
        for (int i = 0; i < list.size()-1; i++) {
            int min=Integer.MAX_VALUE;
            int y=0;
            int z=0;
            for (int j = i+1; j < list.size(); j++) {
                int sonuc=list.get(i)-list.get(j);
                if (sonuc<0 ) {
                    sonuc=-sonuc;
                    if (sonuc<min) {
                        min=sonuc;
                        z=list.get(j);
                    }
                }else if(sonuc<min){
                    min=sonuc;
                    z=list.get(j);
                }
                y=list.get(i);


            }
            yeniList.add(min);
            yeniList.add(y);
            yeniList.add(z);
        }

    }
}
