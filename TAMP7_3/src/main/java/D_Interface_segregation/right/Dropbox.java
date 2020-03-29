package D_Interface_segregation.right;

public class Dropbox implements CloudStorageProvider {
    @Override
    public void storeFile(String name) {
        // Do smth
    }

    @Override
    public void getFile(String name) {
        // Do smth

    }
}
