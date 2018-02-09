package com.choucair.serenitybddjbehave.definitions;
import org.jbehave.core.annotations.*;

import com.choucair.serenitybddjbehave.steps.BuscarProductoEnElPortalSteps;

import net.thucydides.core.annotations.Steps;
public class BuscarProductoEnElPortalDefinition{
	
	
	@Steps 
	BuscarProductoEnElPortalSteps buscarProductoEnElPortalSteps;
	
	@Given("Estoy en la pagina del exito.com")
	public void givenEstoyEnLaPaginaDelExitocom(){
		 buscarProductoEnElPortalSteps.AbrirElPortalDelExito();
	}
	@When("Buscar un producto que deseo adquirir por el nombre")
	public void whenBuscarUnProductoQueDeseoAdquirirPorElNombre(){
		buscarProductoEnElPortalSteps.EscribirEnLaBarraDeBusquedaElNombreDelProducto(); 
	}
	@Then("Encontrare articulos relacionados con el nombre")
	public void thenEncontrareArticulosRelacionadosConElNombre(){
		buscarProductoEnElPortalSteps.VerificarQueElPortalMeTraeResultadosRelacionados();
		System.out.println("");
	}
}