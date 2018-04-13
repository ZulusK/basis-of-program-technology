package zulus.extra;

import java.util.Map;

public class StringInPiFinder extends WordFinder {
    public static int search(String str, int maxLength) {
        if (str == null) return -1;
        int length = 1000;
        char[] digits = "0123456789".toCharArray();
        do {
            String pi = DigitsToStringConverter.convert(BaseTranslator.convertBase(PiGenerator.computePiInHex(length), 16, 10, length), 10, digits);
            System.out.println(pi.length());

            int matches = WordFinder.findWord(pi, str);
            if (matches >= 0) {
                return matches;
            }
            length *= 5;
        } while (length <= Integer.MAX_VALUE && (maxLength <= 0 || length < maxLength));
        return -1;
    }
}
