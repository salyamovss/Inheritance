package apartment;

import java.util.Arrays;
import java.util.Scanner;

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
    public void getApartment(String title, Apartment[] apartments){
        for (Apartment apartment : apartments){
            if (apartment.getTitle().equals(title)){
                System.out.println("apartment = " + apartment);
                break;
            }else {
                System.out.println("invalid apartment");
            }
        }
    }




    @Override
    public String toString() {
        return "Apartment{" +
               "title='" + title + '\'' +
               ", price=" + price +
               ", address='" + address + '\'' +
               ", students=" + Arrays.toString(students) +
               '}';
    }
}
