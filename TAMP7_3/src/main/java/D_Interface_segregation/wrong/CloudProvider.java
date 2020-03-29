package D_Interface_segregation.wrong;

public interface CloudProvider {
    void storeFile(String name);
    void getFile(String name);
    void createServer(String region);
    void listServer(String region);
    void getCDNAddress();
}
