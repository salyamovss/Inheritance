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

    public int getPayPerMonth(Apartment apartment) {
        if (apartment.getStudents() != null && apartment.getStudents().length > 0) {
            // Делим цену квартиры на количество студентов, живущих в ней
            return apartment.getPrice() / apartment.getStudents().length;
        }
        return 0;
    }

    public int liveIn(Apartment apartment) {
        int monthlyRent = getPayPerMonth(apartment);
        if (monthlyRent > 0) {
            return bankAccount / monthlyRent;
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
