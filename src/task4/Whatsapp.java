package task4;

import java.time.LocalDate;

class WhatsApp extends Chat {
    private boolean hasVoiceMessages;
    private int maxGroupSize;

    public WhatsApp(LocalDate dateOfIssue, String designColor, boolean hasVoiceMessages, int maxGroupSize) {
        super("WhatsApp", dateOfIssue, designColor);
        this.hasVoiceMessages = hasVoiceMessages;
        this.maxGroupSize = maxGroupSize;
    }

    public boolean hasVoiceMessages() {
        return hasVoiceMessages;
    }

    public int getMaxGroupSize() {
        return maxGroupSize;
    }

    public void specialFeature() {
        System.out.println("WhatsApp поддерживает голосовые сообщения.");
    }
}