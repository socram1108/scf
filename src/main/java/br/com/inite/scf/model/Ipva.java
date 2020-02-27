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
@Table(name="Ipva")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ObrigacaoID", referencedColumnName="ID")
public class Ipva extends br.com.inite.scf.model.Obrigacao implements Serializable {
	private static final long serialVersionUID = 1L;

	public Ipva() {
	}
	
	@Column(name="Ano", nullable=false, length=11)	
	private int ano;
	
	@Column(name="Parcelado", nullable=true, length=1)	
	private Boolean parcelado;
	
	@Column(name="NroParcela", nullable=true, length=11)	
	private Integer nroParcela;
	
	@Column(name="Pago", nullable=true, length=1)	
	private Boolean pago;
	
	@Column(name="ValorParcela", nullable=true)	
	private Double valorParcela;
	
	public void setAno(int value) {
		this.ano = value;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setParcelado(boolean value) {
		setParcelado(new Boolean(value));
	}
	
	public void setParcelado(Boolean value) {
		this.parcelado = value;
	}
	
	public Boolean getParcelado() {
		return parcelado;
	}
	
	public void setNroParcela(int value) {
		setNroParcela(new Integer(value));
	}
	
	public void setNroParcela(Integer value) {
		this.nroParcela = value;
	}
	
	public Integer getNroParcela() {
		return nroParcela;
	}
	
	public void setPago(boolean value) {
		setPago(new Boolean(value));
	}
	
	public void setPago(Boolean value) {
		this.pago = value;
	}
	
	public Boolean getPago() {
		return pago;
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
	
}
