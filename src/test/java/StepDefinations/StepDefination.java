package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class StepDefination {

	WebDriver driver = null;


	@Given("User searches for HP Pen Drive")
	public void user_searches_for_hp_pen_drive() {
		System.out.println("searched for hp pen drive");
		driver = new FirefoxDriver(); 
		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hp Pen Drive");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@When("Add the first result on the page with quantity {int}")
	public void add_the_first_result_on_the_page_with_quantity(Integer int1) {
		System.out.println("Added first result on page with quanitity "+ int1);
		driver.findElement(By.className("a-size-mini")).click();
        Select drop = new Select(driver.findElement(By.id("quantity")));
        drop.selectByVisibleText(int1.toString());
        driver.findElement(By.id("add-to-cart-button")).click();
	}

	@Then("Cart should display {int} pen drive")
	public void cart_should_display_pen_drive(Integer int1) {
		System.out.println("cart displayed pen drive quanitity "+ int1);
		String a = driver.findElement(By.className("a-dropdown-prompt")).getText();
        if(a.equals(int1.toString())){
            System.out.println("Cart quantity equals given quantity");
        }
	}
}

