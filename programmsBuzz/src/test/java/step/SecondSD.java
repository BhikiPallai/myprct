package step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Common.Base;
import io.cucumber.java.en.When;

public class SecondSD {
	WebDriver driver;
	Base base;
	
	public SecondSD(Base base) {
		this.base=base;
	}
	
	@When("then click the doubt button")
	public void then_click_the_doubt_button() {
	    System.out.println("doubt");
	}

	@When("print msg")
	public void print_msg() {
	  System.out.println("only msg");
	}
	

}
