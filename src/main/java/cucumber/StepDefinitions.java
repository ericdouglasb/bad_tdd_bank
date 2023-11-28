package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsItFriday {
    public static String IsItFriday(String today) {
        return today.equals("Friday") ? "Yup!" : "Nope";
    }



}

public class StepDefinitions {
    private String today;
    private String actualAnswer;


    @Given("today is Sunday")
    public void today_is_sunday() {
        today = "Sunday";

    }

    @Given("today is Friday")
    public void today_is_friday() {
       today = "Friday";
    }


    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actualAnswer = IsItFriday.IsItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }


}