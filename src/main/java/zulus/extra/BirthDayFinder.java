package zulus.extra;

public class BirthDayFinder extends WordFinder {

    public static int findBirthDay(String birthday) {
        if (birthday == null||!birthday.matches("^\\d+$")) return -1;
        int[] prefixFunc = computePrefixFunction(birthday);
        int q = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            int currPi16Digit=PiGenerator.piDigit(i);
            int currDigit = currPi16Digit+'0';
            while (q > 0 && birthday.charAt(q) != currDigit) {
                q = prefixFunc[q - 1];
            }
            if (birthday.charAt(q) == currDigit) {
                q++;
            }
            if (q == birthday.length()) {
                return i - birthday.length();
            }

        }
        return -1;
    }
}
