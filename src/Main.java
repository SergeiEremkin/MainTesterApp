public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester();
        Question question = new Question("Сколько стоит рыба?");
        Answer answer = new Answer();
        Question question2 = new Question("Когда это происходит?");
        Answer answer2 = new Answer();
        answer2.addAnswer("днём", true);
        answer2.addAnswer("вечером", false);
        answer2.addAnswer("в обед", true);
        answer.addAnswer("50", true);
        answer.addAnswer("26", false);
        answer.addAnswer("56", false);
        tester.addQuestion(question, answer);
        tester.addQuestion(question2, answer2);
        FileOperations operations = new FileOperations();
        operations.writeToFile(tester);

        tester.showTester();

    }
}