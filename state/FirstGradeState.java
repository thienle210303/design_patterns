package state;
import java.util.ArrayList;

public class FirstGradeState extends State{
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        ArrayList<String> words = FileReader.getWords("state/assest/first.txt");

    }

    public void increaseGrade() {
        this.spellingList.setState(this.spellingList.getSecondGradeState());
    }

    public void decreaseGrade() {
        // Error
        //this.spellingList.setState(this.spellingList.getThirdGradeState());
    }
}
