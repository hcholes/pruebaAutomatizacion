package co.com.sofka.certificacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/crear_cuenta.feature", 
glue="co.com.sofka.certificacion.definitions",
snippets= SnippetType.CAMELCASE)
public class CreacionCuentaRunner {

}
