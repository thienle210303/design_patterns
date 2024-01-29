package state;

public class FirstGradeState extends State{
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
    }

    public void increaseGrade() {
        this.spellingList.setState(this.spellingList.getSecondGradeState());
    }

    public void decreaseGrade() {
        // Error
        //this.spellingList.setState(this.spellingList.getThirdGradeState());
    }
}
