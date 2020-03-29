package D_Interface_segregation.wrong;

public class Amazon implements CloudProvider {
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
