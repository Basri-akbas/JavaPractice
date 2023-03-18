package lambda;

import java.util.ArrayList;
import java.util.List;

public class C007 {

    //String isimlerden olusan bir list olusturnuz

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();

        list.add("Abuziddin");
        list.add("Mehmet");
        list.add("Nazmiye");
        list.add("Nedime");
        list.add("Bedrettin");
        list.add("Bahattin");
        list.add("Abdulkereim");
        list.add("Jonaten");
        list.add("Mikail");
        list.add("Veliuddin");

        //List'deki isimlerden "a" ve "n" icerenlerin harf sayilarinin toplamini ekrana yazdiriniz
       int sum= list.stream()
               .map(t->t.toLowerCase())
               .filter(t->t.contains("a") && t.contains("n"))
               .mapToInt(t->t.length())
               .sum();
        System.out.println(sum);

        //List'deki isimlerden ilk harfi son harfinden alfabetik olarak onde olan isimleri ekrana yazdirin
        list.stream()
                .map(t->t.toLowerCase())
                .filter(t->t.charAt(0)<t.charAt(t.length()-1))
                .sorted()
                .forEach(System.out::println);


    }
}
