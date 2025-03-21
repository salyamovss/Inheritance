
public class Main {
    public static void main(String[] args) {
        Subclass student = new Subclass("Аман", 20, "S12345", "Компьютердик илимдер");
        System.out.println("Студенттин маалыматы:");
        student.displayStudentInfo();

        System.out.println();

        Subclass1 teacher = new Subclass1("Бекболот", 45, "Математика", 20);
        Subclass1 teacher1 = new Subclass1("Symbat", 18);

        System.out.println("Мугалимдин маалыматы:");
        teacher1.displayTeacherInfo();
        teacher.displayTeacherInfo();
    }
}