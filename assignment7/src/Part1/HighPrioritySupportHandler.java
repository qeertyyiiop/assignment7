package Part1;

public class HighPrioritySupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void handleRequest(SupportTicket ticket) {
        if (ticket.getPriority() == Priority.HIGH) {
            // Обработка запроса
        } else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        } else {
            // Запрос не может быть обработан
        }
    }

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

