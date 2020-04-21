import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;

public class webJUnitTest {
	private WebDriver driver;
	private String url;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "B:/下载软件/火狐/geckodriver.exe");
		driver = new FirefoxDriver();
		url="https://www.baidu.com";
		driver.get(url);
//		driver.manage().timeout.implicitlyWait(30,);
	}

	@Test
	public void test1() {
		WebElement element = driver.findElement(By.id("wrapper"));
		assertEquals(element.getTagName(), "div");
	}
	
	@Test
	public void test2() {
		WebElement element = driver.findElement(By.cssSelector("a.mnav:nth-child(4)"));
		assertEquals(element.getText(), "地图");
	}
	
	
	@Test
	public void test3() {
		WebElement element = driver.findElement(By.cssSelector("a.mnav:nth-child(6)"));
		assertEquals(element.getText(), "贴吧");
	}
}
