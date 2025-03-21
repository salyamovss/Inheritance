package Homework;

public class Person {
    private String name;
    private int age;
    private String subject;


    public Person() {
    }

    public Person(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String learn(){
        return "Welcome" + name + "your subject is: " + subject;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", subject='" + subject + '\'' +
               '}';
    }
}
