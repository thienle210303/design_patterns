package state;
// import java.util.ArrayList;

public class FirstGradeState extends State{
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/assest/first.txt");
        
    }

    public void increaseGrade() {
        System.out.println("You are up to second grade");
        this.spellingList.setState(this.spellingList.getSecondGradeState());
    }

    public void decreaseGrade() {
        System.out.println("This is lowest grade. You can't go any lower");
    }
}
