package guru.test99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
	
	protected WebDriver driver;
	@Test
  public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		        "D:\\Eclipse\\test99\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://3.133.87.133:8080/BMI/");
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.name("weight")).sendKeys("80.0");
        Thread.sleep(1000);
        driver.findElement(By.name("height")).sendKeys("2.0");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input:nth-child(8)")).click();
        Thread.sleep(2000);
        String h= driver.getTitle();
        String e= "BMI Calculator";
        driver.close();
        if(h.equalsIgnoreCase(e)){
        System.out.println("Success");
        }
        else{
        System.out.println("Failure");
        }       
        
        driver.close();
		
	}
}

