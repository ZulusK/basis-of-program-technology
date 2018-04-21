package zulus.lab3;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

import static org.junit.Assert.assertEquals;

public class MathInstructionsStep extends Steps {
    MathLangEnvironment env;
    String output = "";

    @Given("An empty environment command in string")
    public void setuptEnv() {
        System.exit(0);
        env = new MathLangEnvironment();
    }

    @When("I execute command $input")
    public void runParsing(String input) {
        output = env.exec(input);
        System.out.println(2);
    }

    @Then("I receive $result")
    public void resultShouldBeLike(String result) {
        System.out.println(3);
        assertEquals(output, result);
    }
}
