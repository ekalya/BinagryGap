/**
 *
 * @author exk
 */
public class Solution {

    public int solution(int N) {
        String bin = getBinaryRepresentation(N);
        if (bin.contains("100") == false || bin.contains("001") == false) {
            return 0;
        }
        int binaryGap = 0;
        String sequenceOfZeros = "";
        Integer index = 0;
        while (index < bin.length()) {
            if (bin.charAt(index) == '1') {
                if (sequenceOfZeros.length() > binaryGap) {
                    binaryGap = sequenceOfZeros.length();
                }
                sequenceOfZeros = "";
            }
            if (bin.charAt(index) == '0') {
                sequenceOfZeros = sequenceOfZeros + "0";
            }
            index += 1;
        }
        return binaryGap;
    }

    private String getBinaryRepresentation(int N) {
        return Integer.toBinaryString(N);
    }
}
