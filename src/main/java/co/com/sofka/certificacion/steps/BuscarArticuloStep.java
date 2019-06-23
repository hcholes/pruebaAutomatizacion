package co.com.sofka.certificacion.steps;

import co.com.sofka.certificacion.pages.IngresarTextoBuscarPage;
import co.com.sofka.certificacion.pages.PaginaPrincipalPage;
import net.thucydides.core.annotations.Step;

public class BuscarArticuloStep {
	
	PaginaPrincipalPage paginaPrincipalPage;
	IngresarTextoBuscarPage ingresarTextoBuscar;

	@Step
	public void abrirNavegador() {
		paginaPrincipalPage.open();
	}

	@Step
	public void ingresarArticulo(String articulo) {
		ingresarTextoBuscar.ingresarArticuloABuscar(articulo);
		ingresarTextoBuscar.clickBuscar();
	}
	
	@Step
	public boolean validacionBusqueda() {
		return ingresarTextoBuscar.verificarBusqueda();
	}

}
