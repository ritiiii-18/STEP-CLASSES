import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {

        // HINT 2: Define double arrays for salary and years of service
        double[] salary         = new double[10];
        double[] yearsOfService = new double[10];

        // HINT 3: Define double arrays for new salary and bonus amount
        double[] newSalary   = new double[10];
        double[] bonusAmount = new double[10];

        // HINT 3: Variables to save total bonus, total old and new salary
        double totalBonus     = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================================");
        System.out.println("       ZARA Employee Bonus Calculator Program          ");
        System.out.println("=======================================================");

        // HINT 4: Loop to take input, re-ask if invalid
        for (int i = 0; i < 10; i++) {
            System.out.println("\n--- Employee " + (i + 1) + " ---");

            // Validate Salary
            System.out.print("  Enter Salary        : ");
            salary[i] = scanner.nextDouble();
            if (salary[i] <= 0) {
                System.out.println("  !! Invalid salary. Please enter a positive number.");
                i--;   // HINT 4: Decrement index to re-enter same employee
                continue;
            }

            // Validate Years of Service
            System.out.print("  Enter Years of Service: ");
            yearsOfService[i] = scanner.nextDouble();
            if (yearsOfService[i] < 0) {
                System.out.println("  !! Invalid years of service. Please enter a non-negative number.");
                i--;   // HINT 4: Decrement index to re-enter same employee
                continue;
            }
        }

        System.out.println("\n=======================================================");
        System.out.println("           Calculating Bonus for Each Employee         ");
        System.out.println("=======================================================");

        // HINT 5: Loop to calculate bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {

            // HINT 1: 5% bonus if years of service > 5, else 2%
            double bonusRate;
            if (yearsOfService[i] > 5) {
                bonusRate = 0.05;   // 5%
            } else {
                bonusRate = 0.02;   // 2%
            }

            // HINT 5: Calculate and store bonus amount
            bonusAmount[i] = salary[i] * bonusRate;

            // HINT 5: Calculate and store new salary
            newSalary[i] = salary[i] + bonusAmount[i];

            // HINT 5: Accumulate totals
            totalBonus     += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // HINT 6: Print individual employee details
        System.out.println("\n=======================================================");
        System.out.printf("%-6s %-12s %-10s %-10s %-12s %-12s%n",
                           "Emp#", "Old Salary", "Yrs Svc", "Bonus%",
                           "Bonus Amt", "New Salary");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            String bonusPct = (yearsOfService[i] > 5) ? "5%" : "2%";
            System.out.printf("%-6d %-12.2f %-10.1f %-10s %-12.2f %-12.2f%n",
                    (i + 1),
                    salary[i],
                    yearsOfService[i],
                    bonusPct,
                    bonusAmount[i],
                    newSalary[i]);
        }

        // HINT 6: Print total bonus payout, total old and new salary
        System.out.println("=======================================================");
        System.out.printf("  Total Old Salary  : $%,.2f%n", totalOldSalary);
        System.out.printf("  Total Bonus Payout: $%,.2f%n", totalBonus);
        System.out.printf("  Total New Salary  : $%,.2f%n", totalNewSalary);
        System.out.println("=======================================================");

        scanner.close();
    }
}
