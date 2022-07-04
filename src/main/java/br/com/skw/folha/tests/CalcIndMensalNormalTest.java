package br.com.skw.folha.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.skw.folha.core.BaseTest;
import br.com.skw.folha.pages.CalculoPage;
import br.com.skw.folha.pages.MenuPage;
import static br.com.skw.folha.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

public class CalcIndMensalNormalTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	CalculoPage calcPage = new CalculoPage();
	
	@DisplayName("Calculo Individual Mensal 30 dias Normal")
	@Test
	public void calcMensalIndividual() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menuPage.abreTelaCalculoFolha();
		//getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(6000);
		calcPage.abreCalculoIndividual();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		calcPage.abreCardCalculoIndividualMensal();
		
		calcPage.preencheReferencia("07/2022");
		calcPage.preencheDataPagamento("29/07/2022");
		
		calcPage.preencheCodEmp("2");		
		Thread.sleep(5000);
		//System.out.println(calcPage.pegaNomeEmp());
		//Assertions.assertEquals("EMPRESA HOMOLOGACAO 4.12", calcPage.pegaNomeEmp());
		calcPage.preencheCodFunc("14");
		Thread.sleep(5000);
		
		calcPage.clicarBtnProximo();
		Thread.sleep(2000);
		calcPage.clicarBtnCalcular();
		Thread.sleep(5000);		
	}
	
}