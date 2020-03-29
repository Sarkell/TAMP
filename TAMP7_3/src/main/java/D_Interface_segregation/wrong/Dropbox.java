package D_Interface_segregation.wrong;

public class Dropbox implements CloudProvider {
    @Override
    public void storeFile(String name) {
        // Do smth
    }

    @Override
    public void getFile(String name) {
        // Do smth

    }

    @Override
    public void createServer(String region) {
        // No realization
    }

    @Override
    public void listServer(String region) {
        // No realization
    }

    @Override
    public void getCDNAddress() {
        // No realization
    }
}
