package br.com.skw.folha.core;

import static br.com.skw.folha.core.DriverFactory.getDriver;
import static br.com.skw.folha.core.DriverFactory.KillDriver;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import br.com.skw.folha.pages.LoginPage;

public class BaseTest {

	@Rule
	public TestName testname = new TestName();

	private static LoginPage page = new LoginPage();

	@BeforeEach
	public void inicializa() {
		page.acessarTelaInicial();
		page.setUsuario("rh");
		page.setSenha("123456");
		page.entrar();
	}

	@AfterEach
	public void finaliza() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(arquivo, new File(
				"target" + File.separator + "screenshot" + File.separator + testname.getMethodName() + ".jpg"));

		if (Propriedades.FECHAR_BROWSER) {
			KillDriver();
		}
	}

}
