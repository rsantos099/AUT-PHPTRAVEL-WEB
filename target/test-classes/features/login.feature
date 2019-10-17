# language: pt

Funcionalidade: Login
 
@logincomsucesso
  Cenario: Realizar Login com sucesso
		Dado que eu esteja na tela de login
		Quando faco o login com o usuario "admin@phptravels.com" e senha "demoadmin" 
		Entao sou autenticado
	

	@LoginInvalido
	
	
	 Cenario: Realizar Login com email inválido
		Dado que eu deseje logar no sistema
		Quando faco o login com o usuario "teste" e senha "demoadmin" 
		Entao é apresentada a mensagem The Email field must contain a valid email address
		
			
		