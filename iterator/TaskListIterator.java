package iterator;
import java.util.Iterator;

/**
 * This class implements an iterator for traversing through a list of tickets.
 * It allows iterating over the tickets in a task list.
 * @author Thien Le
 */
public class TaskListIterator implements Iterator<Ticket>{
    private Ticket[] tickets;
    private int position;

    /**
     * Constructs a TaskListIterator object with an array of tickets.
     * @param tickets the array of tickets to iterate over
     */
    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        this.position = 0;
    }

    /**
     * Checks if there are more tickets to iterate over.
     * @return true if there are more tickets, false otherwise
     */
    public boolean hasNext() {
        return this.position < this.tickets.length;
    }

    /**
     * Returns the next ticket in the iteration.
     * @return the next ticket in the iteration
     */
    public Ticket next() {
        return this.tickets[this.position++];

    }
}
