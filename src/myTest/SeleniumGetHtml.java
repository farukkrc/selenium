package myTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumGetHtml {
	public String htmlData;
	
	
	public  SeleniumGetHtml() {
		try {
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		opt.addArguments("--user-data-dir=C:\\Users\\pc\\AppData\\Local\\Google\\Chrome\\User Data");
		
		WebDriver driver = new ChromeDriver(opt);
		
		
		
		String link = "https://www.n11.com/";
		driver.navigate().to(link);
		driver.findElement(By.className("btnSignIn")).click();
		driver.findElement(By.className("facebookBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("searchData")).sendKeys("Iphone7");
		driver.findElement(By.className("searchBtn")).click();
		driver.findElement(By.className("productName ")).click();
		

		htmlData = driver.getPageSource();
		
		
		driver.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
