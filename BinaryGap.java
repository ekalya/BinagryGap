import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author exk
 */
public class Solution {

    public int solution(int N) {
        String integerBinaryRepresentation = getBinaryRepresentation(N);
        Pattern pattern = Pattern.compile("0*");
        Matcher matcher = pattern.matcher(integerBinaryRepresentation);
        int binaryGap = 0;
        while (matcher.find()) {
            if (integerBinaryRepresentation.contains("1" + matcher.group() + "1") && matcher.group().length() > binaryGap) {
                binaryGap = matcher.group().length();
            }
        }
        return binaryGap;
    }

    private String getBinaryRepresentation(int N) {
        return Integer.toBinaryString(N);
    }
}
