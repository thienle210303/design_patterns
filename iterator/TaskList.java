package iterator;

/**
 * This class represents a task list.
 * It allows adding, retrieving, and iterating through tickets.
 * @author Thien Le
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    /**
     * Constructs a TaskList object with a specified name.
     * @param name the name of the task list
     */
    public TaskList(String name) {
        tickets = new Ticket[100];
        this.name = name;
        this.count = 0;
    }

    /**
     * Adds a ticket to the task list.
     * @param name the name of the ticket
     * @param teamMember the team member assigned to the ticket
     * @param difficulty the difficulty level of the ticket
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        if (count == 99)
            System.err.println("ERROR - exceed 100 capacity");
        Ticket newTicket = new Ticket(name, teamMember, difficulty);
        this.addTicket(newTicket);
    }

    /**
     * Adds a ticket to the task list.
     * @param ticket the ticket to add
     */
    public void addTicket(Ticket ticket) {
        this.tickets[count++] = ticket;
    }

    /**
     * Retrieves a ticket from the task list based on its name.
     * @param name the name of the ticket to retrieve
     * @return the ticket with the specified name
     */
    public Ticket getTicket(String name) {
        int index = 0;
        for(Ticket ticket: this.tickets) {
            if(ticket == null || ticket.getName().equals(name)) {
                break;
            }
            index++;
        }

        Ticket result = this.tickets[index];
        for(int i = index; i < this.tickets.length-1; i++) {
            this.tickets[i] = this.tickets[i+1];
        }
        
        this.count--;
        return result;
    }

    /**
     * Creates an iterator for traversing the task list.
     * @return a TaskListIterator object
     */
    public TaskListIterator createIterator() {
        return new TaskListIterator(this.tickets);
    }

    /**
     * Returns a string representation of the task list.
     * @return a string containing all tickets in the task list
     */
    public String toString() {
        StringBuilder resultSTR = new StringBuilder();
        TaskListIterator iter = createIterator();
        while(iter.hasNext()) {
            Ticket temp = iter.next();
            if (temp == null) {
                break;
            }
            resultSTR.append(temp.toString());
        }

        return resultSTR.toString();
    }
}
