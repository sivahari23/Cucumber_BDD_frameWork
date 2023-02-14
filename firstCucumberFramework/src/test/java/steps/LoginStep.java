package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	WebDriver driver;
	
@Given("User nagvigate to the Guru{int}")
public void user_nagvigate_to_the_Guru(Integer int1) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivahm\\eclipse-workspace\\firstCucumberFramework\\src\\test\\resources\\driver\\chromedriver.exe");
	driver =new ChromeDriver();
  driver.get("https://demo.guru99.com/V4/index.php");
  Thread.sleep(2000);
    
}

@Given("User enter the username as {string}")
public void user_enter_the_username_as(String username) throws InterruptedException {
  driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
  Thread.sleep(2000);  
}

@Given("User enter the password as {string}")
public void user_enter_the_password_as(String password) {
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
   
    
}

@When("User click on the login button")
public void user_click_on_the_login_button() {
   driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
    
}

@Then("Login should be sucess")
public void login_should_be_sucess() {
   
String  text =driver.findElement(By.xpath("//td[normalize-space()='Manger Id : mngr475863']"))
.getText();
System.out.println(text);

}

@Then("Login should fail")
public void login_should_fail() {
   
 String text=driver.switchTo().alert().getText();  
 System.out.println(text);}

}
