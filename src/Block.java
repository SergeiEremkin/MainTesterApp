import java.util.HashMap;

public class Block {

    private HashMap<String,Answer > blocks;

    public Block(){
        this.blocks = new HashMap<String,Answer>();
    }

    public void addBlock(String question, Answer answer){
        blocks.put(question,answer);
    }

}
