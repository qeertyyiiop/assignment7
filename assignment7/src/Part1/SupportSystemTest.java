package Part1;

import org.junit.Test;

public class SupportSystemTest {
    @Test
    public void testSupportSystem() {
        SupportSystem supportSystem = new SupportSystem();

        SupportTicket highPriorityTicket = new SupportTicket("123", "Проблема с оборудованием", Priority.HIGH);
        SupportTicket lowPriorityTicket = new SupportTicket("456", "Проблема с программным обеспечением", Priority.LOW);

        supportSystem.processSupportTicket(highPriorityTicket);
        supportSystem.processSupportTicket(lowPriorityTicket);
    }
}

