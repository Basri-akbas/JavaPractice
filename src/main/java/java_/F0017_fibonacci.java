package java_;

import java.util.ArrayList;
import java.util.List;

public class F0017_fibonacci {

    /*
	Fibonacci dizisi create ediniz.
	*/
    static List<Integer> fibonaccilist=new ArrayList<>();
    public static void main(String[] args) {

        int sayi=1000;
        fibonaccilist.add(1);
        fibonaccilist.add(1);

        fibonacci(sayi);
        System.out.println(fibonaccilist);

    }
    private static void fibonacci(int sayi) {
        int fb=0;
        for(int i=0;fb<sayi;i++) {
            fb=fibonaccilist.get(i)+fibonaccilist.get(i+1);
            fibonaccilist.add(fb);
        }
        fibonaccilist.remove(fibonaccilist.size()-1);
    }
}
