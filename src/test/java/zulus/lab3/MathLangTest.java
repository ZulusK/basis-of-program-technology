package zulus.lab3;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;

public class MathLangTest {

    private double DELTA=0e-6;
    MathLangEnvironment getEnv() {
        return new MathLangEnvironment();
    }

    @ParameterizedTest(name = "Test Floats recognition: {0}")
    @DisplayName("Should return the same strings")
    @ValueSource(strings = {"12","-12","1.3","-0.43","-123.0123","+12","0.1e3","-3E-3"})
    public void FloatNumberTest(String instruction){
        assertEquals(Double.parseDouble(getEnv().exec(instruction)),Double.parseDouble(instruction),DELTA);
    }

    @ParameterizedTest(name = "Test variables recognition: {0}")
    @DisplayName("Should return the value of variable")
    @CsvSource(value = {"A=5,5","_=-3,3","AsA345=-0.23,-0.23"})
    public void VariableAssignTest(String instruction,String output){
        assertEquals(Double.parseDouble(getEnv().exec(instruction)),Double.parseDouble(output),DELTA);
    }
}

