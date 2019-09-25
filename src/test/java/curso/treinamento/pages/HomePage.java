package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[@href='https://www.phptravels.net/admin/logout']")
	private WebElement linkLogout;
	public Boolean validar_pagina() {
		return linkLogout.isDisplayed();
		
	}
}