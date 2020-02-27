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
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Obrigacao")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Obrigacao implements Serializable {
	private static final long serialVersionUID = 1L;

	public Obrigacao() {
	}
		
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A8890117074CB7BB402E38")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A8890117074CB7BB402E38", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=br.com.inite.scf.model.Veiculos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="VeiculosID", referencedColumnName="ID", insertable=false, updatable=false) })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Veiculos veiculos;
	
	@Column(name="Tipo", nullable=true, length=255)	
	private String tipo;
	
	@Column(name="DataVencimento", nullable=true)	
	private java.util.Date dataVencimento;
	
	@Column(name="DataPagamento", nullable=true)	
	private java.util.Date dataPagamento;
	
	@Column(name="Valor", nullable=true)	
	private Double valor;
	
	@Column(name="Descricao", nullable=true, length=255)	
	private String descricao;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setDataVencimento(java.util.Date value) {
		this.dataVencimento = value;
	}
	
	public java.util.Date getDataVencimento() {
		return dataVencimento;
	}
	
	public void setDataPagamento(java.util.Date value) {
		this.dataPagamento = value;
	}
	
	public java.util.Date getDataPagamento() {
		return dataPagamento;
	}
	
	public void setValor(double value) {
		setValor(new Double(value));
	}
	
	public void setValor(Double value) {
		this.valor = value;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setDescricao(String value) {
		this.descricao = value;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setVeiculos(br.com.inite.scf.model.Veiculos value) {
		if (veiculos != null) {
			veiculos.getObrigacao().remove(this);
		}
		if (value != null) {
			value.getObrigacao().add(this);
		}
	}
	
	public br.com.inite.scf.model.Veiculos getVeiculos() {
		return veiculos;
	}
	
	public void setORM_Veiculos(br.com.inite.scf.model.Veiculos value) {
		this.veiculos = value;
	}
	
}
