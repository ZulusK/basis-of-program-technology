package zulus.extra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    private static final int PI_LENGTH=5000;
    public static void main(String[] args) {
        String inputFileName = args.length > 1 ? args[1] : "resources/words.txt";
        String[] words = readWords(inputFileName).toArray(new String[0]);
        if (words.length==0) {
            System.out.printf("No such file `%s` found\n", inputFileName);
            System.exit(-1);
        }
        System.out.printf("File `%s` was read, there are %d words\n", inputFileName, words.length);
        int[] piHex = PiGenerator.computePiInHex(PI_LENGTH);
        System.out.println("Generated Pi in Hex");
        char[] basicAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        execSearch(piHex,words, basicAlphabet, basicAlphabet.length, PI_LENGTH);
        char[] freqAlphabet=AlphabetGenerator.generateFrequencyAlphabet(100,words);
        execSearch(piHex,words, freqAlphabet, freqAlphabet.length, PI_LENGTH);
    }

    private static List<String> readWords(String filename) {
        List<String> words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                words.add(scanner.next().toLowerCase());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return words;
    }


    private static void execSearch(int[] piHex,String[] words, char[] alphabet, int base, int piLength) {
        int[] piInBase = BaseTranslator.convertBase(piHex, 16, base, piLength);
        System.out.printf("Converted Pi to %d base\n", base);
        String pi = DigitsToStringConverter.convert(piInBase, base, alphabet);
        System.out.printf("Replace digits in Pi with symbol in alphabet\n", base);
        Map<String,Integer> matches = WordFinder.findWords(pi, words);
        System.out.printf("Search complete with base %d and alphabet:\n%s\n", base, Arrays.toString(alphabet));
        matches.entrySet()
                .stream()
                .sorted(Comparator.comparing((Map.Entry<String,Integer> e) -> e.getKey()))
                .forEach(pair -> {
                    System.out.printf("Math word `%s` at %d: `...%s...`\n", pair.getKey(), pair.getValue(), pi.substring(Math.max(0, pair.getValue() - 3), Math.min(pair.getValue()+pair.getKey().length() + 3, pi.length()-1)));
                });
        System.out.printf("Word coverage: %.5f\n",matches.size()/(float)words.length);
    }
}
