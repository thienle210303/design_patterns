package state;

public class SecondGradeState extends State{
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
    }

    public void increaseGrade() {
        this.spellingList.setState(this.spellingList.getThirdGradeState());
    }

    public void decreaseGrade() {
        this.spellingList.setState(this.spellingList.getFirstGradeState());        
    }
}
