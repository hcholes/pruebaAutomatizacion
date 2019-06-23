package co.com.sofka.certificacion.definitions;

import co.com.sofka.certificacion.steps.IngresarCuentaStep;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class IngresarCuentaDefinitions {

	@Steps
	IngresarCuentaStep ingresarCuentaStep;
	
	
	@Then("^escribe las credenciales para entrar \"([^\"]*)\" \"([^\"]*)\"$")
	public void escribeLasCredencialesParaEntrar(String strEmail, String strPass)  {
		ingresarCuentaStep.entrarACuenta(strEmail, strPass);; 
	}
}
