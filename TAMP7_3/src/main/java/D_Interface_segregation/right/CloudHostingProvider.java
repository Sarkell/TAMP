package D_Interface_segregation.right;

public interface CloudHostingProvider {
    void createServer(String region);
    void listServer(String region);
}
