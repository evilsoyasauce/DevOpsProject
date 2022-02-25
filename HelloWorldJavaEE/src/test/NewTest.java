package test;

import org.openqa.selenium.By;
//import necessary Selenium WebDriver classes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
  //declare Selenium WebDriver
  private WebDriver webDriver;		
  
  @Test
  public void checkContent() {
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8090/HelloWorldJavaEE/welcome.jsp");
	  WebElement we =  webDriver.findElement(By.id("content"));
	  
	  System.out.println("id we: "+we.getAttribute("role"));
	  Assert.assertEquals(we.getAttribute("role"), "contentinfo");
  }
  @Test
  public void checkTitle() {
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8090/HelloWorldJavaEE/welcome.jsp");
	  
	  //Assert the title to check that we are indeed in the correct website
	  Assert.assertEquals(webDriver.getTitle(), "Welcome Page");
	  
  }
  @Test
  public void checkRegisterButton() {
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8090/HelloWorldJavaEE/welcome.jsp");
	  
	//Retrieve link using it's class name and click on it
	  webDriver.findElement(By.className("registerButton")).click();
	  
  }
  @Test
  public void checkLoginButton() {
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8090/HelloWorldJavaEE/welcome.jsp");
	  
	//Retrieve link using it's class name and click on it
	  webDriver.findElement(By.className("loginButton")).click();
	  
  }
  @Test
  public void checkFooter() {
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8090/HelloWorldJavaEE/welcome.jsp");
	  
	//Retrieve link using it's class name and click on it
	  webDriver.findElement(By.className("footer")).isDisplayed();
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  //Setting system properties of ChromeDriver
	  //to amend directory path base on your local file path
	  String chromeDriverDir = "C:\\Program Files\\Google\\Chrome\\chromedriver.exe";

	  System.setProperty("webdriver.chrome.driver", chromeDriverDir);

	  //initialize FirefoxDriver at the start of test
	  webDriver = new ChromeDriver();  
  }
  @AfterTest
  public void afterTest() {
	  //Quit the ChromeDriver and close all associated window at the end of test
	  webDriver.close();
  }

}