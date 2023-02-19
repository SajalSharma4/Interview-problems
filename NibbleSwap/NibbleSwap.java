package PLA1001;

import java.util.Scanner;

public class NibbleSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = (num & 0xf0) >> 4;
        int b = (num & 0x0f) << 4;
        int c = a | b;
        System.out.println(c);
        sc.close();
    }
}