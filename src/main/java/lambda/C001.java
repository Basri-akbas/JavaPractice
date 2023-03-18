package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class C001 {


    public static void main(String[] args) {

            List<String> list=new ArrayList<String>();
            list.add("Ali");
            list.add("Fatma");
            list.add("Zeki");
            list.add("Ayse");
            list.add("Abuziddin");

        System.out.println(list.stream().filter(t->t.length()<5).map(String::toUpperCase).collect(Collectors.toList()));
    }
}

 class C002 {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(6);
        list.add(9);
        list.add(15);
        Collections.sort(list);

        int toplam=list.stream().filter(t->list.indexOf(t)>1).map(t->t*t).reduce(0,(t,u)->t+u);


        int toplam1=list.stream().skip(2).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam+" ----- "+toplam1);
    }
}

