import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations implements FileOperable {
    @Override
    public void writeToFile(Question question) {

        try {
            String fileName = "src/test.txt";
            FileWriter fw = new FileWriter(fileName, true);
            fw.write(question.toString());
            fw.write("\n");
            fw.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Question readFromFile() throws IOException {


            String result = "";
            String fileName = "src/test.txt";
            FileReader fr = new FileReader(fileName);
            int c;
            while ((c = fr.read()) != -1) {
                result += (char) c;
            }

            String[] array = result.split("\n");
            Question question = new Question(array[0]);
            String[] answers = array[1].split(" ");
            for (int i = 0; i < answers.length; i++) {
                String[]splited = answers[i].split(":");
                question.place(splited[0].split(":")[0].strip(), Boolean.valueOf(answers[1]));
            }

        System.out.println(question);
        return question;
    }


}
