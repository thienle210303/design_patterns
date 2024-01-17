package observer;
import java.util.ArrayList;

/**
 * @author Thien Le
 * Observer interface for Police and Cartel class
 */
public interface Observer {
    public void update(String location, String description, ArrayList<String> accomplices);
    public String getLog();
}
