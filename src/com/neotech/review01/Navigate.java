package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://www.instagram.com";

		// driver.get(url);
		// will NOT keep history

		driver.navigate().to(url);
		// ^^^this is the same thing
		// will NOT wait for page and elements to be loaded
		// will keep history

		Thread.sleep(2000);

		driver.manage().window().maximize();
		// will make page full size

		Thread.sleep(2000);

		// driver.manage().window().minimize();

		Thread.sleep(2000);

		String fakeNews = "https://www.foxnews.com/";
		driver.navigate().to(fakeNews);
		Thread.sleep(500);

		String fifa = "https://www.fifa.com/";
		driver.navigate().to(fifa);
		Thread.sleep(3000);

		driver.navigate().back(); // brings us one page back to fox news
		Thread.sleep(500);

		driver.navigate().back(); // bring us back to the first page to IG
		Thread.sleep(1000);

		driver.navigate().forward();
		Thread.sleep(1000);

		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.quit();

	}

}
