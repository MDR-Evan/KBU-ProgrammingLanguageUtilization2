import java.io.IOException;

public interface Method {
    int basic() throws IOException;
    int fee();
    int tax();
    int pay();
}
