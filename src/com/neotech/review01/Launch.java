package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public final static String url = "https://www.nytimes.com/games/wordle/index.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		String currentUrl = driver.getCurrentUrl();

		if (url.equals(currentUrl)) {
			System.out.println("urls are the same");
		} else {
			System.out.println("urls are different");
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
