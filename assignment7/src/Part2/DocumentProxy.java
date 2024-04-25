package Part2;

import java.util.Collections;
import java.util.List;

public class DocumentProxy implements DocumentStorage {
    private RealDocumentStorage realDocumentStorage;

    public DocumentProxy(RealDocumentStorage realDocumentStorage) {
        this.realDocumentStorage = realDocumentStorage;
    }

    @Override
    public void uploadDocument(Document document, User user) {
        if (user.getPermissions().contains("upload")) {
            realDocumentStorage.uploadDocument(document, user);
        } else {
            System.out.println("User does not have permission to upload documents.");
        }
    }

    @Override
    public Document downloadDocument(String documentId, User user) {
        if (user.getPermissions().contains("download")) {
            return realDocumentStorage.downloadDocument(documentId, user);
        } else {
            System.out.println("User does not have permission to download documents.");
            return null;
        }
    }

    @Override
    public void editDocument(String documentId, User user) {
        if (user.getPermissions().contains("edit")) {
            realDocumentStorage.editDocument(documentId, user);
        } else {
            System.out.println("User does not have permission to edit documents.");
        }
    }

    @Override
    public List<Document> searchDocuments(String query, User user) {
        if (user.getPermissions().contains("search")) {
            return realDocumentStorage.searchDocuments(query, user);
        } else {
            System.out.println("User does not have permission to search documents.");
            return Collections.emptyList();
        }
    }
}
