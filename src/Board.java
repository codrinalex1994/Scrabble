import java.util.ArrayList;
import java.util.HashMap;

public class Board {
    private HashMap<String, String> wordsMap;

    void addWord(Player player, String word) {
        wordsMap.put(player.getName(), word);
    }
}
