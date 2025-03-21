package task1;

public class Main {
    public static void main(String[] args) {

        Mother mother = new Mother("Aliya ", 42, "brown");
        Daughter daughter = new Daughter("Samira ", 19,"blue","green",173);

        System.out.println("daughter.getNameOf() = " + daughter.getNameOf());
        System.out.println("mother.getNameOf() = " + mother.getNameOf());
    }
}
