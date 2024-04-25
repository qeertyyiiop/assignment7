package Part2;

import java.util.Arrays;
import java.util.List;

public class RealDocumentStorage implements DocumentStorage {
    @Override
    public void uploadDocument(Document document, User user) {
        System.out.println("Document uploaded: " + document.getTitle());
    }

    @Override
    public Document downloadDocument(String documentId, User user) {
        return new Document(documentId, "Sample Document", "Sample Content");
    }

    @Override
    public void editDocument(String documentId, User user) {
        System.out.println("Document edited: " + documentId);
    }

    @Override
    public List<Document> searchDocuments(String query, User user) {
        return Arrays.asList(new Document("1", "Document 1", "Content 1"),
                new Document("2", "Document 2", "Content 2"));
    }
}
