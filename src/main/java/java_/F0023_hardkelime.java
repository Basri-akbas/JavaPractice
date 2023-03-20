package java_;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class F0023_hardkelime {

    /*
    Char occurences in a String
   input : "aaabbccccddddd"
   output : a3b2c4d5

   verilen bir string'deki tekrarlayan character'leri ve tekrar sayisini yazd�r�n�z.
  */

    static HashMap<String,Integer> harf =new HashMap<>();
    static HashMap<String,Integer>kelime =new HashMap<>();
    public static void main(String[] args) {

        String input="aaabbccccddddd";
        String input1="Java ogrenmek zevkliydi. Java ogrenmek kolay ama tekrar gerekiyor. Java tekrar zevkliydi ama vaktim yoktu.";

        kacHarf(input);
        kacKelime(input1);

    }

    private static void kacHarf(String input) {
        String [] harfler=input.split("");

        List<String>list=Arrays.asList(harfler);

        for (int i=0;i<list.size()-1;i++) {
            int count=1;
            for(int j=i+1;j<list.size();j++) {
                if(harf.containsKey(list.get(i))) {
                    break;
                }else if(list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if(!harf.containsKey(list.get(i))) {
                harf.put(list.get(i), count);
            }

        }

        System.out.println(harf);

    }

    private static void kacKelime(String input1) {
        String [] harfler=input1.replaceAll("\\W", " ").split(" ");

        List<String> list= Arrays.asList(harfler);

        for (int i=0;i<list.size()-1;i++) {
            int count=1;
            for(int j=i+1;j<list.size();j++) {
                if(kelime.containsKey(list.get(i))) {
                    break;
                }else if(list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if(!kelime.containsKey(list.get(i))) {
                kelime.put(list.get(i), count);
            }

        }

        System.out.println(kelime);

    }
}
