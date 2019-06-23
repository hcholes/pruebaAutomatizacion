package co.com.sofka.certificacion.steps;

import co.com.sofka.certificacion.pages.EntrarCuentaPage;

public class IngresarCuentaStep {
	
EntrarCuentaPage entrarCuentaPage;

	public void entrarACuenta(String strEmail, String strPass) {
		entrarCuentaPage.digitarEmail(strEmail);
		entrarCuentaPage.digitarPass(strPass);
		entrarCuentaPage.clickIngresar();
		
	}

}
