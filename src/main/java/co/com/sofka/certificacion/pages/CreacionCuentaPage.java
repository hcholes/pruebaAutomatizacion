package co.com.sofka.certificacion.pages;

import co.com.sofka.certificacion.utils.RobotUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreacionCuentaPage extends PageObject {

	@FindBy(xpath = "//a[@class='login']")
	private WebElementFacade btnLogin;

	@FindBy(xpath = "//button[@id='submitAccount']")
	private WebElementFacade btnRegister;

	@FindBy(xpath = "//input[@id='email_create']")
	private WebElementFacade txtEmail;

	@FindBy(xpath = "//button[@id='SubmitCreate']")
	private WebElementFacade btnCrearCuenta;

	@FindBy(xpath = "//div[@id='uniform-id_gender1']")
	private WebElementFacade rdbMr;

	@FindBy(xpath = "//div[@id='uniform-id_gender2']")
	private WebElementFacade rdbMs;

	@FindBy(xpath = "//input[@id='customer_firstname']")
	private WebElementFacade txtFirstName;

	@FindBy(xpath = "//input[@id='customer_lastname']")
	private WebElementFacade txtLastName;

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElementFacade txtPass;

	@FindBy(xpath = "//input[@id='address1']")
	private WebElementFacade txtAddress;

	@FindBy(xpath = "//input[@id='city']")
	private WebElementFacade txtCity;

	@FindBy(xpath = "//input[@id='postcode']")
	private WebElementFacade txtPostal;

	@FindBy(xpath = "//textarea[@id='other']")
	private WebElementFacade txtInfAdicional;

	@FindBy(xpath = "//input[@id='phone_mobile']")
	private WebElementFacade txtMobile;

	@FindBy(xpath = "//input[@id='alias']")
	private WebElementFacade txtAlias;

	@FindBy(xpath = "//div[@id='uniform-days']")
	private WebElementFacade selFlechaDias;

	@FindBy(xpath = "//div[@id='uniform-months']")
	private WebElementFacade selFlechaMes;

	@FindBy(xpath = "//div[@id='uniform-years']")
	private WebElementFacade selFlechaAnos;

	@FindBy(xpath = "//div[@id='uniform-id_state']")
	private WebElementFacade selFlechaState;

	public void clickOpcion() {
		getDriver().manage().window().maximize();
		btnLogin.click();
	}

	public void digitarEmail(String strEmail) {
		txtEmail.sendKeys(strEmail);
	}

	public void clickCrearCuenta() {
		btnCrearCuenta.click();
	}

	public void seleccionGenero(String strGenero) {
		waitABit(300);
		if (strGenero.equals("Mr")) {
			rdbMr.click();
		} else {
			rdbMs.click();
		}

	}

	public void digitarFirstName(String strFirstName) {

		txtFirstName.sendKeys(strFirstName);
	}

	public void digitarLastName(String strLastName) {

		txtLastName.sendKeys(strLastName);
	}

	public void digitarPassword(String strPassword) {
		txtPass.sendKeys(strPassword);

	}

	public void seleccionDiaNacimieto(String strDiaNacimiento) {
		selFlechaDias.click();
		getDriver().findElement(By.xpath("//option[@value='" + strDiaNacimiento + "']")).click();

	}

	public void seleccionMesNacimieto(String strMesNacimiento) {
		selFlechaMes.click();

		switch (strMesNacimiento) {
		case "January":
			getDriver().findElement(By.xpath("//*[@id='months']/option[1]")).click();
			break;
		case "February":
			getDriver().findElement(By.xpath("//*[@id='months']/option[2]")).click();
			break;
		case "March":
			getDriver().findElement(By.xpath("//*[@id='months']/option[3]")).click();
			break;
		case "April":
			getDriver().findElement(By.xpath("//*[@id='months']/option[4]")).click();
			break;
		case "May":
			getDriver().findElement(By.xpath("//*[@id='months']/option[5]")).click();
			break;
		case "June":
			getDriver().findElement(By.xpath("//*[@id='months']/option[6]")).click();
			break;
		case "July":
			getDriver().findElement(By.xpath("//*[@id='months']/option[7]")).click();
			break;
		case "August":
			getDriver().findElement(By.xpath("//*[@id='months']/option[8]")).click();
			break;
		case "September":
			getDriver().findElement(By.xpath("//*[@id='months']/option[9]")).click();
			break;
		case "October":
			getDriver().findElement(By.xpath("//*[@id='months']/option[10]")).click();
			break;
		case "November":
			getDriver().findElement(By.xpath("//*[@id='months']/option[11]")).click();
			break;
		case "December":
			getDriver().findElement(By.xpath("//*[@id='months']/option[12]")).click();
			break;
		default:
			
		}

	}

	public void seleccionAnoNacimieto(String strAnoNacimiento) {
		selFlechaAnos.click();
		getDriver().findElement(By.xpath("//option[@value='" + strAnoNacimiento + "']")).click();

	}

	public void digitarAddress(String strAddress) {
		txtAddress.sendKeys(strAddress);
	}

	public void digitarCity(String strCity) {
		txtCity.sendKeys(strCity);

	}

	public void digitarPostal(String strPostal) {
		txtPostal.sendKeys(strPostal);
	}

	public void digitarInfAdicional(String strInfAdicional) {
		txtInfAdicional.sendKeys(strInfAdicional);

	}

	public void digitarMobile(String strMobile) {
		txtMobile.sendKeys(strMobile);

	}

	public void digitarAlias(String strAlias) {

		txtMobile.click();
		RobotUtil.fnBotTab();
		txtAlias.sendKeys(strAlias);

	}

	public void seleccionState(String strState) {
		selFlechaState.click();
		switch (strState) {
		case "Alabama":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[2]")).click();
			break;
		case "Alaska":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[3]")).click();
			break;
		case "Arizona":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[4]")).click();
			break;
		case "Arkansas":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[5]")).click();
			break;
		case "California":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[6]")).click();
			break;
		case "Colorado":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[7]")).click();
			break;
		case "Connecticut":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[8]")).click();
			break;
		case "Delaware":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[9]")).click();
			break;
		case "District of Columbia":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[10]")).click();
			break;
		case "Florida":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[11]")).click();
			break;
		case "Georgia":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[12]")).click();
			break;
		case "Hawaii":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[13]")).click();
			break;
		case "Idaho":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[14]")).click();
			break;
		case "Illinois":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[15]")).click();
			break;
		case "Indiana":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[16]")).click();
			break;
		case "Iowa":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[17]")).click();
			break;
		case "Kansas":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[18]")).click();
			break;
		case "Kentucky":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[19]")).click();
			break;
		case "Louisiana":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[19]")).click();
			break;
		case "Maine":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[20]")).click();
			break;
		case "Maryland":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[21]")).click();
			break;
		case "Massachusetts":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[22]")).click();
			break;
		case "Michigan":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[23]")).click();
			break;
		case "Minnesota":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[24]")).click();
			break;
		case "Mississippi":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[25]")).click();
			break;
		case "Missouri":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[26]")).click();
			break;
		case "Montana":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[27]")).click();
			break;
		case "March":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[28]")).click();
			break;
		case "Nevada":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[29]")).click();
			break;
		case "New Hampshire":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[30]")).click();
			break;
		case "New Jersey":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[31]")).click();
			break;
		case "New Mexico":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[32]")).click();
			break;
		case "New York":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[33]")).click();
			break;
		case "North Carolina":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[34]")).click();
			break;
		case "North Dakota":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[35]")).click();
			break;
		case "Ohio":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[36]")).click();
			break;
		case "Oklahoma":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[37]")).click();
			break;
		case "Oregon":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[38]")).click();
			break;
		case "Pennsylvania":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[39]")).click();
			break;
		case "Puerto Rico":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[40]")).click();
			break;
		case "Rhode Island":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[41]")).click();
			break;
		case "South Carolina":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[42]")).click();
			break;
		case "South Dakota":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[43]")).click();
			break;
		case "Tennessee":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[44]")).click();
			break;
		case "Texas":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[45]")).click();
			break;
		case "US Virgin Islands":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[46]")).click();
			break;
		case "Utah":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[47]")).click();
			break;
		case "Vermont":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[48]")).click();
			break;
		case "Virginia":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[49]")).click();
			break;
		case "Washington":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[50]")).click();
			break;
		case "West Virginia":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[51]")).click();
			break;
		case "Wisconsin":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[52]")).click();
			break;
		case "Wyoming":
			getDriver().findElement(By.xpath("//*[@id='id_state']/option[53]")).click();
			break;
		default:
		}

	}

	public void clickRegister() {
		btnRegister.click();
	}

	public String capturaMensaje() {
		String Mensaje = getDriver().findElement(By.xpath("//*[@class='info-account']")).getText();
		return Mensaje.substring(0, 23);
	}

}
