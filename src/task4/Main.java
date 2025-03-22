package task4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Главный класс
public class Main {
    public static void main(String[] args) {
        List<Chat> chats = new ArrayList<>();
        chats.add(new WhatsApp(LocalDate.of(2019, 5, 10), "Зеленый", true, 256));
        chats.add(new Telegram(LocalDate.of(2021, 8, 15), "Синий", true, 200000));

        for (Chat chat : chats) {
            chat.printChatInfo();
            System.out.println("Чат новый: " + chat.isNewChat());
        }
    }
}

