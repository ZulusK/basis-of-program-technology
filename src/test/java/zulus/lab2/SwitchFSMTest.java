package zulus.lab2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

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
    @DisplayName("Should match all strings, that contains '{\\d}'")
    @ValueSource(strings={"{1234567890}"})
    public void match_digit(String candidate) {
        assertTrue(switchSM.scan(candidate));
    }
}
