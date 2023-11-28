package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountStepDefinitions {
    private int balance;

    @Given("The user balance is {int} dollar")
    public void the_user_balance_is_dollar(Integer balance) {
        this.balance = balance;

    }
    @When("The user deposits {int} dollar")
    public void the_user_deposits_dollar(Integer amount) {
        balance += amount;


    }
    @Then("The user balance should be {int} dollar")
    public void the_user_balance_should_be_dollar(Integer expectedAnswer) {
        assertEquals(expectedAnswer, balance);


    }

}
