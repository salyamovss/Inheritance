
class Subclass1 extends Parent {
    private String subject;
    private int experienceYears;

    public Subclass1 (String name, int age, String subject, int experienceYears) {
        super(name, age);
        this.subject = subject;
        this.experienceYears = experienceYears;
    }
    public Subclass1(String name, int age) {
        super(name, age);
    }

    public void displayTeacherInfo() {
        displayInfo();
        System.out.println("Сабагы: " + subject + ", Тажрыйбасы: " + experienceYears + " жыл");
    }
}