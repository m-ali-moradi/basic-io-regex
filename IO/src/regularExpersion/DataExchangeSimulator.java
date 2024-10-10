package regularExpersion;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class DataExchangeSimulator {
	public void byteStreamExample(String fileName) throws IOException {
        byte[] data = {1, 2, 3, 4, 5};
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(data);
        fos.close();
    }

    public void characterStreamExample(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }

}
