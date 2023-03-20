package java_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class F0016_mountenarray {

    /*
	Mauntain Array--> [0, 2, 5, 3, 1] It is constantly increasing to the maximum value, decreasing constantly after the maximum value
	Not Mauntain Array--> [5, 2, 7, 1, 4]
	​
	Bir array elemanlari en buyuk degerine kadar surekli artan, en buyuk degerinden sonra surekli azalan deger aliyorsa Mauntain Array'dir
	 */

    public static void main(String[] args) {
        int arr[] = {0,1, 2,3, 5,6,5,4, 3, 1,0};
        List<Integer> list = new ArrayList<>();

        for (int w : arr) {
            list.add(w);
        }
        System.out.println(list);
        Arrays.sort(arr);
        int maxeleman=arr[arr.length-1];
        int uzunluk=arr.length;

        List<Integer>ilkList=new ArrayList<>();
        for (int i=0;i<=list.indexOf(maxeleman);i++) {
            ilkList.add(list.get(i));
        }System.out.println("1="+ilkList);

        List<Integer>ilkListsirali=new ArrayList<>();
        for (Integer w : ilkList) {
            ilkListsirali.add(w);
        }
        Collections.sort(ilkListsirali);
        if(ilkList.equals(ilkListsirali)) {
            System.out.println("Ilk kosul saglandi");
            System.out.println("2="+ilkListsirali);
        }


        List<Integer>sonList=new ArrayList<>();
        for (int i=list.indexOf(maxeleman);i<list.size();i++) {
            sonList.add(list.get(i));
        }
        System.out.println("3="+sonList);

        List<Integer>sonListsirali=new ArrayList<>();
        for (Integer w : sonList) {
            sonListsirali.add(w);
        }


        Collections.sort(sonListsirali);
        System.out.println("4="+sonListsirali);
        Collections.reverse(sonListsirali);

        System.out.println("5="+sonListsirali);

        if(sonList.equals(sonListsirali)) {
            System.out.println("Ikinci kosul saglandi");

        }



        if (ilkList.equals(ilkListsirali) && sonList.equals(sonListsirali)) {
            System.out.println("Array MOUNTAIN ARRAY'dir");
        } else System.out.println(" xxxx Array MOUNTAIN ARRAY degildir !!! ");

    }
}
