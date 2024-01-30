package state;

public class SecondGradeState extends State{
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/assest/second.txt");
    }

    public void increaseGrade() {
        System.out.println("You are up to third grade");
        this.spellingList.setState(this.spellingList.getThirdGradeState());
    }

    public void decreaseGrade() {
        System.out.println("You are down to first grade");
        this.spellingList.setState(this.spellingList.getFirstGradeState());        
    }
}
