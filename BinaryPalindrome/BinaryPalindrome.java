package PLA1001;

public class BinaryPalindrome {
    // function to reverse bits of a number
    public static long reverseBits(long n) {
        long rev = 0;

        // traversing bits of 'n'
        // from the right
        while (n > 0) {
            // bitwise left shift 'rev' by 1
            rev <<= 1;

            // if current bit is '1'
            if ((n & 1) == 1)
                rev ^= 1;

            // bitwise right shift 'n' by 1
            n >>= 1;
        }

        // required number
        return rev;
    }

    // function to check a number
    // is palindrome or not
    public static boolean isPalindrome(long n) {
        // get the number by reversing
        // bits in the binary
        // representation of 'n'
        long rev = reverseBits(n);

        return (n == rev);
    }

    // Driver function
    public static void main(String argc[]) {
        long n = 20;
        if (isPalindrome(n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
/*
 * import java.util.Scanner;
 * 
 * public class BinaryPalindrome {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * int dec = input.nextInt();
 * int rem = 0;
 * int res = 1;
 * int d, e = 0;
 * while (dec != 0) {
 * rem = dec % 2;
 * res = res * 10 + rem;
 * dec = dec / 2;
 * }
 * while (res != 0) {
 * d = res % 10;
 * e = e * 10 + d;
 * res = res / 10;
 * }
 * 
 * int fin = e / 10;
 * System.out.println(fin);
 * 
 * int temp = fin;
 * int rev = 0, r;
 * while (temp > 0) {
 * r = temp % 10;
 * rev = (rev * 10) + r;
 * temp = temp / 10;
 * }
 * 
 * if (fin == rev) {
 * System.out.println("It is Binary Palindrome");
 * } else {
 * System.out.println("It is not Binary Palindrome");
 * }
 * 
 * input.close();
 * }
 * }
 */
