package state;

public class SpellingList {
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    public SpellingList() {
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
        state = firstGradeState;
    }

    public String getNextWord() {
        return state.getNextWord();
    }

    public void increaseGrade() { state.increaseGrade(); }
    public void decreaseGrade() { state.decreaseGrade(); }

    public State getFirstGradeState() { return this.firstGradeState; }

    public State getSecondGradeState() { return this.secondGradeState; }
    
    public State getThirdGradeState() { return this.thirdGradeState; }

    public void setState(State state) {
        this.state = state;
    }

}