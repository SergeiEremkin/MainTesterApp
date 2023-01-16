import java.util.HashMap;

public class Answer {
    HashMap<String, Boolean> answers;

    public Answer(){
        this.answers = new HashMap<String, Boolean>();
    }

    public void addAnswer(String answer, Boolean isRight) {
        answers.put(answer, isRight);

    }
}
