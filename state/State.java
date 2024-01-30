package state;

import java.util.ArrayList;
import java.util.Random;

public abstract class State {
    protected SpellingList spellingList;
    private ArrayList<String> words;
    private Random rand;

    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        this.words = new ArrayList<>();
        this.rand = new Random();
    }

    public String getNextWord() {
        Integer index = rand.nextInt(this.words.size());
        System.out.println(index);
        return words.get(index);

    }

    public void increaseGrade() {}

    public void decreaseGrade() {}

}
