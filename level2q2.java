import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {

        // HINT 1: Define arrays for names, ages, and heights
        String[] names   = {"Amar", "Akbar", "Anthony"};
        int[]    age     = new int[3];
        double[] height  = new double[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================================");
        System.out.println("     Youngest & Tallest Friend Finder - Program        ");
        System.out.println("=======================================================");

        // HINT 1: Take user input for age and height for all 3 friends
        for (int i = 0; i < names.length; i++) {
            System.out.println("\n--- " + names[i] + " ---");

            // Validate Age
            System.out.print("  Enter Age    (years) : ");
            age[i] = scanner.nextInt();
            if (age[i] <= 0) {
                System.out.println("  !! Invalid age. Please enter a positive number.");
                i--;
                continue;
            }

            // Validate Height
            System.out.print("  Enter Height (cm)    : ");
            height[i] = scanner.nextDouble();
            if (height[i] <= 0) {
                System.out.println("  !! Invalid height. Please enter a positive number.");
                i--;
                continue;
            }
        }

        // HINT 2: Loop through array to find youngest and tallest
        int youngestIndex = 0;   // Assume first friend is youngest
        int tallestIndex  = 0;   // Assume first friend is tallest

        for (int i = 1; i < names.length; i++) {

            // Find youngest: compare ages
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            // Find tallest: compare heights
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // HINT 3: Display individual details of all 3 friends
        System.out.println("\n=======================================================");
        System.out.printf("%-10s %-15s %-15s%n", "Friend", "Age (years)", "Height (cm)");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-10s %-15d %-15.1f%n",
                    names[i], age[i], height[i]);
        }

        // HINT 3: Display youngest and tallest friend
        System.out.println("=======================================================");
        System.out.println("\n  🏅 Youngest Friend : " + names[youngestIndex]
                         + " (Age: "    + age[youngestIndex]
                         + " years)");

        System.out.println("  🏅 Tallest  Friend : " + names[tallestIndex]
                         + " (Height: " + height[tallestIndex]
                         + " cm)");

        System.out.println("\n=======================================================");

        scanner.close();
    }
}
