package state;

import java.util.ArrayList;
import java.util.Random;

public abstract class State {
    protected SpellingList spellingList;
    private ArrayList<String> words;
    private Random rand;

    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        words = new ArrayList<>();
        rand = new Random();
    }

    public String getNextWord() {
        Integer num = rand.nextInt(words.size());
        return words.get(num);

    }

    public void increaseGrade() {}

    public void decreaseGrade() {}

}