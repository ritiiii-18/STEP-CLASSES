import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter Time (years): ");
        double time = sc.nextDouble();

        // Calling the method
        double si = calculateSI(principal, rate, time);

        System.out.println("The Simple Interest is " + si + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time);
    }

    // Method to calculate simple interest
    public static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}
