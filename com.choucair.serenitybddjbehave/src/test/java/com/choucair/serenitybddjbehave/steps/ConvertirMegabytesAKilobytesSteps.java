package com.choucair.serenitybddjbehave.steps;

import com.choucair.serenitybddjbehave.model.ComputerUnit;
import com.choucair.serenitybddjbehave.model.ComputerUnitSoap;
import com.choucair.serenitybddjbehave.model.Computers;

import net.thucydides.core.annotations.Step;

public class ConvertirMegabytesAKilobytesSteps {
	ComputerUnitSoap computerUnitSoap;
	double dblResultado;
	
	@Step("Crear el servicio")
	public void CrearElServicio() {
		computerUnitSoap = new ComputerUnit().getComputerUnitSoap();
	}
	
	@Step("Enviar el valor de megabytes a convertir")
	public void EnviarElValorDeMegasAConvertir(int intValorMegas) {
		dblResultado = computerUnitSoap.changeComputerUnit(intValorMegas, Computers.MEGABYTE, Computers.KILOBYTE);
	}
	
	@Step("El servicio me muestra el valor en kilobytes")
	public void ElServicioMeMuestraElValorEnKiloBytes(double dblValorKilos) {
		assert(dblResultado == dblValorKilos) : "El valor esperado no es el valor recibido";
	}
}
