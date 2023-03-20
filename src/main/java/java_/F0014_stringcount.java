package java_;

import java.util.ArrayList;
import java.util.List;

public class F0014_stringcount {

    /*
    Count the words in a String one by one
	  Girilen bir String'deki kelimeleri tek tek saydiran java code create ediniz.

	  For Example:
	  Input :  String is "Ali came to school and Ayse came to school"
	  Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
 */
    static List<String> kelimeler=new ArrayList<>();

    public static void main(String[] args) {
        String str1="";
        String str="Ali came to school and Ayse came to school";
        //Scanner scan=new Scanner(System.in);
        //String str=scan.nextLine();
        String [] list=str.split(" ");

        int adet=list.length;

        for (int i=0;i<adet;i++) {
            int count=1;
            for(int j=i+1;j<adet;j++) {
                if(list[i].equals(list[j])) {
                    count++;
                }

            }
            if(!str1.contains(list[i])) {
                str1=str1+list[i]+"="+count+", ";
                kelimeler.add(list[i]+"="+count);
            }

        }
        System.out.println(kelimeler.toString());
        System.out.println(str1);
    }
}
