package codeSignal;

import java.util.Arrays;

public class F00011_islucky {

    /*
    Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
solution(n) = true;
For n = 239017, the output should be
solution(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.
     */

    public static void main(String[] args) {

        System.out.println(solution(1230));


    }

    public static boolean solution(int n) {
        // Bilet numarasının sayılarını bir diziye ayırın
        int[] digits = String.valueOf(n).chars().map(Character::getNumericValue).toArray();

        Arrays.stream(digits).forEach(System.out::println);
        // Sayıların yarısını alın ve iki yarısının toplamını karşılaştırın
        int firstHalfSum = 0, secondHalfSum = 0;
        for (int i = 0; i < digits.length / 2; i++) {
            firstHalfSum += digits[i];
            secondHalfSum += digits[i + digits.length / 2];
        }

        return firstHalfSum == secondHalfSum;
    }

}
