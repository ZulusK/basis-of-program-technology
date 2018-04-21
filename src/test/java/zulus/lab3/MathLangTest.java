package zulus.lab3;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MathLangTest {

    private double DELTA = 1e-6;

    MathLangEnvironment getEnv() {
        return new MathLangEnvironment();
    }

    @ParameterizedTest(name = "Test Floats recognition: {0}")
    @DisplayName("Should return the same strings")
    @ValueSource(strings = {"12", "-12", "1.3", "-0.43", "-123.0123", "+12", "0.1e3", "-3E-3"})
    void FloatNumberTest(String instruction) {
        assertEquals(Double.parseDouble(instruction), Double.parseDouble(getEnv().exec(instruction)), DELTA);
    }

    @ParameterizedTest(name = "Test Floats recognition with error: {0}")
    @DisplayName("Should return error desctiption")
    @ValueSource(strings = {"12-"})
    void FloatNumberWithErrorTest(String instruction) {
        assertTrue(getEnv().exec(instruction).startsWith("ERROR"));
    }

    @ParameterizedTest(name = "Test variables recognition: {0}")
    @DisplayName("Should return the value of variable")
    @CsvSource(value = {"A=5,5", "_=-3,-3", "AsA345=-0.23,-0.23", "R=-2e3,-2e3"})
    void VariableAssignTest(String instruction, String output) {
        assertEquals(Double.parseDouble(output), Double.parseDouble(getEnv().exec(instruction)), DELTA);
    }

    @ParameterizedTest(name = "Test sum operation: {0}")
    @DisplayName("Should return the sum of values")
    @CsvSource(value = {
            "3+4,7",
            "0.2+-1,-0.8",
            "-0.3e5+1.33e-2,-29999.9867",
            "4+4.2+-4,4.2"
    })
    void sumTest(String instruction, String output) {
        assertEquals(Double.parseDouble(output), Double.parseDouble(getEnv().exec(instruction)), DELTA);
    }

    @ParameterizedTest(name = "Test subtract operation: {0}")
    @DisplayName("Should return the subtract of values")
    @CsvSource(value = {
            "3-4,-1",
            "0.2--1,1.2",
            "-0.3e5-1.33e-2,-30000.0133",
            "-5-7--1,-11"
    })
    void subtractTest(String instruction, String output) {
        assertEquals(Double.parseDouble(output), Double.parseDouble(getEnv().exec(instruction)), DELTA);
    }
    @ParameterizedTest(name="Test list creation operation: {0}")
    @DisplayName("Should return created list")
    @CsvSource(value = {
            "{1,2,3};[1.0, 2.0, 3.0]",
            "{-12,34,0.32e3};[-12.0, 34.0, 320.0]",
            "A={1};[1.0]",
            "A={34+15,-0.2+1};[49.0, 0.8]"
    },delimiter = ';')
    void listTest(String instruction,String output){
        assertEquals(output, getEnv().exec(instruction));

    }

    @ParameterizedTest(name="Test list creation operation: {0}")
    @DisplayName("Should return error description, use invalid list instruction")
    @ValueSource(strings= {
           "{12,{34}}",
            "{{12",
            "66+{12}"
    })
    void listInvalidArgsTest(String instruction){
        assertTrue(getEnv().exec(instruction).startsWith("ERROR."));
    }
}

