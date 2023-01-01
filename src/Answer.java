import java.util.HashMap;
import java.util.Map;

public class Answer {

    private String text;
    private Boolean isTrue;

    private Map<String, Boolean> answers;

    public Answer() {
        this.answers = new HashMap<String, Boolean>();

    }

    public void addAnswer(String text, Boolean isTrue) {
        answers.put(text, isTrue);
    }

    public String showAnswers() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Boolean> answer : answers.entrySet()) {
            sb.append(answer.getKey() + ":" + answer.getValue());
        }
        return sb.toString();

    }
}


