package zulus.extra;

import java.util.Map;

public class StringInPiFinder extends WordFinder {
    public static int search(String str) {
        if (str == null|| !str.matches("\\d+")) return -1;
        long length = 1000;
        char[] digits = "0123456789".toCharArray();
        do {
            String pi = DigitsToStringConverter.convert(BaseTranslator.convertBase(PiGenerator.computePiInHex((int)length), 16, 10, (int)length), 10, digits);
            int matches = WordFinder.findWord(pi, str);
            if (matches >= 0) {
                return matches;
            }
            length *= 5;
        } while (length <= Integer.MAX_VALUE);
        return -1;
    }
}
