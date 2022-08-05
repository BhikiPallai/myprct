package Common;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;

public class Hooks {
	Base base = new Base();
	WebDriver driver;
	
	
	public Hooks(Base base) {
		this.base=base;
	}
	

	public void af() {
		base.getDriver();
	}
	@Before
	public void bf() {
		base.setDriver();
	}

}
