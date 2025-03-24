import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String args[]) {
        int option;
        do {
            System.out.println("\n ---- Student Management System ----");
            System.out.println("---- Please enter 1 to add student, 2 to display details, 3 to search student, or 4 to Quit ----");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next(); 
            }

            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option, please choose between 1-4.");
            }
        } while (option != 4);
    }

    private static void addStudent() {
        System.out.print("Please enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Please enter Student Age: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid age.");
            scanner.next();
        }
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Please enter Student Address: ");
        String address = scanner.nextLine();

        System.out.print("Please enter Student Major: ");
        String major = scanner.nextLine();

        System.out.print("Please enter Student GPA: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid GPA.");
            scanner.next();
        }
        double GPA = scanner.nextDouble();
        scanner.nextLine(); 

        students.add(new Student(name, age, address, major, GPA));
        System.out.println("Student information added successfully.");
    }

    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void searchStudent() {
        System.out.print("Enter student name to search: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
