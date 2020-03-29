package D_Interface_segregation.right;

public class Amazon implements CloudHostingProvider, CDNProvider, CloudStorageProvider {
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
        // Do smth
    }

    @Override
    public void listServer(String region) {
        // Do smth
    }

    @Override
    public void getCDNAddress() {
        // Do smth
    }
}
