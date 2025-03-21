package apartment;

public class Student {
    private String fullName;
    private String phoneNumber;
    private String address;
    private int bankAccount;

    public Student() {
    }

    public Student(String fullName, String phoneNumber, String address, int bankAccount) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bankAccount = bankAccount;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }
    public int getPayPerMonth(Apartment[] apartments) {
        for (Apartment apartment : apartments){
            return apartment.getPrice() / 3;

        }
        return 0;
    }

    public int liveIn(Student[] students,Apartment[] apartments) {
        int apartmentPrice = getPayPerMonth(apartments);
        for (Student student : students) {
            System.out.println("student.bankAccount = " + student.bankAccount);
            return (student.getBankAccount() / apartmentPrice);
        }
        return 0;
    }
    @Override
    public String toString() {
        return "Student{" +
               "fullName='" + fullName + '\'' +
               ", phoneNumber='" + phoneNumber + '\'' +
               ", address='" + address + '\'' +
               ", bankAccount=" + bankAccount +
               '}';
    }
}
