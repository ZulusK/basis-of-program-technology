package zulus.lab3;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MathLangTest {
    MathLangEnvironment env;

    @Given("Env $env")
    public void runParsing() {
        env = new MathLangEnvironment();
    }

    @When("Calculate expression $input")
    public void runParsing(String input) {
        env.exec(input);
    }

    @Then("The result should be like ")
    public void resultShouldBeLike() {
        assertEquals(env.getMemory().get("_").getValue(),1);
    }
}
