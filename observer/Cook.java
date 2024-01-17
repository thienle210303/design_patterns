package observer;
import java.util.ArrayList;

/**
 * The Cook class implements the Subject interface to allow observers (Police) to receive updates
 * about sightings. It maintains a list of observers and notifies them when a sighting is reported.
 * @author Thien Le
 */
public class Cook implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    /**
     * Constructor for the Cook class.
     * @param name The name of the cook.
     */
    public Cook(String name) {
        this.observers = new ArrayList<>();
        this.name = name;
    }

    /**
     * Adds an observer to the list of observers.
     * @param observer The observer to be added.
     */
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * Removes an observer from the list of observers.
     * @param observer The observer to be removed.
     */
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * Notifies all observers with the details of a sighting.
     * @param location     The location of the sighting.
     * @param description  The description or notes associated with the sighting.
     * @param accomplices  A list of accomplices related to the sighting.
     */
    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        Observer temp;
        for (int i = 0; i < observers.size(); i++) {
            temp = observers.get(i);
            temp.update(location, description, accomplices);
        }
    }

    /**
     * Records a new sighting and notifies observers about it.
     * @param location     The location of the sighting.
     * @param description  The description or notes associated with the sighting.
     * @param accomplices  A comma-separated string of accomplices related to the sighting.
     */
    public void enterSighting(String location, String description, String accomplices) {
        String[] accomp = accomplices.split(", ");
        ArrayList<String> newAccomplices = new ArrayList<>();
        for (String acc : accomp) {
            newAccomplices.add(acc);
        }
        notifyObservers(location, description, newAccomplices);
    }

    /**
     * Retrieves the name of the cook.
     * @return The name of the cook.
     */
    public String getName() {
        return this.name;
    }
}
