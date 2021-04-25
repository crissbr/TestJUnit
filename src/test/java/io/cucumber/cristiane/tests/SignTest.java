package io.cucumber.cristiane.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignTest {
	@Test
	public void TestFazerLoginNoTaskit () {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		WebDriver navegador = new ChromeDriver();
		
		navegador.get("http://www.juliodelima.com.br/taskit/");
		
		
		navegador.findElement(By.linkText("Sign in")).click();
		navegador.findElement(By.cssSelector("#signinbox > div.modal-content > form > div:nth-child(3) > div:nth-child(1) > input")).sendKeys("cris001");
		navegador.findElement(By.cssSelector("#signinbox > div.modal-content > form > div:nth-child(3) > div:nth-child(2) > input")).sendKeys("123456");
		navegador.findElement(By.cssSelector("#signinbox > div.modal-footer > a")).click();
//		navegador.findElement(By.linkText("SIGN IN")).click();
		navegador.quit();
		

	}

}
