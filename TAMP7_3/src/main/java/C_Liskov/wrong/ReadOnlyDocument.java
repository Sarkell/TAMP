package C_Liskov.wrong;

public class ReadOnlyDocument extends Document {
    public void save() throws Exception {
        throw new Exception("Unable to save read-only file");
    }

    ;
}
