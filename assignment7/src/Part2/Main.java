package Part2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = new User("user1", "password", Arrays.asList("upload", "download", "edit", "search"));
        RealDocumentStorage realDocumentStorage = new RealDocumentStorage();

        DocumentProxy documentProxy = new DocumentProxy(realDocumentStorage);

        Document document = new Document("123", "Test Document", "Test Content");
        documentProxy.uploadDocument(document, user);
        Document downloadedDocument = documentProxy.downloadDocument("123", user);
        System.out.println("Downloaded Document: " + downloadedDocument.getTitle());
        documentProxy.editDocument("123", user);
        documentProxy.searchDocuments("test", user);
    }
}

