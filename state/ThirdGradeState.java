package state;

public class ThirdGradeState extends State {
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/assest/third.txt");
    }

    public void increaseGrade() {
        System.err.println("This is highest grade. You can't go any higher");
    }

    public void decreaseGrade() {
        System.out.println("You are down to second grade");
        this.spellingList.setState(this.spellingList.getSecondGradeState());
    }
}
