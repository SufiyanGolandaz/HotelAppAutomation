package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutomationScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\safzalgo\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.findElement(By.id("username")).sendKeys("sufu12345");
		driver.findElement(By.id("password")).sendKeys("sufu1234");
		driver.findElement(By.id("login")).click();
		String actualTitle=driver.getTitle();
		if(actualTitle.equalsIgnoreCase("Adactin.com - Search Hotel")) {
			System.out.println("Test case Passed");
		}
		driver.quit();
	}

}
