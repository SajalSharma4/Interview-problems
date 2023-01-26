package PLA1001;

import java.util.Scanner;

public class BankCompareProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principal, interest, sum, emi, val;
        int tenure, slabs, period;
        int index = 0;
        double[] bank = new double[2];

        // getting the principal (Loan Amount)
        principal = input.nextDouble();

        // getting the tenure year
        tenure = input.nextInt();
        System.out.println("Tenure is : " + tenure);

        // getting the number of slabs for both banks
        for (int k = 0; k < 2; k++) {
            slabs = input.nextInt();
            sum = 0;
            for (int i = 0; i < slabs; i++) {
                // getting the time period
                period = input.nextInt();
                // getting the interest
                interest = input.nextDouble();
                val = Math.pow((1 + interest), period * 12);
                // calculating the EMI
                emi = (principal * (interest)) / (1 - 1 / val);
                // adding the monthly EMI to total sum
                sum = sum + emi;
            }
            // adding final value is array
            bank[index++] = sum;
        }

        // comparing the values and printing the output
        if (bank[0] < bank[1]) {
            System.out.println("Bank A");
        } else {
            System.out.println("Bank B");
        }

        input.close();
    }

}

/*
 * package PLA1001;
 * 
 * import java.util.Scanner;
 * 
 * public class BankCompareProblem {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * double principal, interest,sum, emi, val;
 * int tenure, slabs, period, index = 0;
 * double[] bank = new double[5];
 * System.out.println("Enter the principal amount");
 * principal = input.nextDouble();
 * System.out.println("Enter tenature year");
 * tenure = input.nextInt();
 * for (int k = 0; k < 2; k++) {
 * System.out.println("Enter the no of slabs");
 * slabs = input.nextInt();
 * sum = 0;
 * for (int i = 0; i < slabs; i++) {
 * System.out.println("Enter the period :");
 * period = input.nextInt();
 * System.out.println("Enter the interest :");
 * interest = input.nextDouble();
 * val = Math.pow((1 + interest), period * 12);
 * emi = (principal * (interest)) / (1 - 1 / val);
 * sum = sum + emi;
 * }
 * bank[index++] = sum;
 * }
 * if (bank[0] < bank[1]) {
 * System.out.println("Bank A");
 * } else {
 * System.out.println("Bank B");
 * }
 * 
 * input.close();
 * }
 * 
 * }
 */