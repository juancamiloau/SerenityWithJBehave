package com.choucair.serenitybdd.labserenitywithjbehave.definitions;
import org.jbehave.core.annotations.*;

import com.choucair.serenitybdd.labserenitywithjbehave.steps.ConvertirMegabytesAKilobytesSteps;

import net.thucydides.core.annotations.Steps;
public class ConvertirMegabytesAKilobytesDefinition{
	
	@Steps
	ConvertirMegabytesAKilobytesSteps convertirMegabytesAKilobytesSteps;
	
	@Given("tengo un servicio SOAP de conversion")
	public void givenTengoUnServicioSOAPDeConversion(){
		convertirMegabytesAKilobytesSteps.CrearElServicio();
	}
	@When("mando el numero de megabytes a convertir")
	public void whenMandoElNumeroDeMegabytesAConvertir(){
		convertirMegabytesAKilobytesSteps.EnviarElValorDeMegasAConvertir(2);
	}
	@Then("el servicio me responde el valor en kilobytes")
	public void thenElServicioMeRespondeElValorEnKilobytes(){
		convertirMegabytesAKilobytesSteps.EnviarElValorDeMegasAConvertir(2048);
	}
	
}