import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================================");
        System.out.println("         Digit Frequency Finder - Program              ");
        System.out.println("=======================================================");

        // HINT 1: Take input for a number
        System.out.print("  Enter a Number : ");
        long number = scanner.nextLong();

        // Handle negative numbers by converting to positive
        long absNumber = Math.abs(number);

        System.out.println("=======================================================");

        // HINT 2: Find the count of digits in the number
        int digitCount = String.valueOf(absNumber).length();
        System.out.println("  Number Entered : " + number);
        System.out.println("  Total Digits   : " + digitCount);
        System.out.println("=======================================================");

        // HINT 3: Find the digits in the number and save them in an array
        int[] digitsArray = new int[digitCount];
        long  temp        = absNumber;

        // Extract digits from right to left, then reverse
        for (int i = digitCount - 1; i >= 0; i--) {
            digitsArray[i] = (int)(temp % 10);   // extract last digit
            temp           = temp / 10;           // remove last digit
        }

        // Display extracted digits array
        System.out.print("  Digits Array   : [ ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digitsArray[i]);
            if (i < digitCount - 1) System.out.print(", ");
        }
        System.out.println(" ]");
        System.out.println("=======================================================");

        // HINT 4: Define frequency array of size 10 (digits 0–9)
        int[] frequency = new int[10];

        // Loop through digits array and increase frequency of each digit
        for (int i = 0; i < digitCount; i++) {
            int digit = digitsArray[i];
            frequency[digit]++;          // increment frequency at index = digit
        }

        // HINT 5: Display frequency of each digit in the number
        System.out.println("\n  Digit Frequency Report:");
        System.out.println("-------------------------------------------------------");
        System.out.printf("  %-10s %-15s %-20s%n", "Digit", "Frequency", "Visualization");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i <= 9; i++) {
            if (frequency[i] > 0) {       // Only display digits that appear
                // Build visual bar using stars
                String bar = "*".repeat(frequency[i]);
                System.out.printf("  %-10d %-15d %-20s%n", i, frequency[i], bar);
            }
        }

        System.out.println("-------------------------------------------------------");

        // Summary: most and least frequent digit
        int maxFreq      = 0;
        int minFreq      = Integer.MAX_VALUE;
        int mostFreqDigit  = -1;
        int leastFreqDigit = -1;

        for (int i = 0; i <= 9; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq       = frequency[i];
                mostFreqDigit = i;
            }
            if (frequency[i] > 0 && frequency[i] < minFreq) {
                minFreq        = frequency[i];
                leastFreqDigit = i;
            }
        }

        System.out.println("\n  Summary:");
        System.out.println("  Most  Frequent Digit : " + mostFreqDigit
                         + "  (appears " + maxFreq + " time/s)");
        System.out.println("  Least Frequent Digit : " + leastFreqDigit
                         + "  (appears " + minFreq + " time/s)");
        System.out.println("=======================================================");

        scanner.close();
    }
}
