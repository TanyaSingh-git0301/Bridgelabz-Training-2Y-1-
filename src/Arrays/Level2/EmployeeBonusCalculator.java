package Arrays.Level2;

import java.util.Scanner;

class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEmployees = 10;

        // Arrays to store employee data
        double[] salary = new double[totalEmployees];
        double[] yearsOfService = new double[totalEmployees];
        double[] bonusAmount = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];

        // Variables for total amounts
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonusPayout = 0;

        // Take input from user with validation
        System.out.println("Enter the salary and years of service for 10 employees:\n");
        for (int i = 0; i < totalEmployees; i++) {
            System.out.print("Employee " + (i + 1) + " - Enter Salary: ");
            double sal = scanner.nextDouble();

            System.out.print("Employee " + (i + 1) + " - Enter Years of Service: ");
            double yrs = scanner.nextDouble();

            // Input validation: re-prompt if salary or service years are negative
            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input! Salary must be > 0 and service years >= 0. Please re-enter.");
                i--; // Decrement index counter to re-take input for the same employee
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yrs;
        }

        // Calculate bonus, new salary, and running totals
        for (int i = 0; i < totalEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05; // 5% bonus for > 5 years
            } else {
                bonusAmount[i] = salary[i] * 0.02; // 2% bonus for <= 5 years
            }

            newSalary[i] = salary[i] + bonusAmount[i];

            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonusPayout += bonusAmount[i];
        }

        // Display individual employee details
        System.out.println("\n--- Employee Salary Details ---");
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("Emp " + (i + 1) + " | Old Salary: $" + salary[i] +
                    " | Years of Service: " + yearsOfService[i] +
                    " | Bonus: $" + bonusAmount[i] +
                    " | New Salary: $" + newSalary[i]);
        }

        // Display total payouts for Zara
        System.out.println("\n--- Total Company Payout Summary (Zara) ---");
        System.out.println("Total Old Salary Payout: $" + totalOldSalary);
        System.out.println("Total Bonus Payout: $" + totalBonusPayout);
        System.out.println("Total New Salary Payout: $" + totalNewSalary);

        scanner.close();
    }
}
