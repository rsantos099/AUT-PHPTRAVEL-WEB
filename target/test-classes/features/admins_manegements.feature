# language: pt

Funcionalidade: Visualização de Menu

Contexto:
	Dado que eu esteja na tela de login
		Quando faco o login com o usuario "admin@phptravels.com" e senha "demoadmin" 
		Dado que eu esteja na tela Home
		Quando acesso o menu Accounts	
		
@IncluirAdministrador
Cenário: Incluir administrador
	   Dado que eu esteja na tela Admins Management
	   Quando  Incluo um administrador
	   |Fisrt Name |Last Name |Email						  |Password    |Mobile Number|Country|Address 1  |Address 2|Status | Add |Edit|Remove   |
     |Matheus    |Ferreira  |fffb@teste.com.br   |123456    	|11988888888  |Brazil |Rua Jandira|Casa 2   |Enabled|Tours|Cars|Locations|
	   Então administrador cadastrado com sucesso
	   
	  @InluiraAdm
	  Esquema do Cenário: Inclusão de Adminstradores
	  Dado que eu esteja na tela Admins Management
	  Quando incluo um administrador com os valores "<Fisrt Name>", "<Last Name>", "<Email>", "<Password>", "<Mobile Number>", "<Country>", "<Address 1>", "<Address 2>", "<Status>", "<Add>", "<Edit>", "<Remove>"
	  Então "<Email>" administrador cadastrado com sucesso
	  
	  
	  Exemplos:
	  |Fisrt Name |Last Name |Email						   |Password    |Mobile Number|Country|Address 1  |Address 2|Status | Add |Edit|Remove   |
    |Matheus    |Ferreira  |fffd@teste.com.br  |123456    	 |11988888888  |Brazil |Rua Jandira|Casa 2   |Enabled|Tours|Cars|Locations|
    |Carlos     |Santos    |santos@teste.com.br|123456    	 |11988888888  |Mexico |Rua Jandira|Casa 2   |Enabled|Tours|Cars|Locations|
    |Rafael     |Silva     |silva@teste.com.br |123456    	 |11988888888  |Niger |Rua Jandira|Casa 2   |Enabled|Tours|Cars|Locations|