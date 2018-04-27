package zulus.lab3;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

import static org.junit.Assert.assertEquals;

public class StoreMatrixInDBStep extends Steps {
    MathLangEnvironment env;
    String output = "";

    @Given("String with variable definition")
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
        assertEquals(output, result.replace("\\n","\n"));
    }
}
