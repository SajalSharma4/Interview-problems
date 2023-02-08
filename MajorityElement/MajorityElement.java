package PLA1001;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 4, 4, 3, 2, 1, 3, 4 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > (n / 2)) {
                System.out.print(arr[i]);
            }
        }
    }
}
