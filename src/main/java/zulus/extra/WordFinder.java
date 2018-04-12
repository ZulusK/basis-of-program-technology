package zulus.extra;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordFinder {
    private static final int PRIME_NUMBER = 31;
    private static final int NORMILIZER= Integer.MAX_VALUE;
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

        if (haystack == null || needles == null) return new HashMap<>();;
        return rabinKarp(haystack, needles);
//        return nativeSearch(haystack,needles);
    }

    private static Map<String,Integer> nativeSearch(String haystack, String[] needles){
        HashMap<String, Integer> output = new HashMap<>();
        for(String needle:needles){
            int index=haystack.indexOf(needle);
            if(index>=0) {
                output.put(needle, index);
            }
        }
return output;
    }

    private static Map<String, Integer> rabinKarp(String haystack, String[] needles) {
        HashMap<String, Integer> output = new HashMap<>();
        List<Long> hashesNeedles = Arrays.stream(needles).map((needle) -> hash(needle)).collect(Collectors.toList());

        return output;
    }

    private static long hash(String str) {
        long powOfPN = 1;
        long hash = 0;
        for (char c : str.toCharArray()) {
            powOfPN *= PRIME_NUMBER;
            hash += powOfPN * c;
            hash%=NORMILIZER;
        }
        return hash;
    }
}
