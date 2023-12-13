package Zalora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC7 {

	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://zalora.co.id/");
		
		/* wd.get("https://iddesk.freshdesk.com/support/home"); */
		//mencari barang di pencarian
		wd.findElement(By.xpath("//*[@id=\"onsiteSearch\"]/input")).sendKeys("kemeja");
		wd.findElement(By.xpath("//*[@id=\"onsiteSearch\"]/button")).click();
		//memilih kategori
		wd.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/div[2]/div[2]/div/select/option[3]")).click();
		//memilih kategori berdasarkan harga tertinggi
		wd.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div/div[2]/div[2]/div/select/option[3]")).click();
		
		System.out.println("Successfully opened the website Zalora DemoQA");
		
		Thread.sleep(5000);
		
		//		wd.quit();
		{

		}

	}
	}