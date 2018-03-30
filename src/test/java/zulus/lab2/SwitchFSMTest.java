package zulus.lab2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by zulus on 30.03.18
 */
public class SwitchFSMTest {
    private SwitchFSM switchSM;

    public SwitchFSMTest() {
        switchSM = new SwitchFSM();
    }

    @ParameterizedTest
    @DisplayName("Should match all strings, that contains '{\\d+}'")
    @MethodSource("matchedDigitsProvider")
    public void match_digit(String candidate) {
        assertTrue(switchSM.scan(candidate),"Should match this string {\\d+}");
    }


    @ParameterizedTest
    @DisplayName("Should match all strings, that contains '{\\[A-Z]+}'")
    @MethodSource("matchedAlphaProvider")
    public void match_alpha(String candidate) {
        assertTrue(switchSM.scan(candidate), "Should match this string {\\[A-Z]+}");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/incorrectStrings.csv", numLinesToSkip = 1)
    public void doNotMatch_alpha(String candidate, String desciption) {
        assertFalse(switchSM.scan(candidate), desciption);
    }

    public static Stream<String> matchedDigitsProvider() {
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            StringBuilder s = new StringBuilder("{");
            for (int j = i; j < 10; j++) {
                s.append(j);
            }
            s.append("}");
            list.add(s.toString());
        }
        return list.stream();
    }

    public static Stream<String> matchedAlphaProvider() {
        LinkedList<String> list = new LinkedList<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            StringBuilder s = new StringBuilder("{");
            for (char j = i; j <= 'Z'; j++) {
                s.append(j);
            }
            s.append("}");
            list.add(s.toString());
        }
        return list.stream();
    }

}
