package iterator;

/**
 * This class represents a SCRUM board for managing tasks in a project.
 * It contains three task lists: todo, doing, and done.
 * @author Thien Le
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;
    
    /**
     * Constructs a SCRUMBoard object with a specified project name.
     * Initializes todo, doing, and done task lists.
     * @param projectName the name of the project
     */
    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        this.todo = new TaskList(projectName);
        this.doing = new TaskList(projectName);
        this.done = new TaskList(projectName);
    }

    /**
     * Adds a new ticket to the todo list.
     * @param name the name of the ticket
     * @param teamMember the team member assigned to the ticket
     * @param difficulty the difficulty level of the ticket
    */
    public void addTicket(String name, String teamMember, int difficulty)
    {
        todo.addTicket(name, teamMember, difficulty);
    }

    /**
     * Moves a ticket from the todo list to the doing list.
     * @param name the name of the ticket to start
     * @return true if the ticket is successfully started, false otherwise
    */
    public boolean startTicket(String name) {
        Ticket temp = this.todo.getTicket(name);
        if (temp == null) {
            return false;
        }
        this.doing.addTicket(temp);
        return true;
    }

    /**
     * Moves a ticket from the doing list to the done list.
     * @param name the name of the ticket to finish
     * @return true if the ticket is successfully finished, false otherwise
    */
    public boolean finishTicket(String name) {
        Ticket temp = this.doing.getTicket(name);
        if (temp == null) {
            return false;
        }
        this.done.addTicket(temp);
        return true;
    }

    /**
     * Returns a string representation of the SCRUM board, including todo, doing, and done lists.
     * @return a string containing the project name and task lists
    */
    public String toString() {
        StringBuilder resultSTR = new StringBuilder();
        resultSTR.append("***** " + this.projectName + " *****\n");
        resultSTR.append("Todo:\n");
        resultSTR.append(todo.toString());
        resultSTR.append("\nDoing:\n");
        resultSTR.append(doing.toString());
        resultSTR.append("\nDone:\n");
        resultSTR.append(done.toString());
        return resultSTR.toString();
    }
}
