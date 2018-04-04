import java.util.ArrayList;
import java.util.HashMap;

public class Board {
    private HashMap<String, String> wordsMap;

    Board(){
        wordsMap = new HashMap<>();
    }

    public synchronized void addWord(Player player, String word) {
        System.out.println(player.getName() + " submitted the word " + word);
        wordsMap.put(player.getName(), word);
    }
}
