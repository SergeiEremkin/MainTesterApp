public class Question {
    private int id;
    private String text;

    public Question(String text){
        this.id = 1;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return String.format("%s", getText());
    }
}
