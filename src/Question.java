import java.util.HashMap;
import java.util.Map;

public class Question {
    private int id;
    private String textQuestion;

    private String textAnswer;

    private Boolean isTrue;

    private Map<String, Boolean> answers;


    public Question(String textQuestion){
        this.textQuestion = textQuestion;
        this.answers = new HashMap<String, Boolean>();

    }

    public String getTextQuestion() {
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
    }

    public void place(String textAnswer, Boolean isTrue){
        answers.put(textAnswer, isTrue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(textQuestion);
        sb.append("\n");
        for (Map.Entry<String, Boolean> answer : answers.entrySet()) {
            sb.append(answer.getKey() + ":" + answer.getValue()+ " ");


        }
        return sb.toString();

    }
}
