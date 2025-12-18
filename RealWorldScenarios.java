import java.util.Scanner;

public class RealWorldScenarios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Voting Age Check");
            System.out.println("2. Loan Eligibility Check");
            System.out.println("3. Traffic Light System");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Voting Age Check
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    if (age >= 18) {
                        System.out.println("Eligible to Vote");
                    } else {
                        System.out.println("Not Eligible to Vote");
                    }
                    break;

                case 2:
                    // Loan Eligibility
                    System.out.print("Enter monthly income: ");
                    double income = sc.nextDouble();

                    System.out.print("Enter credit score: ");
                    int creditScore = sc.nextInt();

                    if (income >= 25000 && creditScore >= 700) {
                        System.out.println("Loan Approved");
                    } else {
                        System.out.println("Loan Rejected");
                    }
                    break;

                case 3:
                    // Traffic Light System
                    System.out.print("Enter traffic light color (Red/Yellow/Green): ");
                    sc.nextLine(); // clear buffer
                    String light = sc.nextLine();

                    if (light.equalsIgnoreCase("Green")) {
                        System.out.println("Go");
                    } else if (light.equalsIgnoreCase("Yellow")) {
                        System.out.println("Get Ready");
                    } else if (light.equalsIgnoreCase("Red")) {
                        System.out.println("Stop");
                    } else {
                        System.out.println("Invalid Color");
                    }
                    break;

                case 4:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
