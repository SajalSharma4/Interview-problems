package PLA1001;

import java.util.Scanner;

public class SegmentedSieve {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting point : ");
        int low = input.nextInt();
        System.out.print("Enter the ending point : ");
        int high = input.nextInt();

        int arr[] = new int[high - low + 1];
        boolean isPrime[] = new boolean[high - low + 1];

        for (int i = 0; i < high - low + 1; i++) {
            arr[i] = i + low;
            isPrime[i] = true;
        }

        double x = Math.sqrt(high);
        int val = (int) Math.floor(x);

        int[] xarr = new int[val];
        boolean[] xisPrime = new boolean[val];
        for (int i = 1; i < val + 1; i++) {
            xarr[i - 1] = i;
            xisPrime[i - 1] = true;
        }

        xisPrime = SimpleSieve.Simple_Sieve(isPrime, val);

        for (int i = 0; i < high - low + 1; i++) {
            for (int j = 0; j < val - 1; j++) {
                if (xisPrime[j] == true) {
                    if (arr[i] % xarr[j] == 0) {
                        isPrime[i] = false;
                    }
                }
            }
        }

        System.out.print("The Prime Numbers are : ");
        for (int i = 0; i < high - low + 1; i++) {
            if (isPrime[i] == true) {
                System.out.print(arr[i] + " ");
            }
        }

        input.close();
    }
}
