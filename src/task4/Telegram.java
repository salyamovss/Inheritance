package task4;

import java.time.LocalDate;

class Telegram extends Chat {
    private boolean hasSecretChats;
    private int maxChannelUsers;

    public Telegram(LocalDate dateOfIssue, String designColor, boolean hasSecretChats, int maxChannelUsers) {
        super("Telegram", dateOfIssue, designColor);
        this.hasSecretChats = hasSecretChats;
        this.maxChannelUsers = maxChannelUsers;
    }

    public boolean hasSecretChats() {
        return hasSecretChats;
    }

    public int getMaxChannelUsers() {
        return maxChannelUsers;
    }

    public void specialFeature() {
        System.out.println("Telegram позволяет создавать секретные чаты.");
    }
}