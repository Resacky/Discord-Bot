import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonObject;

import java.io.*;

public class JsonReader {

    public static String getKeyValue(String key) {
        String value = "";

        Reader reader;

        try {
            reader = new BufferedReader(new FileReader("config.json"));
            JsonObject object = Json.parse(reader).asObject();

            if (object.get(key) == null) {

                throw new IOException();

            }

            value = object.get(key).asString();
            reader.close();

        } catch (IOException e) {
            System.err.println("The config file is missing");
        }

        return value;
    }

    public static boolean fileExist() {
        return new File("config.json").exists();
    }
}
