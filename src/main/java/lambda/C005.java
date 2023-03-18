package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C005 {

    //  {"A", "B", "D", "C", "B", "A", "A", "B", "B"} gibi bir array oluşturun;
//  Tekrarlanan öğeleri konsolda yazdırın
    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();
        list.add("A");
        list.add("AA");
        list.add("B");
        list.add("CC");
        list.add("BB");
        list.add("AA");
        list.add("ED");
        list.add("CC");
        list.add("BB");
        list.add("DD");
        list.add("D");
        list.add("CA");
        list.add("CA");
        list.add("CA");

        //List<String> tekrarsiz=list.stream().distinct().collect(Collectors.toList());

        list.stream()
                .distinct()
                .filter(t->list.stream()
                        .filter(x->x.equals(t))
                .count()>1)
                .forEach(System.out::println);


        //Arrays
        String[] arr = {"A", "B", "D", "C", "B", "A", "A", "B", "B"};

        List<String> list1=Arrays.asList(arr);

        Arrays.stream(arr)
                .distinct()
                .filter(item -> Arrays.stream(arr)
                        .filter(x -> x.equals(item))
                        .count() > 1)
                .forEach(System.out::println);

    }
}
