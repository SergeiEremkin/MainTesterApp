import java.io.IOException;

public interface FileOperable {
    public void writeToFile(Question question);
    public Question readFromFile() throws IOException;
}

