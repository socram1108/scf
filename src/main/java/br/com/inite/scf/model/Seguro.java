/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package br.com.inite.scf.model;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=true)
@Table(name="Seguro")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ObrigacaoID", referencedColumnName="ID")
public class Seguro extends br.com.inite.scf.model.Obrigacao implements Serializable {
	private static final long serialVersionUID = 1L;

	public Seguro() {
	}
	
	@Column(name="Operadora", nullable=true, length=255)	
	private String operadora;
	
	@Column(name="Parcelado", nullable=false, length=1)	
	private boolean parcelado;
	
	@Column(name="ValorParcela", nullable=true)	
	private Double valorParcela;
	
	@Column(name="Pago", nullable=false, length=1)	
	private boolean pago;
	
	public void setOperadora(String value) {
		this.operadora = value;
	}
	
	public String getOperadora() {
		return operadora;
	}
	
	public void setParcelado(boolean value) {
		this.parcelado = value;
	}
	
	public boolean getParcelado() {
		return parcelado;
	}
	
	public void setValorParcela(double value) {
		setValorParcela(new Double(value));
	}
	
	public void setValorParcela(Double value) {
		this.valorParcela = value;
	}
	
	public Double getValorParcela() {
		return valorParcela;
	}
	
	public void setPago(boolean value) {
		this.pago = value;
	}
	
	public boolean getPago() {
		return pago;
	}
	
}
