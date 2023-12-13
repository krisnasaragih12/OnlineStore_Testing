package Zalora;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5 {

	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://zalora.co.id/");
		
		/* wd.get("https://iddesk.freshdesk.com/support/home"); */
		//ke menu search dengan kata kunci dan klik search
		wd.findElement(By.xpath("//*[@id=\"onsiteSearch\"]/input")).sendKeys("sneakers");
		wd.findElement(By.xpath("//*[@id=\"onsiteSearch\"]/button")).click();
		
		//klik pemfilteran
		wd.findElement(By.xpath("//*[@id=\"occasion-filter\"]/div[2]/ul/li[4]/div/input")).click();
		wd.findElement(By.xpath("//*[@id=\"material-filter\"]/div[2]/ul/li[5]/div/input")).click();

		
		System.out.println("Berhasil melakukan filter");
		
		Thread.sleep(5000);
		
//		wd.quit();
		{

		}

	}
	}