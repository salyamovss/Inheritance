package apartment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Aizat", "+996700700818", "Tunguch", 30000);
        Student student2 = new Student("asan", "+996700700818", "Tunguch", 20000);
        Student student3 = new Student("uson", "+996700700818", "Tunguch", 6000);
        Student student4 = new Student("Nurik", "+996700700818", "asanbai", 15000);
        Student student5 = new Student("Mukha", "+996700700818", "asanbai", 30000);
        Student student6 = new Student("Joni", "+996700700818", "asanbai", 18000);

        Student[] students1 = {student1,student2,student3};
        Student[] students2 = {student4,student5,student6};

        Apartment apartment1 = new Apartment("apartment1", 30000, "Tunguch",students1);
        Apartment apartment2 = new Apartment("apartment2", 50000, "asanbai",students2);

        Apartment[] apartments = {apartment1,apartment2};
        System.out.print("write the apartment: ");
        String consoleTitle = new Scanner(System.in).nextLine();
        apartment1.getApartment(consoleTitle, apartments);

        System.out.println("student3.getPayPerMonth(apartments) = " + student3.getPayPerMonth(apartments));
        System.out.println("student3.liveIn(students1,apartments) = " + student3.liveIn(students1, apartments));
    }
}
