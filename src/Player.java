import java.util.List;

public class Player implements Runnable {
    private String name;
    private Game game;
    private boolean createSubmitWord() throws InterruptedException {
        List extracted = game.getBag().extractLetters(1);
        if (extracted.isEmpty()) {
            return false;
        }
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            word.append(extracted.get(0));
        }
        game.getBoard().addWord(this, word.toString());
        Thread.sleep(300);
        return true;
    }
    //implement the run() method, that will repeatedly create and submit words
    //implement the toString() method
}