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

import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Frete")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Frete implements Serializable {
	public Frete() {
	}
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A889011708DF5960F0B81A")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A889011708DF5960F0B81A", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=br.com.inite.scf.model.Frota.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="FrotaID", referencedColumnName="ID") })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Frota frota;
	
	@Column(name="Origem", nullable=true, length=255)	
	private String origem;
	
	@Column(name="Destino", nullable=true, length=255)	
	private String destino;
	
	@Column(name="DataSaida", nullable=true)	
	private java.sql.Timestamp dataSaida;
	
	@Column(name="DataChegada", nullable=true)	
	private java.sql.Timestamp dataChegada;
	
	@Column(name="KmInicial", nullable=true, length=11)	
	private Integer kmInicial;
	
	@Column(name="KmFinal", nullable=true, length=11)	
	private Integer kmFinal;
	
	@Column(name="ValorFrete", nullable=true)	
	private Double valorFrete;
	
	@Column(name="Comissao", nullable=true)	
	private Double comissao;
	
	@Column(name="Adiantamento", nullable=true)	
	private Double adiantamento;
	
	@OneToMany(mappedBy="frete", targetEntity=br.com.inite.scf.model.DespesasFrete.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set<Frete> despesasfretes = new HashSet<>();
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setOrigem(String value) {
		this.origem = value;
	}
	
	public String getOrigem() {
		return origem;
	}
	
	public void setDestino(String value) {
		this.destino = value;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDataSaida(java.sql.Timestamp value) {
		this.dataSaida = value;
	}
	
	public java.sql.Timestamp getDataSaida() {
		return dataSaida;
	}
	
	public void setDataChegada(java.sql.Timestamp value) {
		this.dataChegada = value;
	}
	
	public java.sql.Timestamp getDataChegada() {
		return dataChegada;
	}
	
	public void setKmInicial(int value) {
		setKmInicial(new Integer(value));
	}
	
	public void setKmInicial(Integer value) {
		this.kmInicial = value;
	}
	
	public Integer getKmInicial() {
		return kmInicial;
	}
	
	public void setKmFinal(int value) {
		setKmFinal(new Integer(value));
	}
	
	public void setKmFinal(Integer value) {
		this.kmFinal = value;
	}
	
	public Integer getKmFinal() {
		return kmFinal;
	}
	
	public void setValorFrete(double value) {
		setValorFrete(new Double(value));
	}
	
	public void setValorFrete(Double value) {
		this.valorFrete = value;
	}
	
	public Double getValorFrete() {
		return valorFrete;
	}
	
	public void setComissao(double value) {
		setComissao(new Double(value));
	}
	
	public void setComissao(Double value) {
		this.comissao = value;
	}
	
	public Double getComissao() {
		return comissao;
	}
	
	public void setAdiantamento(double value) {
		setAdiantamento(new Double(value));
	}
	
	public void setAdiantamento(Double value) {
		this.adiantamento = value;
	}
	
	public Double getAdiantamento() {
		return adiantamento;
	}

	public java.util.Set<Frete> getDespesasfretes() {
		return despesasfretes;
	}

	public void setDespesasfretes(java.util.Set<Frete> despesasfretes) {
		this.despesasfretes = despesasfretes;
	}
	

}
