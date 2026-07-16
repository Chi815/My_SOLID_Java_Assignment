package org.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class NotificationTest {

    @Test
    void testSMSNotification() {
        Notification notification = new SMSNotification();

        assertDoesNotThrow(() -> notification.send());
    }

    @Test
    void testEmailNotification() {
        Notification notification = new EmailNotification();

        assertDoesNotThrow(() -> notification.send());
    }

    @Test
    void testWhatsAppNotification() {
        Notification notification = new WhatsAppNotification();
        assertDoesNotThrow(() -> notification.send());
    }
}