package D_Interface_segregation.right;

public interface CloudStorageProvider {
    void storeFile(String name);
    void getFile(String name);
}
