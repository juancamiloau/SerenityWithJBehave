package com.choucair.serenitybdd.labserenitywithjbehave.definitions;
import org.jbehave.core.annotations.*;
import com.choucair.serenitybdd.labserenitywithjbehave.steps.BuscarUsuarioGitConRestServiceSteps;
import net.thucydides.core.annotations.Steps;

public class BuscarUsuarioGitConRestServiceDefinition{
	
	@Steps BuscarUsuarioGitConRestServiceSteps buscarUsuarioGitConRestServiceSteps;
	
	@Given("Tengo un usuario git existente en la plataforma")	
	public void givenTengoUnUsuarioGitExistenteEnLaPlataforma(){
		buscarUsuarioGitConRestServiceSteps.BuscarNombreUsuario("eugenp");
	}
	@Then("El servicio me responde el JSon del usuario")	
	public void thenElServicioMeRespondeElJSonDelUsuario(){
		buscarUsuarioGitConRestServiceSteps.BuscarSiEjecutoCorrectamente();
	}
	@When("Busco el usuario el servicio API")
	public void whenBuscoElUsuarioElServicioAPI(){
		buscarUsuarioGitConRestServiceSteps.SeHallaraElNombreDeUsaurio("eugenp");
	}
}