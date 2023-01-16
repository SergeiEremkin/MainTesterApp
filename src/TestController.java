import java.util.Scanner;

public class TestController {
     private UserInterface userInterface = new UserInterface();
    public void start() {
        String userInput = "";
        while (!userInput.equals("3")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Добро пожаловать в программу 'Тестировщик'");
            System.out.println("1 - создать тест\n2 - пройти тест\n3 - выход");
            userInput = scanner.nextLine();
            switch (userInput) {
                case ("1"):
                    userInterface.addQuestion();
                    break;
                case ("2"):

                case ("3"):
                    System.out.println("Спасибо за использованние программы 'Тетсировщик'");
                    System.out.println("До скорых встреч...");
                    break;
            }
        }

    }
}
