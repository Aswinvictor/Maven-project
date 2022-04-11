package runnerclass;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.sdp.Page_Object_Manager;

public class Runner_AutomationPractice extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		getUrl("http://automationpractice.com/index.php");
		maximixe();

		clickOnElement(pom.getInstanceHp().getLogin());

		String userName = readParticularData(
				"C:\\Users\\ADMIN\\Documents\\Project\\Class Notes_Manual Testing\\Test Case _ Automation Practice Site.xlsx",
				0, 3, 7);
		inputValueElement(pom.getInstanceLp().getEmail(), userName);

		String password = readParticularData(
				"C:\\Users\\ADMIN\\Documents\\Project\\Class Notes_Manual Testing\\Test Case _ Automation Practice Site.xlsx",
				0, 4, 7);
		inputValueElement(pom.getInstanceLp().getPassword(), password);

		clickOnElement(pom.getInstanceLp().getSubmit());
		pom.getInstanceWo().getWomen().click();

		actions(pom.getInstanceWo().getDress(), "context click");

		Robot(KeyEvent.VK_DOWN, 1);
		Robot(KeyEvent.VK_ENTER, 1);

		staticWait(2000);
		getWindowsTitle();
		toWindowTitle("Faded Short Sleeve T-shirts - My Store");

		for (int i = 0; i < 3; i++) {
			pom.getInstanceFp().getIconPlus().click();
		}

		select(pom.getInstanceFp().getSize(), "index", "2");

		pom.getInstanceFp().getFadedSubmit().click();

		implicitWait(3000, TimeUnit.MILLISECONDS);

		pom.getInstanceFp().getCart().click();
		pom.getInstanceSp().getSummary().click();
		pom.getAddressAp().getSubmit().click();
		pom.getShippingTc().getShippingTc().click();
		pom.getShippingTc().getSubmit2().click();
		pom.getPayment_Page().getPayment().click();

		scrollUpAndDown(400);

		TakesScreenShot("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Screenshot\\automation.png");

		quit();

	}

}
