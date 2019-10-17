package curso.treinamento.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.HomePage;
import curso.treinamento.pages.LoginPage;
import curso.treinamento.setup.Hooks;


public class LoginSteps {
	
	private LoginPage loginPage = new LoginPage(Hooks.getDriver());
	private HomePage homePage = new HomePage(Hooks.getDriver());

	
	@Dado("que eu esteja na tela de login")
	public void que_eu_deseje_logar_no_sistema() throws InterruptedException {
		
	loginPage.clicar_remove_frame();
	
	Assert.assertTrue("Página Login não apresentada", loginPage.validar_pagina());
	
	}	
	
	@Quando("faco o login com o usuario {string} e senha {string}")
	public void faco_o_ligin_com_o_usuario_e_senha(String user, String pass) {
	  
		loginPage.preencher_email(user);
		loginPage.preencher_password(pass);
		loginPage.clicar_botao_login();
	}

	@Entao("sou autenticado")
	public void sou_autenticado() throws InterruptedException {
		
		Assert.assertTrue("Pagina home não encontrada", homePage.validar_pagina());
	}
	
	
	@Entao("é apresentada a mensagem The Email field must contain a valid email address")
	public void é_apresentada_a_mensagem() throws InterruptedException{
	
	}

}
