package PLA1001;

public class GCD {
    public static int HCF(int a, int b) {
        int x;
        while (b != 0) {
            x = b;
            b = a % b;
            a = x;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 13, b = 26;
        int GCD = HCF(a, b);
        System.out.println("GCD = " + GCD);
    }
}