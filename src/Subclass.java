class Subclass extends Parent{
    private String studentId;
    private String major;

    // Конструктор
    public Subclass(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }
    public void displayStudentInfo() {
        displayInfo();
        System.out.println("Студент ID: " + studentId + ", Адистиги: " + major);
    }
}
