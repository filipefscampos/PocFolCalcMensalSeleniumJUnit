package br.com.skw.folha.core;

public class Propriedades {
	
	public static boolean FECHAR_BROWSER = true;
	
	public static Browsers browsers = Browsers.CHROME;
	
	//public static String NOME_CONTA_ALTERADA = "Conta do Teste Alterada " + System.nanoTime();
	
	public enum Browsers {
		CHROME,
		FIREFOX
	}
}
