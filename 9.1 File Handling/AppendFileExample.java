import java.io.FileWriter;
import java.io.IOException;
class AppendFileExample {
    public static void main(String args[]) {
        try {
            FileWriter writer = new FileWriter("example.txt", true);
            writer.write("\nAppending new data.");
            writer.close();
            System.out.println("Successfully appended data.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}