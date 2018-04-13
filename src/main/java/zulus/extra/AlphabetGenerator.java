package zulus.extra;


import java.util.*;
import java.util.stream.Collectors;

public class AlphabetGenerator {
    /**
     * Given a numeric base, return a char[] that maps every digit that is
     * representable in that base to a lower-case char.
     * <p>
     * This method will try to weight each character of the alphabet
     * proportional to their occurrence in words in a training set.
     * <p>
     * The letters should occur in lexicographically ascending order in the
     * returned array. - {"a", "b", "c", "c", "d"} is a valid output. - {"b",
     * "c", "c", "d", "a"} is not.
     * <p>
     * If base >= 0, the returned array should have length equal to the size of
     * the base.
     * <p>
     * If base < 0, return null.
     * <p>
     * If a String of trainingData has any characters outside the range a-z,
     * ignore those characters and continue.
     *
     * @param base         A numeric base to get an alphabet for.
     * @param trainingData The training data from which to generate frequency counts.
     *                     This array is not mutated.
     * @return A char[] that maps every digit of the base to a char that the
     * digit should be translated into.
     */
    public static char[] generateFrequencyAlphabet(int base,
                                                   final String[] trainingData) {

        if (base <= 0 || trainingData == null) return null;
        List lengths = calculateLengths(trainingData, base);
        return generateAlphabet(lengths, base);

    }

    private static char[] generateAlphabet(final List<Map.Entry<Character, Integer>> lengths, int base) {
        lengths.sort(Comparator.comparing((Map.Entry<Character, Integer> x) -> x.getValue()));
        Iterator<Map.Entry<Character, Integer>> iterator = lengths.iterator();
        Map.Entry<Character, Integer> currCharacter = iterator.next();
        char[] alphabet = new char[base];
        for (int i = 0; i < base; i++) {
            if (i >= currCharacter.getValue()) {
                currCharacter = iterator.next();
            }
            alphabet[i] = currCharacter.getKey();
        }
        return alphabet;
    }

    private static List<Map.Entry<Character, Integer>> calculateLengths(final String[] trainingData, int base) {
        return calculateCDF(getProbability(trainingData))
                .stream()
                .map((e) -> new AbstractMap.SimpleEntry<>(e.getKey(), (int) (Math.ceil(base * e.getValue()))))
                .collect(Collectors.toList());
    }

    private static List<Map.Entry<Character, Double>> calculateCDF(final List<Map.Entry<Character, Double>> pairs) {
        List<Map.Entry<Character, Double>> cdf = new ArrayList<>(pairs.size());
        pairs.sort(Comparator.comparing(e -> e.getKey()));
        double lastValue = 0;
        for (int i = 0; i < pairs.size(); i++) {
            cdf.add(Map.entry(pairs.get(i).getKey(), pairs.get(i).getValue() + lastValue));
            lastValue += pairs.get(i).getValue();
        }
        return cdf;
    }

    private static Map<Character, Integer> calculateFrequency(final String[] words) {
        Map<Character, Integer> freq = new HashMap<>();
        for (String word : words) {
            for (char symbol : word.toCharArray()) {
                if (Character.isLetter(symbol))
                    freq.put(symbol, freq.getOrDefault(symbol, 0) + 1);
            }
        }
        return freq;
    }

    private static List<Map.Entry<Character, Double>> getProbability(String[] trainingData) {
        Map<Character, Integer> freq = calculateFrequency(trainingData);
        double total = freq.values().stream().mapToInt(Number::intValue).sum();
        return freq
                .entrySet()
                .stream()
                .map((e) -> new AbstractMap.SimpleEntry<>(e.getKey(), e.getValue() / total))
                .collect(Collectors.toList());
    }
}
