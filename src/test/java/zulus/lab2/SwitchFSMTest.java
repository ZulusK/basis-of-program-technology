package zulus.lab2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.LinkedList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by zulus on 30.03.18
 */

public class SwitchFSMTest {
    private SwitchFSM switchSM;

    public SwitchFSMTest() {
        switchSM = new SwitchFSM();
    }

    @ParameterizedTest(name = "math digits: scan({0})")
    @DisplayName("Should match all strings, that contains '{\\d+}'")
    @MethodSource("matchedDigitsProvider")
    public void match_digit(String candidate) {
        assertTrue(switchSM.scan(candidate), "Should match this string {\\d+}");
    }


    @ParameterizedTest(name = "match alpha: scan({0})")
    @DisplayName("Match all strings, that contains '{\\[A-Z]+}'")
    @MethodSource("matchedAlphaProvider")
    public void match_alpha(String candidate) {
        assertTrue(switchSM.scan(candidate), "Should match this string {\\[A-Z]+}");
    }

    @DisplayName("don't match strings, incorrect brackets")
    @ParameterizedTest(name = "scan({0}), {1}")
    @CsvFileSource(resources = "/incorrectStrings.csv", numLinesToSkip = 1)
    public void doNotMatch_incorrectBrackets(String candidate, String description) {
        assertFalse(switchSM.scan(candidate), description);
    }

    @DisplayName("don't match strings, mixin of letters and digits")
    @ParameterizedTest(name = "scan({0})")
    @ArgumentsSource(Provider.class)
    public void doNotMatch_mixin(String candidate) {
        assertFalse(switchSM.scan(candidate));
    }

    @Test
    @DisplayName("don't match empty string")
    public void doNotMatch_emptyString() {
        assertFalse(switchSM.scan(""));
    }


    @Test
    @DisplayName("Throw error, if receive null pointer")
    public void throwOnNull_null() {
        assertThrows(IllegalArgumentException.class, () -> switchSM.scan(null));
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

    static class Provider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of("{A123455}", "{12345B124}", "{m123}").map(Arguments::of);
        }
    }

}
