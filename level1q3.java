import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangular park (in meters):");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();

        double roundsNeeded = computeRounds(s1, s2, s3);

        System.out.printf("To complete a 5 km run, the athlete must complete %.2f rounds.\n", roundsNeeded);
    }

    // Method to compute rounds
    public static double computeRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double targetDistance = 5000; // 5km in meters
        return targetDistance / perimeter;
    }
}
