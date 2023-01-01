import java.io.FileWriter;
import java.io.IOException;

public class FileOperations implements Printable{
    @Override
    public void writeToFile(Tester tester) {
        String fileName = "src/tester.txt";
        try{
            FileWriter fw = new FileWriter(fileName);

            fw.write(tester.showTester());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void readFromFile(Tester tester) {

    }
}
