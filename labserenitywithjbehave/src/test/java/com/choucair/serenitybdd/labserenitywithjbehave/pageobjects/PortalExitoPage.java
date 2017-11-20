package com.choucair.serenitybdd.labserenitywithjbehave.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.exito.com")
public class PortalExitoPage extends PageObject{
	@FindBy(xpath = "//input[@name='Ntt']")
	private WebElementFacade txtBarraPrincipal;
	
	public void EscribirEnLaBarraDeBusqueda(String strPalabra) {
		waitFor(2).seconds();
		txtBarraPrincipal.typeAndEnter(strPalabra);
	}
	
	public boolean VerificarResultadosRelacionados (String strPalabra) {
		return containsText(strPalabra);
	}
}
