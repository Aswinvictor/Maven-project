package runnerclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.Base_Class;

public class AutomationPractice extends Base_Class {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php");

		WebElement login = driver.findElement(By.className("login"));
		login.click();

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Aswinvictor@gmail.com");

		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Aswin1234");

		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		women.click();

		Robot r = new Robot();
		Actions a = new Actions(driver);
		WebElement dress = driver.findElement(By.xpath("//a[contains(text(),'Faded ')]"));
		a.contextClick(dress).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}
		String tab = "Faded Short Sleeve T-shirts - My Store";
		for (String id1 : windowHandles) {
			if (driver.switchTo().window(id1).getTitle().equals(tab)) {
				break;
			}

		}

		for (int i = 0; i < 3; i++) {
			driver.findElement(By.className("icon-plus")).click();
		}
		WebElement size = driver.findElement(By.name("group_1"));
		Select s = new Select(size);
		s.selectByValue("2");
		driver.findElement(By.name("Submit")).click();

		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.className("cheque")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");

		TakesScreenshot sc = (TakesScreenshot) driver;
		File src = sc.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Screenshot\\main.png");
		FileUtils.copyFile(src, dest);

	}
}
