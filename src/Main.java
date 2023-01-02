import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Question question = new Question("Сколько стоит рыба?");
        question.place("50", true);
        question.place("26", false);
        question.place("56", false);
        Question question2 = new Question("Когда это происходит?");
        question2.place("днём", true);
        question2.place("вечером", false);
        question2.place("в обед", true);
        FileOperations operations = new FileOperations();
        operations.writeToFile(question);
        operations.writeToFile(question2);
       operations.readFromFile();



    }
}