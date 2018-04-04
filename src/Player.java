import java.util.List;

public class Player implements Runnable {
    private String name;
    private Game game;

    Player(String name) {
        this.name = name;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        boolean stillPlaying = true;
        while (stillPlaying) {
            try {
                stillPlaying = createSubmitWord();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", game=" + game +
                '}';
    }
}