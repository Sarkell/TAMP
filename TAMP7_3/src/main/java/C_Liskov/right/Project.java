package C_Liskov.right;

import java.util.List;

public class Project {
    List<Document> documents;
    List<WritableDocument> writableDocuments;

    public void openAll() {
        documents.forEach(Document::open);
    }

    public void saveAll() {
        writableDocuments.forEach(WritableDocument::save);
    }

}
