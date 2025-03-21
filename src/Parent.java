public class Parent {
    private String name;
    private int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Аты: " + name + ", Жашы: " + age);
    }
}
