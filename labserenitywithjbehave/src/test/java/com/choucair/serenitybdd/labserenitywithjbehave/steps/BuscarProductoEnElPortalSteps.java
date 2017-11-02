package com.choucair.serenitybdd.labserenitywithjbehave.steps;

import com.choucair.serenitybdd.labserenitywithjbehave.pageobjects.PortalExitoPage;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.is;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BuscarProductoEnElPortalSteps extends ScenarioSteps{
	private static final long serialVersionUID = 1L;
	PortalExitoPage portalExitoPage; 
	String strProducto;
	
	@Step("Abrir el portal del exito")
	public void AbrirElPortalDelExito() {
		portalExitoPage.open();
	}
	
		
	@Step("Escribir en la barra de busqueda el nombre del producto")
	public void EscribirEnLaBarraDeBusquedaElNombreDelProducto() {
		portalExitoPage.EscribirEnLaBarraDeBusqueda(strProducto = "Silla");
	}
	
	@Step("Verificar que el portal me trae resultados relacionados")
	public void VerificarQueElPortalMeTraeResultadosRelacionados() {
		assertThat(true,is(portalExitoPage.VerificarResultadosRelacionados(strProducto)));
	}
}
