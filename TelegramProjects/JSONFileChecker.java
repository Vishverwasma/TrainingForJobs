package TelegramProjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JSONFileChecker {
    public static void main(String[] args) {
        String filePath = "D:\\Batch 8\\File JSON or Not\\isJSON.txt";
        String filePath1 = "D:\\Batch 8\\File JSON or Not\\isNotJSON.txt";
                 // Replace this with the path to your JSON file
        try {
            boolean isJSON = isJSONFormat(filePath);
            if (isJSON) {
                System.out.println("The file format is JSON.");
            } else {
                System.out.println("The file format is not JSON.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isJSONFormat(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        try {
            String line = reader.readLine();
            if (line != null) {
                line = line.trim();
                return line.startsWith("{") || line.startsWith("[");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return false;
    }
}

