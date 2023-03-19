package hackerrank;

import java.util.Scanner;

public class F004 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        String x=A.substring(0,1).toUpperCase() + A.substring(1);
        String y=B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(x+" "+y);
    }
}
