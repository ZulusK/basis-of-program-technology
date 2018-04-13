package zulus.extra;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DigitsToStringConverter {
    /**
     * Given a list of digits, a base, and an mapping of digits of that base to
     * chars, convert the list of digits into a character string by applying the
     * mapping to each digit in the input.
     * <p>
     * If digits[i] >= base or digits[i] < 0 for any i, consider the input
     * invalid, and return null. If alphabet.length != base, consider the input
     * invalid, and return null.
     *
     * @param digits   A list of digits to encode. This object is not mutated.
     * @param base     The base the digits are encoded in.
     * @param alphabet The mapping of digits to chars. This object is not mutated.
     * @return A String encoding the input digits with alphabet.
     */
    public static String convert(int[] digits, int base, char[] alphabet) {

        if (base < 2 || alphabet == null || digits == null || alphabet.length != base) return null;
        StringBuilder builder = new StringBuilder();
        for(int digit:digits){
            if(digit<0|| digit >=base){
                return null;
            }else{
                builder.append(alphabet[digit]);
            }
        }
        return builder.toString();
    }
}
