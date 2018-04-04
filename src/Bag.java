import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bag {
    private final Queue<Character> letters = new LinkedList<>();
    public Bag() { }
    public synchronized List<Character> extractLetters(int howMany) {
        // Replace the dots so that the bag is thread-safe
        List<Character> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if (letters.isEmpty()) break;
            extracted.add(letters.poll());
        }
        return extracted;
    }
}