package co.com.sofka.certificacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class EntrarCuentaPage extends PageObject {

	@FindBy(xpath = "//input[@id='email']")
	private WebElementFacade txtEmail;

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElementFacade txtPass;

	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElementFacade btnIngresar;

	public void digitarEmail(String strEmail) {
		txtEmail.sendKeys(strEmail);

	}

	public void digitarPass(String strPass) {
		txtPass.sendKeys(strPass);

	}

	public void clickIngresar() {
		btnIngresar.click();

	}

}
