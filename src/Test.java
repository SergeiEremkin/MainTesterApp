import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    private final String name;

    private final ArrayList<Block> tester;

    public Test(String name){
        this.name = name;
        this.tester = new ArrayList<Block>();
    }

    public void addBlock(Block block){
        tester.add(block);
    }
    public String getName() {
        return name;
    }
}
