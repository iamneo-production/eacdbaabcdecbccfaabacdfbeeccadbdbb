package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	@Given("User searches for HP Pen Drive")
	public void user_searches_for_hp_pen_drive() {
		System.out.println("searched for hp pen drive");
	}

	@When("Add the first result on the page with quantity {int}")
	public void add_the_first_result_on_the_page_with_quantity(Integer int1) {
		System.out.println("Added first result on page with quanitity "+ int1);
	}

	@Then("Cart should display {int} pen drive")
	public void cart_should_display_pen_drive(Integer int1) {
		System.out.println("cart displayed pen drive quanitity "+ int1);
	}
}
