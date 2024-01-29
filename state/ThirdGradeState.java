package state;

public class ThirdGradeState extends State {
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
    }

    public void increaseGrade() {
        // Error
    }

    public void decreaseGrade() {
        this.spellingList.setState(this.spellingList.getSecondGradeState());
    }
}
