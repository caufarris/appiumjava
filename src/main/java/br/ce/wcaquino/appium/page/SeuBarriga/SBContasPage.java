package br.ce.wcaquino.appium.page.SeuBarriga;

import org.openqa.selenium.By;

import br.ce.wcaquino.appium.core.BasePage;

public class SBContasPage extends BasePage {

	public void setConta(String nome) {
		escrever(By.className("android.widget.EditText"), nome);
	}

	public void salvar() {
		clicarPorTexto("SALVAR");
	}

	public void excluir() {
		clicarPorTexto("EXCLUIR");
	}

	public void selecionarConta(String conta) {
		clicarLongo(By.xpath("//*[@text='" + conta + "']"));

	}

}
