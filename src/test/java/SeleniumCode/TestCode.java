package SeleniumCode;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCode {

	 public static WebDriver driver;
	 @Given("^navigate to the insurance portal home page using URL$")
	 public void home_page()
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium practice\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://covercheck.vwfsinsuranceportal.co.uk/");
	        throw new PendingException();
	 }

@When("^user enter Vehicle reg\\.number$")
public void user_enter_Vehicle_reg_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("vehicleReg")).sendKeys("OV12UYY");
	driver.findElement(By.id("icon")).click();
    throw new PendingException();
}


@Then("^Result should be displayed$")
public void result_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String exp_message = "Result for : OV12UYY";
	String actual = driver.findElement(By.className("result")).getText();
    Assert.assertEquals(exp_message, actual);
	
	
		/*
		 * String data=driver.findElement(By.className("result")).getText();
		 * System.out.println(data); if( data .contains("Result")) {
		 * System.out.println("vehicle registered"); } else
		 * System.out.println("Vehicle not registered"); throw new PendingException();
		 */
}

@Then("^close the browser$")
public void close_the_browser() throws Throwable {
    driver.close();
    throw new PendingException();
}
}