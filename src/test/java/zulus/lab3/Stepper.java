package zulus.lab3;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Steps;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Stepper extends Steps {
    MathLangEnvironment env;
    String output = "";

    @Given("Empty storage")
    public void setuptEnv() {
        env = new MathLangEnvironment();
    }

    @When("I execute instruction $input")
    public void runParsing(String input) {
        output = env.exec(input+"\n");
    }

    @Then("I receive $result")
    public void resultShouldBeLike(String result)
    {
        assertEquals( result.replace("\\n","\n"),output);
    }


    @Given("Storage with result of commands: $commands")
    public void fillEnv(ExamplesTable commands){
        setuptEnv();
        for (Map<String,String> row : commands.getRows()) {
            String command=row.get("instruction")+"\n";
            env.exec(command);
        }
    }
}
