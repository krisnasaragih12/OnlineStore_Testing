package Zalora;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4 {

	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://zalora.co.id/");
		
		
		//masuk ke menu SHop Wanita
		wd.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div[1]/a/span")).click();

	
		
		
		System.out.println("Berhasil masuk ke menu SHop Wanita");
		
		Thread.sleep(5000);
		
//		wd.quit();
		{

		}

	}
	}