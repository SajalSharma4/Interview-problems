package PLA1001;

import java.util.Scanner;

public class SimpleSieve {

    public static boolean[] Simple_Sieve(boolean[] isPrime, int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == true) {
                for (int j = 2 * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the end point : ");
        int n = input.nextInt();
        int[] arr = new int[n + 1];
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = i;
            isPrime[i] = true;
        }

        isPrime = Simple_Sieve(isPrime, n);
        System.out.print("Prime numbers are : ");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == true) {
                System.out.print(arr[i] + " ");
            }
        }
        input.close();

    }
}
