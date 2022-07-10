package br.com.skw.folha.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

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
		Thread.sleep(3000);
		//System.out.println(calcPage.pegaNomeEmp());
		//Assertions.assertEquals("EMPRESA HOMOLOGACAO 4.12", calcPage.pegaNomeEmp());
		calcPage.preencheCodFunc("14");
		Thread.sleep(3000);
		
		calcPage.clicarBtnProximo();
		Thread.sleep(2000);
		calcPage.clicarBtnCalcular();
		Thread.sleep(5000);		
		
		calcPage.clicarSessaoProventos();
		Thread.sleep(1000);
		Assertions.assertEquals("1", calcPage.pegarValoresDeCalculo("(//div[@id='idProv']//p[@class='center-self ng-binding'])[1]"));
		Assertions.assertEquals("Salario Base", calcPage.pegarValoresDeCalculo("(//div[@id='idProv']//p[@class='center-self ng-binding'])[2]"));
		Assertions.assertEquals("R$ 5.000,00", calcPage.pegarValoresDeCalculo("//p[@id='prov-val-10']"));
		Assertions.assertEquals("30.000", calcPage.pegarValoresDeCalculo("//p[@id='prov-ind-1']"));
		Assertions.assertEquals("11", calcPage.pegarValoresDeCalculo("(//div[@id='idProv']//p[@class='center-self ng-binding'])[3]"));
		Assertions.assertEquals("Periculosidade", calcPage.pegarValoresDeCalculo("(//div[@id='idProv']//p[@class='center-self ng-binding'])[4]"));
		Assertions.assertEquals("R$ 1.500,00", calcPage.pegarValoresDeCalculo("//p[@id='prov-val-110']"));
		Assertions.assertEquals("30.000", calcPage.pegarValoresDeCalculo("//p[@id='prov-ind-11']"));
		Thread.sleep(1000);
		calcPage.clicarSessaoProventos();
	}
	
}