
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author exk
 */
public class OddOccurrencesInArray {

    public int solution(int[] A) {
        Map<Integer, Integer> pair = new HashMap<>();
        for (int n : A) {
            if (pair.get(n) == null) {
                pair.put(n, 1);
            } else {
                pair.put(n, pair.get(n) + 1);
            }
        }
        for (int m : pair.keySet()) {
            if ((pair.get(m) % 2) != 0) {
                return m;
            }
        }
        return 0;

    }

}
