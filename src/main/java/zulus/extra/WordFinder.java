package zulus.extra;

import java.util.*;

public class WordFinder {
    private static final int PRIME_NUMBER = 31;
    private static final int NORMALIZER = Integer.MAX_VALUE;

    /**
     * Given a String (the haystack) and an array of Strings (the needles),
     * return a Map<String, Integer>, where keys in the map correspond to
     * elements of needles that were found as substrings of haystack, and the
     * value for each key is the lowest index of haystack at which that needle
     * was found. A needle that was not found in the haystack should not be
     * returned in the output map.
     *
     * @param haystack The string to search into.
     * @param needles  The array of strings to search for. This array is not mutated.
     * @return The list of needles that were found in the haystack.
     */
    public static Map<String, Integer> findWords(String haystack,
                                                 String[] needles) {

        if (haystack == null || needles == null) return new HashMap<>();
        return KMPSearchMany(haystack.toCharArray(), needles);
//        return nativeSearch(haystack,needles);
    }

    private static Map<String, Integer> nativeSearch(String haystack, String[] needles) {
        HashMap<String, Integer> output = new HashMap<>();
        for (String needle : needles) {
            int index = haystack.indexOf(needle);
            if (index >= 0) {
                output.put(needle, index);
            }
        }
        return output;
    }

    private static int[] computePrefixFunction(String str) {
        int[] prefixes = new int[str.length()];
        int k = 0;
        for (int i = 1; i < str.length(); i++) {
            while (k > 0 && str.charAt(k) != str.charAt(i)) {
                k = prefixes[k - 1];
            }
            if (prefixes[k] == prefixes[i]) {
                k++;
            }
            prefixes[i] = k;
        }
        return prefixes;
    }

    private static int KMPSearchOne(char[] haystack, String needle) {
        int[] prefixFunc = computePrefixFunction(needle);
        int q = 0;
        for (int i = 0; i < haystack.length; i++) {
            while (q > 0 && needle.charAt(q) != haystack[i]) {
                q = prefixFunc[q - 1];
            }
            if (needle.charAt(q) == haystack[i]) {
                q++;
            }
            if (q == needle.length()) {
                return i - needle.length() + 1;
            }

        }
        return -1;
    }

    private static Map<String, Integer> KMPSearchMany(char[] haystack, String[] needles) {
        HashMap<String, Integer> output = new HashMap<>();
        for (String needle : needles) {
            int index = KMPSearchOne(haystack, needle);
            if (index >= 0) {
                output.put(needle, index);
            }
        }
        return output;
    }

    private static long hash(String str) {
        long powOfPN = 1;
        long hash = 0;
        for (char c : str.toCharArray()) {
            powOfPN *= PRIME_NUMBER;
            hash += powOfPN * c;
            if (hash > NORMALIZER) {
                hash %= NORMALIZER;
            }
        }
        return hash;
    }
}
