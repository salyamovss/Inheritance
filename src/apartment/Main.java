package apartment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Student 1", "123456789", "Address1", 1500);
        Student student2 = new Student("Student 2", "987654321", "Address1", 1200);
        Student student3 = new Student("Student 3", "112233445", "Address1", 1800);

        Student student4 = new Student("Student 4", "556677889", "Address2", 2000);
        Student student5 = new Student("Student 5", "998877665", "Address2", 1700);
        Student student6 = new Student("Student 6", "443322110", "Address2", 1900);

        Student[] apartment1Students = {student1, student2, student3};
        Student[] apartment2Students = {student4, student5, student6};

        Apartment apartment1 = new Apartment("Apartment 1", 4500, "Address1", apartment1Students);
        Apartment apartment2 = new Apartment("Apartment 2", 5400, "Address2", apartment2Students);

        Apartment[] apartments = {apartment1, apartment2};

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("******************************************");
            System.out.println("Welcome to the Apartment System");
            System.out.println("1. Show apartment and students");
            System.out.println("2. Calculate monthly rent per student");
            System.out.println("3. Calculate how many months a student can live");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter apartment name: ");
                    String apartmentName = scanner.nextLine();
                    Apartment.getApartment(apartmentName, apartments);
                    break;

                case 2:
                    System.out.print("Enter apartment name to calculate rent: ");
                    apartmentName = scanner.nextLine();
                    for (Apartment apartment : apartments) {
                        if (apartment.getTitle().equalsIgnoreCase(apartmentName)) {
                            for (Student student : apartment.getStudents()) {
                                System.out.println(student.getFullName() + " has to pay: " + student.getPayPerMonth(apartment) + " per month.");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to calculate months of living: ");
                    String studentName = scanner.nextLine();
                    for (Apartment apartment : apartments) {
                        for (Student student : apartment.getStudents()) {
                            if (student.getFullName().equalsIgnoreCase(studentName)) {
                                System.out.println(studentName + " can live for " + student.liveIn(apartment) + " months in " + apartment.getTitle());
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the system.");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
