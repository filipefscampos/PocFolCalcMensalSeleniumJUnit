package br.com.skw.folha.pages;

import org.openqa.selenium.By;

import br.com.skw.folha.core.BasePage;
import static br.com.skw.folha.core.DriverFactory.getDriver;

public class CalculoPage extends BasePage {
	
	public void entrarFrameCalcInd() {
		entrarFrame(getDriver().findElement(By.xpath("//iframe[contains(@src,'/mgepes/CalculoIndFolha')]")));
		}

	public void abreCalculoIndividual() {
		entrarFrameCalcInd();
		clicarBotao(By.xpath(
				"(//div[@class='center-self display-flex align-center only-margin-left-auto margin-right-auto'])[3]"));
		sairFrame();
	}

	public void abreCardCalculoIndividualMensal() {
		entrarFrameCalcInd();
		clicarBotao(By.xpath("//div[@id='N']"));
		sairFrame();

	}

	public void preencheReferencia(String ref) {
		entrarFrameCalcInd();
		escrever(By.xpath("//input[@id='input_60']"), ref);
		sairFrame();
	}

	public void preencheDataPagamento(String ref) {
		entrarFrameCalcInd();
		escrever(By.xpath("//input[@id='input_62']"), ref);
		sairFrame();
	}

	public void preencheCodEmp(String codEmp) {
		entrarFrameCalcInd();
		escreverDepoisTab(By.xpath("//input[@id='input_65']"), codEmp);
		sairFrame();
	}

	public String pegaNomeEmp() {
		entrarFrameCalcInd();
		String nomeEmp = obterTexto(By.xpath("//input[@id='input_67']"));
		sairFrame();
		return nomeEmp;
	}

	public void preencheCodFunc(String codFunc) {
		entrarFrameCalcInd();
		escreverDepoisTab(By.xpath("//input[@id='input_68']"), codFunc);
		sairFrame();
	}

	public String pegaNomeFunc() {
		entrarFrameCalcInd();
		String nomeFunc = obterTexto(By.xpath("//input[@id='input_70']"));
		sairFrame();
		return nomeFunc;
	}
	
	public void clicarBtnProximo() {
		entrarFrameCalcInd();
		clicarBotao(By.xpath(("(//button[@id='testProxBtn'])[1]")));
		sairFrame();
	}
	
	public void clicarBtnCalcular() {
		entrarFrameCalcInd();
		clicarBotao(By.xpath("//button[@id='testCalcBtn']"));
		sairFrame();
	}

}
