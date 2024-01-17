package observer;
import java.util.ArrayList;

/**
 * Sighting class represents a sighting report.
 */
public class Sighting {
    private String location;
    private String details;
    private ArrayList<String> accomplices;

    /**
     * Constructor for the Sighting class.
     * @param location     The location of the sighting.
     * @param details      The details or notes associated with the sighting.
     * @param accomplices  A list of accomplices related to the sighting.
     */
    public Sighting(String location, String details, ArrayList<String> accomplices) {
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }
    
    /**
     * Retrieves the location of the sighting.
     * @return The location of the sighting.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Retrieves the details or notes associated with the sighting.
     * @return The details or notes of the sighting.
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * Retrieves a formatted string containing the list of accomplices.
     * @return A formatted string with the list of accomplices.
     */
    public String getAccomplices() {
        StringBuilder result = new StringBuilder();
        for (String acc : this.accomplices) {
            if (result.length() != 0) {
                result.append(", ");
            }
            result.append(acc);
        }
        return result.toString();
    }
}
