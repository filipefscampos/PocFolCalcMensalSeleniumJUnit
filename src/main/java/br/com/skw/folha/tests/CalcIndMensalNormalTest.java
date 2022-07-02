package br.com.skw.folha.tests;

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
	
	@DisplayName("Testa o calculo individual mensal de um funcionário normal 30 dias")
	@Test
	public void calcMensalIndividual() {
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menuPage.abreTelaCalculoFolha();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		calcPage.abreCalculoIndividual();
		
	}
	
}