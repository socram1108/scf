
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
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@org.hibernate.annotations.Proxy(lazy=true)
@Table(name="Despesa")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Despesa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Despesa() {
	}
		
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A889011708DF5963A0B81B")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A889011708DF5963A0B81B", strategy="native")	
	private int ID;
	
	@Column(name="Valor", nullable=false)	
	private double valor;
	
	@Column(name="DataPagamento", nullable=true)	
	private java.util.Date dataPagamento;
	
	@Column(name="DocumentoFiscal", nullable=true, length=255)	
	private String documentoFiscal;
	
	@Column(name="Forncedor", nullable=true, length=255)	
	private String forncedor;
	
	@OneToMany(mappedBy="despesa", targetEntity=br.com.inite.scf.model.DespesasFrete.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private Set<Despesa> despesasfretes = new HashSet<Despesa>();
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
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

	public Set<Despesa> getDespesasfretes() {
		return despesasfretes;
	}

	public void setDespesasfretes(Set<Despesa> despesasfretes) {
		this.despesasfretes = despesasfretes;
	}

	
}
