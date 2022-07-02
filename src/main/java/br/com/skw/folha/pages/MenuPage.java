package br.com.skw.folha.pages;

import static br.com.skw.folha.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import br.com.skw.folha.core.BasePage;

public class MenuPage extends BasePage {
	
	public void abreTelaCalculoFolha() {
		//clicarBotao(By.xpath("//input[@placeholder='Pesquisar']"));
		escrever(By.xpath("//input[@placeholder='Pesquisar']"), "Cálculos");
		getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		clicarBotao(By.xpath("//td[contains(@class,'gwt-MenuItem item-MenuItem firstItem-MenuItem')]"));
	}
	
}
