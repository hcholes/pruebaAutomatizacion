package co.com.sofka.certificacion.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import co.com.sofka.certificacion.pages.CreacionCuentaPage;
import net.thucydides.core.annotations.Step;

public class CrearCuentaStep {
	CreacionCuentaPage creacionCuentaPage;

	@Step
	public void ClickOpcion() {
		creacionCuentaPage.clickOpcion();
	}

	@Step
	public void entrarAlRegistro(String strEmail) {
		creacionCuentaPage.digitarEmail(strEmail);
		creacionCuentaPage.clickCrearCuenta();
	}

	@Step
	public void digitardatos(List<Map<String, String>> mapDatos) {
		creacionCuentaPage.seleccionGenero(mapDatos.get(0).get("strGenero"));
		creacionCuentaPage.digitarFirstName(mapDatos.get(0).get("strFirstName"));
		creacionCuentaPage.digitarLastName(mapDatos.get(0).get("strLastNaame"));
		creacionCuentaPage.digitarPassword(mapDatos.get(0).get("strPassword"));
		creacionCuentaPage.seleccionDiaNacimieto(mapDatos.get(0).get("strDiaNac"));
		creacionCuentaPage.seleccionMesNacimieto(mapDatos.get(0).get("strMesNac"));
		creacionCuentaPage.seleccionAnoNacimieto(mapDatos.get(0).get("strAnoNac"));
		creacionCuentaPage.digitarAddress(mapDatos.get(0).get("strAddress"));
		creacionCuentaPage.digitarCity(mapDatos.get(0).get("strCity"));
		creacionCuentaPage.seleccionState(mapDatos.get(0).get("strState"));
		creacionCuentaPage.digitarPostal(mapDatos.get(0).get("strPostal"));
		creacionCuentaPage.digitarInfAdicional(mapDatos.get(0).get("strInfAdiocional"));
		creacionCuentaPage.digitarMobile(mapDatos.get(0).get("strMobile"));
		creacionCuentaPage.digitarAlias(mapDatos.get(0).get("strAlias"));
		
		creacionCuentaPage.clickRegister();

	}

	@Step
	public void verificarCuenta(String strMensaje) {
		assertEquals(strMensaje, creacionCuentaPage.capturaMensaje());
		
	}



}
