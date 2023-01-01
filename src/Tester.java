
import java.util.HashMap;
import java.util.Map;

public class Tester {
    private Question question;
    private Answer answer;

    private Map<Question, Answer> test;

    public Tester()
    {
        this.test = new HashMap<Question, Answer>();
    }

    public void addQuestion(Question question, Answer answer){
        test.put(question,answer);
    }

    public String showTester(){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Question,Answer> entry:this.test.entrySet())
              {
                  sb.append(entry.getKey());

                  sb.append(entry.getValue().showAnswers());

        }
        System.out.println(sb.toString());
        return sb.toString();
    }




}

