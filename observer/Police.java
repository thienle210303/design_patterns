package observer;
import java.util.ArrayList;

/**
 * Police class implements Observer interface
 * @author Thien Le
 */
public class Police implements Observer {
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    /** 
     * Constructor for the Police class
     * @param cook The Subject to observe.
    */
    public Police(Subject cook) {
        this.locations = new ArrayList<>();
        this.notes = "";
        this.people = new ArrayList<>();
        this.cook = cook;
        cook.registerObserver(this);
    }

    /**
     * Updates the Police log based on the information provided in a sighting report.
     * @param location     The location of the sighting.
     * @param description  The description or notes associated with the sighting.
     * @param accomplices  A list of accomplices related to the sighting.
     */
    public void update(String location, String description, ArrayList<String> accomplices) {
        this.locations.add(location);
        this.notes += notes != "" ? ";" + description : description;
        
        boolean isPresent;
        for(String accomplice : accomplices) {
            isPresent = false;
            for(String peo : people) {
                if(accomplice.equalsIgnoreCase(peo)) {
                    isPresent = true;
                }
            }
            if(!isPresent) {
                people.add(accomplice);
            }
        }
    }

    /**
     * Retrieves the log of the Police.
     * @return A formatted string containing the log information.
     */
    public String getLog() {
        String locationSTR = "Locations:";
        for (String location: this.locations) {
            locationSTR += "\n- " + location;
        }

        String noteSTR = "Notes:";
        String[] notes = this.notes.split(";");
        for (String note : notes) {
            noteSTR += "\n- " + note;
        }

        String accSTR = "Accomplices:";
        for (String peo : this.people) {
            accSTR += "\n- " + peo;
        }
        
        return locationSTR + "\n\n" + noteSTR + "\n\n" + accSTR + "\n";
    }
}
