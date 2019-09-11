# language: pt

Funcionalidade: Login
 
@login
  Cenario: Realizar Login com sucesso
		Dado que eu deseje logar no sistema
		Quando faco o login com o usuario "admin@phptravels.com" e senha "demoadmin" 
		Entao sou autenticado
	

	@atividade
	
	
	 Cenario: Realizar Login com email inválido
		Dado que eu deseje logar no sistema
		Quando faco o login com o usuario "teste" e senha "demoadmin" 
		Entao é apresentada a mensagem The Email field must contain a valid email address	
		