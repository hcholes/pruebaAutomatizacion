package co.com.sofka.certificacion.definitions;

import co.com.sofka.certificacion.steps.BuscarArticuloStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BuscarArticuloDefinitions {
	
	@Steps
	BuscarArticuloStep buscarArticuloStep;
	
	@Given("^que el usuario esta en la pagina web$")
	public void queElUsuarioEstaEnLaPaginaWeb(){
		buscarArticuloStep.abrirNavegador();  
	}


	@When("^busca (.*) a traves de la opcion expuesta en la pagina$")
	public void buscaATravesDeLaOpcionExpuestaEnLaPagina(String articulo) {
		buscarArticuloStep.ingresarArticulo(articulo);
	}

	@Then("^podra ver el resultado de la busqueda$")
	public void podraVerElResultadoDeLaBusqueda()  {
	 buscarArticuloStep.validacionBusqueda(); 
	}


}
