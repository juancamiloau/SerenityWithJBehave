package com.choucair.serenitybddjbehave.steps;
import static org.hamcrest.Matchers.equalTo;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BuscarUsuarioGitConRestServiceSteps extends ScenarioSteps {
	private static final long serialVersionUID = 1L;
	String strURL = "https://api.github.com/users/";

	@Step("Hacer la peticion con el nombre de usuario: {0}")
	public void BuscarNombreUsuario(String strName) {
		SerenityRest.when().get(strURL + strName);
	}

	@Step("Buscar si ejecuto correctamente")
	public void BuscarSiEjecutoCorrectamente() {
		SerenityRest.then().statusCode(200);
	}

	@Step("Se hallara el nombre de usuario: {0}")
	public void SeHallaraElNombreDeUsaurio(String strName) {
		SerenityRest.then().assertThat().body("login", equalTo(strName));
	}

}
