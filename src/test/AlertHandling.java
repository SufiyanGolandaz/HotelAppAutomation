package test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\safzalgo\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://demoqa.com/alerts";
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();//deal with alerts
		driver.findElement(By.id("timerAlertButton")).click();
		driver.wait(5000);
		driver.switchTo().alert().accept();
		System.out.println("I have clicked on alert");
		driver.quit();
	}

}
