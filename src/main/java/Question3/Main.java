package Question3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String jsonStr = "{\"integer\": \"123456789123456789123456789\", \"float\": \"12345.6789123456789123456789\", \"list\": [\"1.1\", \"2.2\", \"3.3\"] }";
        try {
            Object parsedObject = JsonParserUtility.parseJsonWithPrecision(jsonStr);
            System.out.println(parsedObject);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
