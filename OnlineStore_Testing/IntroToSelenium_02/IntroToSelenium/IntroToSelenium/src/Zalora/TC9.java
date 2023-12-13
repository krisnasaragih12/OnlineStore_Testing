package Zalora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC9 {

	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://zalora.co.id/");
		
		wd.findElement(By.xpath("//*[@id=\"page\"]/div[1]/div[1]/div[14]/a")).click();
		wd.get("https://www.zalora.co.id/sustainability/");
		
		System.out.println("Successfully opened the website Zalora DemoQA");
		
		Thread.sleep(5000);
		
		//		wd.quit();
		{

		}

	}
	}