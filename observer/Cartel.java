package observer;
import java.util.ArrayList;

/**
 * The Cartel class implements the Observer interface to observe sightings reported by a Cook.
 * It maintains a log of sightings including locations, details, and accomplices.
 * Each sighting is represented as a Sighting object.
 * @author Thien Le
 */
public class Cartel implements Observer {
    private Subject cook;
    private ArrayList<Sighting> sightings;

    /**
     * Constructor for the Cartel class.
     * @param cook The Subject (Cook) to observe.
     */
    public Cartel(Subject cook) {
        this.sightings = new ArrayList<>();
        this.cook = cook;
        cook.registerObserver(this);
    }

    /**
     * Updates the Cartel log based on the information provided in a sighting report.
     * @param location     The location of the sighting.
     * @param description  The description or notes associated with the sighting.
     * @param accomplices  A list of accomplices related to the sighting.
     */
    public void update(String location, String description, ArrayList<String> accomplices) {
        Sighting temp = new Sighting(location, description, accomplices);
        this.sightings.add(temp);
    }

    /**
     * Retrieves the log of the Cartel observations, including locations, details, and accomplices.
     * @return A formatted string containing the log information.
     */
    public String getLog() {
        StringBuilder result = new StringBuilder();
        Sighting sighting;
            for (int i = 0; i < this.sightings.size(); i++)
        {
            sighting = this.sightings.get(i);
            String temp = sighting.getLocation() + " (" + sighting.getDetails() + "), with " + sighting.getAccomplices();
            result.append(temp);
            if(i != this.sightings.size()-1) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}
