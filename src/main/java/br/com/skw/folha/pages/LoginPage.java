package br.com.skw.folha.pages;

import org.openqa.selenium.By;

import br.com.skw.folha.core.BasePage;
import br.com.skw.folha.core.DriverFactory;

public class LoginPage extends BasePage {

	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://folhahomologrc411.qa.sankhya.com.br/");
	}

	public void setUsuario(String usuario) {
		escrever("login", usuario);
	}

	public void setSenha(String senha) {
		escrever("password", senha);
	}

	public void entrar() {
		clicarBotao(By.xpath("//button[@class=\"btn-login\"]"));
	}

	public void logar(String usuario, String senha) {
		setUsuario(usuario);
		setSenha(senha);
		entrar();
	}

	public void resetar() {
		clicarLink("reset");
	}

}
