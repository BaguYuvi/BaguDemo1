package org.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class trial {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\BAGULEYAN\\eclipse-workspace\\SeleniumLocators\\driver\\msedgedriver.exe");

	WebDriver driver = new EdgeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	driver.manage().window().maximize();
}
}
