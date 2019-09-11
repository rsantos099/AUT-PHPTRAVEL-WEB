package curso.treinamento.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class LoginSteps {

	public WebDriver driver;
	
	@Dado("que eu deseje logar no sistema")
	public void que_eu_deseje_logar_no_sistema() {
	 System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\windows\\chromedriver.exe");
	 driver = new ChromeDriver();
	 
	 driver.get("https://www.phptravels.net/admin");
	 
	
	}	
	@Quando("faco o login com o usuario {string} e senha {string}")
	public void faco_o_ligin_com_o_usuario_e_senha(String user, String pass) {
	  
        driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass); 
		 driver.findElement(By.xpath("//span[text()='Login']")).click();
	
	}

	@Entao("sou autenticado")
	public void sou_autenticado() throws InterruptedException {
    Thread.sleep(5000);
	Assert.assertTrue(driver.findElement(By.xpath("//a[@href='https://www.phptravels.net/admin/logout']")).isDisplayed());	
	}
	
	
	@Entao("é apresentada a mensagem The Email field must contain a valid email address")
	public void é_apresentada_a_mensagem() throws InterruptedException{
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//p[text()='The Email field must contain a valid email address.']")).isDisplayed());
	}
	
	
	// //p[text()='The Email field must contain a valid email address.']
	
	


}
