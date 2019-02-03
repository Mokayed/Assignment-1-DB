import java.io.*;
import java.util.*;
import java.io.RandomAccessFile;

public class StoreReadData {
    HashMap<String, Long> hm = new HashMap<String, Long>();
    File dfile = new File("Countries.bin");
    String mode = "rw";

public void setData(String id, String name) throws IOException {
    RandomAccessFile file = new RandomAccessFile(dfile, mode);
    Long offset;
    String key;
    offset= file.length();
    file.seek(offset);
    file.writeBytes(id+","+"{name:"+" "+name+"}\n");
    file.seek(offset);
    key = file.readLine().split(",")[0];
    hm.put(key,offset);
    System.out.println("hash map:" + " "+ hm);
    }

    public void readData(){
        String string;
        try {
            System.out.println("Enter id to search");
            Scanner sc = new Scanner(System.in);
            String word = sc.next();
            BufferedReader br = new BufferedReader(new FileReader("Countries.bin"));
            while((string = br.readLine()) != null){
                String starr[] = string.split(",");
                for (String string2 : starr) {
                    if(string2.matches(word)){
                        System.out.println("Search result:" +starr[1]);
                    }
                }
            }
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
