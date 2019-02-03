import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        StoreReadData storeReadData = new StoreReadData();
        storeReadData.setData("123456","London");
        storeReadData.setData("222222","Copenhagen");
        storeReadData.setData("321321","Helsingborg");
        storeReadData.setData("154456","Prague");
        storeReadData.setData("124685","New York");
        storeReadData.readData();
    }
}

