package br.ce.wcaquino.appium.page.SeuBarriga;

import org.openqa.selenium.By;

import br.ce.wcaquino.appium.core.BasePage;
import io.appium.java_client.MobileElement;

import static br.ce.wcaquino.appium.core.DriverFactory.getDriver;

public class SBResumoPage extends BasePage {
	
	
	public void excluirMovimentacao(String desc) {
		MobileElement el = getDriver().findElement(By.xpath("//*[@text='"+desc+"']"));
		swipeElement(el, 0.9, 0.1);
		clicarPorTexto("Del");
		
	}
	
}