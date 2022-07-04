package br.com.skw.folha.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import br.com.skw.folha.core.BasePage;
import static br.com.skw.folha.core.DriverFactory.getDriver;

public class CalculoPage extends BasePage {
		
	public void abreCalculoIndividual() {
		entrarFrame(getDriver().findElement(By.xpath("//iframe[contains(@src,'/mgepes/CalculoIndFolha')]")));
		clicarBotao(By.xpath("(//div[@class='center-self display-flex align-center only-margin-left-auto margin-right-auto'])[3]"));
		sairFrame();
	}
	
	public void abreCardCalculoIndividualMensal() {
		entrarFrame(getDriver().findElement(By.xpath("//iframe[contains(@src,'/mgepes/CalculoIndFolha')]")));
		clicarBotao(By.xpath("//div[@id='N']"));
		
	}
	
	public void preencheReferencia(String ref) {
		escrever(By.xpath("//input[@id='input_60']"), ref);
	}
	
	public void preencheDataPagamento(String ref) {
		escrever(By.xpath("//input[@id='input_62']"), ref);
	}
		
	public void preencheCodEmp(String codEmp) {
		escreverDepoisTab(By.xpath("//input[@id='input_65']"), codEmp);
	}
	
	public void preencheCodFunc(String codFunc) {
		escrever(By.xpath("//input[@id='input_68']"), codFunc);
	}
	
}
