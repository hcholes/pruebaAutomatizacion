package co.com.sofka.certificacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IngresarTextoBuscarPage extends PageObject{
	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElementFacade txtArticulo;
	
	@FindBy(xpath = "//button[@name='submit_search']")
	private WebElementFacade btnBuscar;
	
	@FindBy(xpath = "//span[@class='lighter']")
	private WebElementFacade lblBusqueda;
	
	
	public void ingresarArticuloABuscar(String articulo) {
		getDriver().manage().window().maximize();
		txtArticulo.type(articulo);
	}
	
	public void clickBuscar() {
		btnBuscar.submit();
	}

	public boolean verificarBusqueda() {
		return lblBusqueda.isVisible();	
	}

}
