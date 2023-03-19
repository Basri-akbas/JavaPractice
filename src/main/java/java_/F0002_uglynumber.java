package java_;

import java.util.Scanner;

public class F0002_uglynumber {

    public static void main(String args[])
    {
        System.out.println("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        // Store the input number
        int inputNumber = scan.nextInt();
        checkUglyNumber(inputNumber);
        scan.close();
    }

    public static void checkUglyNumber(int inputNumber)
    {
        int num = inputNumber;
        /* Loop will run until
        num becomes 1 */
        while(num != 1)
        {
            if (num % 2 == 0)
                num /= 2;
            else if (num % 3 == 0)
                num /= 3;
            else if (num % 5 == 0)
                num /= 5;
            else
            {
                System.out.println(inputNumber + " is NOT an Ugly Number");
                /* Come out of the loop,
                method has void return type */
                return;
            }
        }
        System.out.println(inputNumber + " is an Ugly Number");
    }
}
