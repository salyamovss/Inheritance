package task1;

public class Daughter extends Mother{
    private String hairColor;
    private int height;

    public Daughter() {
    }

    public Daughter(String name, int age, String eyeColor, String hairColor, int height) {
        super(name, age, eyeColor);
        this.hairColor = hairColor;
        this.height = height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getNameOf() {
        return getName() + "this is dauhgter";
    }

    @Override
    public String toString() {
        return "Daughter{" +
               "hairColor='" + hairColor + '\'' +
               ", height=" + height +
               '}';
    }
}
