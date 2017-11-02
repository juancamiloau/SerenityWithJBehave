
package com.choucair.serenitybdd.labserenitywithjbehave.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="ComputerValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fromComputerUnit" type="{http://www.webserviceX.NET/}Computers"/>
 *         &lt;element name="toComputerUnit" type="{http://www.webserviceX.NET/}Computers"/>
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
    "computerValue",
    "fromComputerUnit",
    "toComputerUnit"
})
@XmlRootElement(name = "ChangeComputerUnit")
public class ChangeComputerUnit {

    @XmlElement(name = "ComputerValue")
    protected double computerValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Computers fromComputerUnit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Computers toComputerUnit;

    /**
     * Obtiene el valor de la propiedad computerValue.
     * 
     */
    public double getComputerValue() {
    	System.out.println("");
        return computerValue;
    }

    /**
     * Define el valor de la propiedad computerValue.
     * 
     */
    public void setComputerValue(double value) {
        this.computerValue = value;
    }

    /**
     * Obtiene el valor de la propiedad fromComputerUnit.
     * 
     * @return
     *     possible object is
     *     {@link Computers }
     *     
     */
    public Computers getFromComputerUnit() {
        return fromComputerUnit;
    }

    /**
     * Define el valor de la propiedad fromComputerUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Computers }
     *     
     */
    public void setFromComputerUnit(Computers value) {
        this.fromComputerUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad toComputerUnit.
     * 
     * @return
     *     possible object is
     *     {@link Computers }
     *     
     */
    public Computers getToComputerUnit() {
        return toComputerUnit;
    }

    /**
     * Define el valor de la propiedad toComputerUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Computers }
     *     
     */
    public void setToComputerUnit(Computers value) {
        this.toComputerUnit = value;
    }

}
