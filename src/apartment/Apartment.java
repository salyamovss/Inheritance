package apartment;

import java.util.Arrays;

public class Apartment {
    private String title;
    private int price;
    private String address;
    private Student[] students;

    public Apartment() {
    }

    public Apartment(String title, int price, String address, Student[] students) {
        this.title = title;
        this.price = price;
        this.address = address;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public static void getApartment(String title, Apartment[] apartments) {
        for (Apartment apartment : apartments) {
            if (apartment.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Apartment found: " + apartment);
                return;
            }
        }
        System.out.println("Invalid apartment!");
    }

    public void payPerMonth() {
        if (students == null || students.length == 0) {
            System.out.println("No students in this apartment.");
            return;
        }
        int perStudent = price / students.length;
        System.out.println("Each student must pay: " + perStudent + " per month.");
    }

    @Override
    public String toString() {
        String studentsInfo = (students == null || students.length == 0) ? "No students assigned." : Arrays.toString(students);
        return "Apartment{" +
               "title='" + title + '\'' +
               ", price=" + price +
               ", address='" + address + '\'' +
               ", students=" + studentsInfo +
               '}';
    }
}
