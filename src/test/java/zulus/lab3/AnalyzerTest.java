package zulus.lab3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import zulus.lab3.commands.AssignmentCommand;
import zulus.lab3.commands.Command;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AnalyzerTest {
    Analyzer analyzer;
    public AnalyzerTest(){
        this.analyzer=new Analyzer();
    }
    @ParameterizedTest
    @ValueSource(strings = {"A=[123]","Z=[[123],[123]]"})
    public void testMatchAssignmentString(String candidate){
        if(analyzer!=null){}
        Command recognizedCommand=analyzer.recognizeCommand(candidate);
        assertNotNull(recognizedCommand);
        assertEquals(recognizedCommand.getClass(),AssignmentCommand.class);
    }
}
