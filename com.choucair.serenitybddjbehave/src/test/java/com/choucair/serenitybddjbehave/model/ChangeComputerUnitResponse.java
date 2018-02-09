
package com.choucair.serenitybddjbehave.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeComputerUnitResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "changeComputerUnitResult"
})
@XmlRootElement(name = "ChangeComputerUnitResponse")
public class ChangeComputerUnitResponse {

    @XmlElement(name = "ChangeComputerUnitResult")
    protected double changeComputerUnitResult;

    /**
     * Obtiene el valor de la propiedad changeComputerUnitResult.
     * 
     */
    public double getChangeComputerUnitResult() {
        return changeComputerUnitResult;
    }

    /**
     * Define el valor de la propiedad changeComputerUnitResult.
     * 
     */
    public void setChangeComputerUnitResult(double value) {
        this.changeComputerUnitResult = value;
    }

}
