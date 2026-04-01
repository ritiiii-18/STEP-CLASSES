import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {

        // HINT 1: Define an integer array of 5 elements and get user input
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       Enter 5 Numbers Program          ");
        System.out.println("========================================");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\n========================================");
        System.out.println("         Checking Each Number           ");
        System.out.println("========================================");

        // HINT 2 & 3: Loop through the array using length
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("\nNumber[" + i + "] = " + numbers[i]);

            if (numbers[i] > 0) {
                // HINT 2: Positive → check Even or Odd
                System.out.println("  → Positive number");
                if (numbers[i] % 2 == 0) {
                    System.out.println("  → Even number");
                } else {
                    System.out.println("  → Odd number");
                }

            } else if (numbers[i] < 0) {
                // HINT 3: Negative
                System.out.println("  → Negative number");

            } else {
                // HINT 3: Zero
                System.out.println("  → Zero");
            }
        }

        // HINT 4: Compare first and last elements
        System.out.println("\n========================================");
        System.out.println("   Comparing First and Last Elements    ");
        System.out.println("========================================");

        int first = numbers[0];
        int last  = numbers[numbers.length - 1];

        System.out.println("First Element : " + first);
        System.out.println("Last Element  : " + last);

        if (first == last) {
            System.out.println("Result        : First element EQUALS the last element");
        } else if (first > last) {
            System.out.println("Result        : First element is GREATER than the last element");
        } else {
            System.out.println("Result        : First element is LESS than the last element");
        }

        System.out.println("========================================");

        scanner.close();
    }
}
