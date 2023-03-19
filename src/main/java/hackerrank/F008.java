package hackerrank;

import java.util.Arrays;

public class F008 {

    public static void main(String[] args) {
        String str = new String("Welcome to Java");
        char[] array= str.toCharArray();
        System.out.println(Arrays.toString(array));
        for (char w:array) {
            System.out.print(w);
        }

        System.out.println();
        String str1=String.join("-","You","are","Awesome");
        System.out.println(str1);   //You-are-Awesome

       /* List list<String> = Arrays.asList("Steve", "Rick", "Peter", "Abbey");
        String names = String.join(" | ", list);
        System.out.println(names); //Steve | Rick | Peter | Abbey
        */
    }
}
