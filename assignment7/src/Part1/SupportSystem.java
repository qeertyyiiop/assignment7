package Part1;

public class SupportSystem {
    private SupportHandler supportHandler;

    public SupportSystem() {
        // Создаем цепь обработчиков
        HighPrioritySupportHandler highPriorityHandler = new HighPrioritySupportHandler();
        LowPrioritySupportHandler lowPriorityHandler = new LowPrioritySupportHandler();

        // Устанавливаем связи между обработчиками
        highPriorityHandler.setNextHandler(lowPriorityHandler);

        // Устанавливаем обработчик высшего уровня в качестве начала цепи
        supportHandler = highPriorityHandler;
    }

    public void processSupportTicket(SupportTicket ticket) {
        supportHandler.handleRequest(ticket);
    }
}

