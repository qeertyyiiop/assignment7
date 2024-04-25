package Part1;

public class SupportTicket {
    private String id;
    private String description;
    private Priority priority;

    public SupportTicket(String id, String description, Priority priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
    }

    // Геттеры и сеттеры

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}

