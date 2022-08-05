package step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Common.Base;
import io.cucumber.java.en.*;

public class firstSD {
	
	WebDriver driver;
	Base base;
	
	public firstSD(Base base) {
		this.base=base;
	}
	@Given("lunch the application {string}")
	public void lunch_the_application(String string) {
	 base.getDriver().get(string);
	}

	@When("then click the login button")
	public void then_click_the_login_button() {
	  System.out.println("login");
	}
	 

}
