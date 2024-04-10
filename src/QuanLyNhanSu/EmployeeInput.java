package QuanLyNhanSu;

import java.util.Scanner;

import QuanLyNhanSu.EmployeeManagement;

public class EmployeeInput {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Input Employee");
            System.out.println("2. Show Employees");
            System.out.println("3. Exit");
            System.out.println("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    management.inputEmployee();
                    break;
                case 2:
                    management.showEmployees();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        scanner.close();
    }
}