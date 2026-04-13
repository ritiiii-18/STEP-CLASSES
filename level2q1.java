import java.util.*;

public class FactorsProgram {

    // Method to find factors and return array
    static int[] getFactors(int n) {
        int count = 0;

        // First loop to count factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        // Create array
        int[] factors = new int[count];

        // Second loop to store factors
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Sum of factors
    static int getSum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    // Product of factors
    static int getProduct(int[] arr) {
        int product = 1;
        for (int x : arr) {
            product *= x;
        }
        return product;
    }

    // Sum of squares of factors
    static double getSquareSum(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.println("Factors are:");
        for (int x : factors) {
            System.out.print(x + " ");
        }

        System.out.println("\nSum = " + getSum(factors));
        System.out.println("Product = " + getProduct(factors));
        System.out.println("Sum of Squares = " + getSquareSum(factors));
    }
}
