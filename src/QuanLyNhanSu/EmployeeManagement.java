package QuanLyNhanSu;

import java.util.ArrayList;
import java.util.Scanner;

import QuanLyNhanSu.Employee;
import QuanLyNhanSu.Experience;
import QuanLyNhanSu.Fresher;
import QuanLyNhanSu.Intern;

public class EmployeeManagement {
    private ArrayList<Employee> employees;
    private Scanner scanner;

    public EmployeeManagement() {
        employees = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void inputEmployee() {
        System.out.println("Enter employee type (1-Experience, 2-Fresher, 3-Intern): ");
        int type = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter ID: ");
        String id = scanner.nextLine();

        System.out.println("Enter Full Name: ");
        String fullName = scanner.nextLine();

        System.out.println("Enter Birth Day: ");
        String birthDay = scanner.nextLine();

        System.out.println("Enter Phone: ");
        String phone = scanner.nextLine();

        System.out.println("Enter Email: ");
        String email = scanner.nextLine();

        switch (type) {
            case 1:
                System.out.println("Enter Experience in Year: ");
                int expInYear = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.println("Enter Professional Skill: ");
                String proSkill = scanner.nextLine();

                employees.add(new Experience(id, fullName, birthDay, phone, email, expInYear, proSkill));
                break;
            case 2:
                System.out.println("Enter Graduation Date: ");
                String graduationDate = scanner.nextLine();

                System.out.println("Enter Graduation Rank: ");
                String graduationRank = scanner.nextLine();

                System.out.println("Enter Education: ");
                String education = scanner.nextLine();

                employees.add(new Fresher(id, fullName, birthDay, phone, email, graduationDate, graduationRank, education));
                break;
            case 3:
                System.out.println("Enter Majors: ");
                String majors = scanner.nextLine();

                System.out.println("Enter Semester: ");
                String semester = scanner.nextLine();

                System.out.println("Enter University Name: ");
                String universityName = scanner.nextLine();

                employees.add(new Intern(id, fullName, birthDay, phone, email, majors, semester, universityName));
                break;
            default:
                System.out.println("Invalid employee type.");
                break;
        }
    }

    public void showEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }

        System.out.println("List of Employees:");
        for (Employee employee : employees) {
            employee.showInfo();
            System.out.println();
        }
    }

}