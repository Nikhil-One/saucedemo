package StepDefinationFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Demo1 {
	@Given("Scenario one and Step one")
	public void scenario_one_and_step_one() {
		System.out.println("Scenario one and Step one");
	
	}

	@When("Scenario one and Step two")
	public void scenario_one_and_step_two() {
		System.out.println("Scenario one and Step two");
	}

	@When("Scenario one and Step three")
	public void scenario_one_and_step_three() {
		System.out.println("Scenario one and Step three");
	}

	@Given("Scenario two and Step one")
	public void scenario_two_and_step_one() {
		System.out.println("Scenario two and Step one");

	}

	@When("Scenario two and Step two")
	public void scenario_two_and_step_two() {
		System.out.println("Scenario two and Step two");

	}

	@When("Scenario two and Step three")
	public void scenario_two_and_step_three() {
		System.out.println("Scenario two and Step three");

	}
	@When("Scenario two and Step Four")
	public void scenario_two_and_step_four() {
		System.out.println("Scenario two and Step Four");
	}
	@Given("Scenario three and Step one")
	public void scenario_three_and_step_one() {
	System.out.println("its done");
	}
	@When("Scenario three and Step two")
	public void scenario_three_and_step_two() {
		System.out.println("its done2");
	}
	@When("Scenario three and Step three")
	public void scenario_three_and_step_three() {
		System.out.println("its done3");
	}
	@When("Scenario three and Step Four")
	public void scenario_three_and_step_four() {
		System.out.println("its done33");
	}
}

