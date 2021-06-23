package Mydemo0623;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.Test;
public class App
{
 @Test

 public static void main(String[] args) {


 System.setProperty("webdriver.gecko.driver","/home/edureka/geckodriver");
 FirefoxOptions Options = new FirefoxOptions();
 WebDriver driver = new FirefoxDriver(Options);

 System.out.println("Hi, Before test");

 driver.get("http://localhost:3001");

 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 driver.findElement(By.name("login")).click();
 driver.findElement(By.name("login")).sendKeys("Edureka");
 driver.findElement(By.name("password")).click();
 driver.findElement(By.name("password")).sendKeys("Edureka");
 //driver.findElement(By.className("v-button-primary")).click();
 //Thread.sleep(5000);
 
 System.out.println("Hi, After test");
 driver.quit();

 }

}