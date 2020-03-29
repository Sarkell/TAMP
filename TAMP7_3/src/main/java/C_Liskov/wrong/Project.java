package C_Liskov.wrong;

import java.util.List;

public class Project {
    List<Document> documents;

    public void openAll() {
        documents.forEach(Document::open);
    }

    public void saveAll() {
        documents.stream().filter(d -> d instanceof ReadOnlyDocument).forEach(Document::save);
    }

}
