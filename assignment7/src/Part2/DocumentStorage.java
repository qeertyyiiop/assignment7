package Part2;

import java.util.List;

public interface DocumentStorage {
    void uploadDocument(Document document, User user);
    Document downloadDocument(String documentId, User user);
    void editDocument(String documentId, User user);
    List<Document> searchDocuments(String query, User user);
}

