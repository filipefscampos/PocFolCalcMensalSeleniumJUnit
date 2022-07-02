package br.com.skw.folha.pages;

import org.openqa.selenium.By;

import br.com.skw.folha.core.BasePage;

public class CalculoPage extends BasePage {
	
	public void abreCalculoIndividual() {
		entrarFrame("//iframe[contains(@src,'/mgepes/CalculoIndFolha')]");
		clicarBotao(By.xpath("(//div[@class='center-self display-flex align-center "
				+ "only-margin-left-auto margin-right-auto'])[3]"));
	}
	
}
