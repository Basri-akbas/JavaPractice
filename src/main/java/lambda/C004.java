package lambda;

import java.util.ArrayList;
import java.util.List;

public class C004 {

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Ali");
        list.add("John");
        list.add("Alexander");
        list.add("Taylor");
        list.add("Ali");
        list.add("Jackson");
        list.add("LackJon");

        // 	4) "J" ile baslayan öğeleri almayın
        list.stream().filter(t->!t.contains("J")).forEach(System.out::println);
        System.out.println("*********************************************************");


        list.stream().filter(t->!t.startsWith("J")).forEach(System.out::println);

    }
}
