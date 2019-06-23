package co.com.sofka.certificacion.definitions;

import java.util.List;
import java.util.Map;

import co.com.sofka.certificacion.steps.CrearCuentaStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CrearCuentaDefinitions {
	
	@Steps
	CrearCuentaStep crearCuentaStep;
	
	@When("^le da click en la opcion para agregar cuenta$")
	public void leDaClickEnLaOpcionParaAgregarCuenta() {
		crearCuentaStep.ClickOpcion();
	}

	@Then("^escribe el correo electronico para entrar a registrarse \"([^\"]*)\"$")
	public void escribeElCorreoElectronicoParaEntrarARegistrarse(String strEmail)  {
		crearCuentaStep.entrarAlRegistro(strEmail);; 
	}
	@When("^digita los demas datos hasta completar el registro$")
	public void digitaLosDemasDatosHastaCompletarElRegistro(List<Map<String, String>> mapDatos)  {
	    crearCuentaStep.digitardatos(mapDatos);
	}

	@Then("^podra ver el resultado de la creacion con el mensaje (.*)$")
	public void podraVerElResultadoDeLaCreacionConElMensajeBienvenidoATuCuenta(String strMensaje) {
	   crearCuentaStep.verificarCuenta(strMensaje);
	}


}
