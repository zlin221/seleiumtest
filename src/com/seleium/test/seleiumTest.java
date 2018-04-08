package com.seleium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleiumTest {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files (x86)\\chromedriver_win32-234\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.baidu.com/");
	}
}
