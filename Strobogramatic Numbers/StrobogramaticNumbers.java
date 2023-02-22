package PLA1001;

import java.util.Scanner;

public class StrobogramaticNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.next();
        char[] arr = new char[x.length()];
        for (int i = 0; i < x.length(); i++) {
            arr[i] = x.charAt(i);
        }
        int n = x.length();
        int k = 1, l = 0;
        int count = 0;
        for (int i = n / 2; i <= n; i++) {
            if (n % 2 == 0) {
                if (arr[i - l] == arr[i + k]) {
                    count++;
                    l++;
                    k++;
                } else if ((arr[i - l] == '6' && arr[i + k] == '9') || (arr[i - l] == '9' && arr[i + k] == '6')) {
                    count++;
                    l++;
                    k++;
                } else {
                    break;
                }
            } else {
                if (arr[i] == '6' || arr[i] == '9') {
                    break;
                } else {
                    if (arr[i - k] == arr[i + k]) {
                        count++;
                        k++;
                    } else if ((arr[i - k] == '6' && arr[i + k] == '9') || (arr[i - k] == '9' && arr[i + k] == '6')) {
                        count++;
                        k++;
                    } else {
                        break;
                    }
                }
            }
        }

        if (count == n / 2) {
            System.out.println("The number is Stobogramatic");
        } else {
            System.out.println("The number is not Stobogramatic");
        }
        input.close();
    }
}
