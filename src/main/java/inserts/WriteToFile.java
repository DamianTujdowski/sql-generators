package inserts;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {

    private String path;

    public void write(String data) {
        try {
            FileOutputStream output = new FileOutputStream(path);
            output.write(data.getBytes());
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setPath(String path) {
        this.path = path;
    }
}
