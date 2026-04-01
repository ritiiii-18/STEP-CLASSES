import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // HINT 1: Get integer input and store in number variable
        //         Define integer array to store results (1 to 10)
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("       Multiplication Table Program       ");
        System.out.println("==========================================");

        System.out.print("Enter a number to generate its table: ");
        int number = scanner.nextInt();

        // Define array of size 10 to store multiplication results
        int[] multiTable = new int[10];

        // HINT 2: Run a loop from 1 to 10 and store results in array
        for (int i = 1; i <= 10; i++) {
            multiTable[i - 1] = number * i;  // store at index 0 to 9
        }

        // HINT 3: Display results from the array in the required format
        System.out.println("\n==========================================");
        System.out.println("    Multiplication Table of " + number);
        System.out.println("==========================================");

        for (int i = 1; i <= 10; i++) {
            System.out.println("  " + number + " x " + i + " = " + multiTable[i - 1]);
        }

        System.out.println("==========================================");

        scanner.close();
    }
}
