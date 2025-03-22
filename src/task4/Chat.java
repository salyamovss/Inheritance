package task4;

import java.time.LocalDate;

public class Chat {
    private String name;
    private boolean isNew;
    private LocalDate dateOfIssue;
    private String designColor;

    public Chat(String name, LocalDate dateOfIssue, String designColor) {
        this.name = name;
        this.dateOfIssue = dateOfIssue;
        this.designColor = designColor;
        this.isNew = dateOfIssue.isAfter(LocalDate.now().minusYears(5));
    }

    public String getName() {
        return name;
    }

    public String getDesignColor() {
        return designColor;
    }

    public boolean isNewChat() {
        return isNew;
    }

    public void printChatInfo() {
        System.out.println("Чат: " + name + ", Цвет: " + designColor);
    }
}
