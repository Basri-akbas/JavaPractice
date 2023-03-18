package lambda;

import java.util.stream.IntStream;

public class C008 {
    // 7 ile bolunebilen ilk 10 tamsayinin toplamini ekrana yazdiriniz.

    public static void main(String[] args) {

        int sum = IntStream.iterate(7, n -> n + 7)
                .limit(10)
                .sum();

        System.out.println("7'ye tam bölünebilen ilk 10 sayının toplamı: " + sum);
    }
}
