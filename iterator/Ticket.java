package iterator;

/**
 * This class represents a ticket in a task list.
 * It contains information such as name, team member, and difficulty level.
 * @author Thien Le
 */
public class Ticket {
    private String name;
    private String teamMember;
    private int difficulty;

    /**
     * Constructs a Ticket object with specified name, team member, and difficulty.
     * @param name the name of the ticket
     * @param teamMember the team member assigned to the ticket
     * @param difficulty the difficulty level of the ticket
    */
    public Ticket(String name, String teamMember, int difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    /**
     * Retrieves the name of the ticket.
     * @return the name of the ticket
    */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the ticket.
     * @return a string containing the name, difficulty, and team member of the ticket
    */
    public String toString() {
        return "- " + this.name + "(" + this.difficulty+ "): " + this.teamMember + "\n";
    }
}
