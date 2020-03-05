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

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@org.hibernate.annotations.Proxy(lazy=true)
@Table(name="Despesa")
@Inheritance(strategy=InheritanceType.JOINED)
public class Despesa implements Serializable {
	private static final long serialVersionUID = 1L;

	public Despesa() {
	}
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A88901170989BA9E400B3D")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A88901170989BA9E400B3D", strategy="native")	
	private Integer ID;
	
	@Column(name="Valor", nullable=false)	
	private double valor;
	
	@Column(name="DataPagamento", nullable=true)	
	private java.util.Date dataPagamento;
	
	@Column(name="DocumentoFiscal", nullable=true, length=255)	
	private String documentoFiscal;
	
	@Column(name="Forncedor", nullable=true, length=255)	
	private String forncedor;
	
	@JsonBackReference
	@ManyToOne(targetEntity=br.com.inite.scf.model.Frete.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="FreteID", referencedColumnName="ID", insertable=false, updatable=false) })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Frete frete;
	
	public void setID(Integer value) {
		this.ID = value;
	}
	
	public Integer getID() {
		return ID;
	}
	
	public void setValor(double value) {
		this.valor = value;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setDataPagamento(java.util.Date value) {
		this.dataPagamento = value;
	}
	
	public java.util.Date getDataPagamento() {
		return dataPagamento;
	}
	
	public void setDocumentoFiscal(String value) {
		this.documentoFiscal = value;
	}
	
	public String getDocumentoFiscal() {
		return documentoFiscal;
	}
	
	public void setForncedor(String value) {
		this.forncedor = value;
	}
	
	public String getForncedor() {
		return forncedor;
	}
	
	public void setFrete(br.com.inite.scf.model.Frete value) {
		if (frete != null) {
			frete.getDespesa().remove(this);
		}
		if (value != null) {
			value.getDespesa().add(this);
		}
	}
	
	public br.com.inite.scf.model.Frete getFrete() {
		return frete;
	}

}
