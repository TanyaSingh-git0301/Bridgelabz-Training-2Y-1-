package String.Level3;

import java.util.Scanner;

class BMICalculator {

    // Method to calculate BMI and status for a single person [weight(kg), height(cm)]
    public static String[] calculateBMIAndStatus(double weight, double heightCm) {
        // Convert height from cm to meters
        double heightM = heightCm / 100.0;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Return height, weight, formatted BMI, and status as String array
        return new String[] {
                String.valueOf(heightCm),
                String.valueOf(weight),
                String.format("%.2f", bmi),
                status
        };
    }

    // Method to process 2D array of weight and height and generate 2D String array
    public static String[][] processBMIData(double[][] personData) {
        String[][] bmiResult = new String[personData.length][4];

        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            String[] singlePersonResult = calculateBMIAndStatus(weight, height);

            bmiResult[i][0] = singlePersonResult[0]; // Height
            bmiResult[i][1] = singlePersonResult[1]; // Weight
            bmiResult[i][2] = singlePersonResult[2]; // BMI
            bmiResult[i][3] = singlePersonResult[3]; // Status
        }

        return bmiResult;
    }

    // Method to display the 2D String array in tabular format
    public static void displayBMITable(String[][] bmiData) {
        System.out.println("\n-------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-10s %-12s\n", "Person", "Height (cm)", "Weight (kg)", "BMI", "Status");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%-10d %-15s %-15s %-10s %-12s\n",
                    (i + 1), bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }
        System.out.println("-------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMembers = 10;

        // 2D array: Column 0 = Weight (kg), Column 1 = Height (cm)
        double[][] personData = new double[totalMembers][2];

        System.out.println("Enter details for 10 team members:");
        for (int i = 0; i < totalMembers; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("  Enter Weight (in kg): ");
            double weight = scanner.nextDouble();

            System.out.print("  Enter Height (in cm): ");
            double height = scanner.nextDouble();

            // Input Validation
            if (weight <= 0 || height <= 0) {
                System.out.println("  Invalid input! Weight and Height must be positive numbers. Please re-enter.");
                i--; // Decrement index to retake input for this person
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
        }

        // Process BMI data into 2D String array
        String[][] bmiTable = processBMIData(personData);

        // Display results in tabular format
        displayBMITable(bmiTable);

        scanner.close();
    }
}