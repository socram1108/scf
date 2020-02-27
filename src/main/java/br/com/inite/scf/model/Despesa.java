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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
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
	
	

	public Despesa(int iD, Date dataDespesa, double valor, Date dataPagamento, String descricao, Integer tipoDespesa,
			String documentoFiscal, String forncedor) {
		super();
		ID = iD;
		this.dataDespesa = dataDespesa;
		this.valor = valor;
		this.dataPagamento = dataPagamento;
		this.descricao = descricao;
		this.tipoDespesa = tipoDespesa;
		this.documentoFiscal = documentoFiscal;
		this.forncedor = forncedor;
	}



	@OneToMany(targetEntity=br.com.inite.scf.model.Frete.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumn(name="DespesaID", nullable=false)	
	private List<Frete> frete = new ArrayList<>();

	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A889011707754B0CF06F94")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A889011707754B0CF06F94", strategy="native")	
	private int ID;
	
	@Column(name="DataDespesa", nullable=true)	
	private java.util.Date dataDespesa;
	
	@Column(name="Valor", nullable=false)	
	private double valor;
	
	@Column(name="DataPagamento", nullable=true)	
	private java.util.Date dataPagamento;
	
	@Column(name="Descricao", nullable=true, length=255)	
	private String descricao;
	
	@Column(name="TipoDespesa", nullable=true, length=11)	
	private Integer tipoDespesa;
	
	@Column(name="DocumentoFiscal", nullable=true, length=255)	
	private String documentoFiscal;
	
	@Column(name="Forncedor", nullable=true, length=255)	
	private String forncedor;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDataDespesa(java.util.Date value) {
		this.dataDespesa = value;
	}
	
	public java.util.Date getDataDespesa() {
		return dataDespesa;
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
	
	public void setDescricao(String value) {
		this.descricao = value;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setTipoDespesa(int value) {
		setTipoDespesa(new Integer(value));
	}
	
	public void setTipoDespesa(Integer value) {
		this.tipoDespesa = value;
	}
	
	public Integer getTipoDespesa() {
		return tipoDespesa;
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

	public List<Frete> getFrete() {
		return frete;
	}

	public void setFrete(List<Frete> frete) {
		this.frete = frete;
	}
	
}
