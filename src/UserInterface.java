
import java.util.Scanner;

public class UserInterface {
    public Test createTest() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Приступаем к созданию теста...");
        System.out.println("Введите название теста: ");
        String name = scanner.nextLine();
        Test test = new Test(name);
        System.out.println("Тест" + " " + test.getName() + " " + "создан");
        return test;
    }

    public void addQuestion() {
        Test test = createTest();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Теперь нужно заполнить тест вопросами...");
        System.out.println("Сколько будет вопросов?");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count ; i++) {
            System.out.println("Введите вопрос ");
            String question = scanner.nextLine();
            System.out.println("Ответ" + " " + "создан");
            Answer answer = addAnswers();
            Block block = new Block();
            block.addBlock(question,answer);
            test.addBlock(block);
        }
    }

    public Answer addAnswers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько ответов будет на вопрос?");
        int count = Integer.parseInt(scanner.nextLine());
        Answer answers = new Answer();
        for (int i = 0; i < count; i++) {
            System.out.println("Нужно вести ответ на вопрос и указать верный он или нет.");
            System.out.println("Введите ответ ");
            String answer = scanner.nextLine();
            boolean isRight = isRight();
            answers.addAnswer(answer,isRight);
        }
        return answers;
    }

    public boolean isRight(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это правильный ответ на вопрос?");
        System.out.println("1 - правильный, 2 - неправильный");
        String input = scanner.nextLine();
        if (input.equals("1")){
            return true;
        }
        return false;
    }
}
