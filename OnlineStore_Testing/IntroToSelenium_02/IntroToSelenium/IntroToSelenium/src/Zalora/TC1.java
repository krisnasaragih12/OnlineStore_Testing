package Zalora;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://zalora.co.id/");
		//Masuk ke menu search dengan mencari "jacket"
		wd.findElement(By.xpath("//*[@id=\"onsiteSearch\"]/input")).sendKeys("jacket");
		//Mengeklik tombol search dan melakukan pencarian "jacket"
		wd.findElement(By.xpath("//*[@id=\"onsiteSearch\"]/button")).click();
		
		System.out.println("Berhasil menggunakan fungsi pencarian di Zalora");
		
		Thread.sleep(5000);
		
//		wd.quit();
	{

	}

}
}