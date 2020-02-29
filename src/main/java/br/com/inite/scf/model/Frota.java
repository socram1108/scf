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
@Table(name="Frota")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Frota implements Serializable {
	private static final long serialVersionUID = 1L;
	public Frota() {
	}

	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A889011708DF594070B814")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A889011708DF594070B814", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=br.com.inite.scf.model.Veiculos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="VeiculosID", referencedColumnName="ID", insertable=false, updatable=false) })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Veiculos veiculos;
	
	@OneToOne(targetEntity=br.com.inite.scf.model.Funcionario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="FuncionarioPessoaID") })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Funcionario funcionarioPessoa;
	
	@Column(name="DataInicio", nullable=true)	
	private java.util.Date dataInicio;
	
	@Column(name="DataFim", nullable=true)	
	private java.util.Date dataFim;
	
	@Column(name="Descricao", nullable=true, length=255)	
	private String descricao;
	
	@Column(name="Veicculo", nullable=true, length=11)	
	private Integer veicculo;
	
	@OneToMany(mappedBy="frota", targetEntity=br.com.inite.scf.model.Frete.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set<Frota> frete = new HashSet<>();
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDataInicio(java.util.Date value) {
		this.dataInicio = value;
	}
	
	public java.util.Date getDataInicio() {
		return dataInicio;
	}
	
	public void setDataFim(java.util.Date value) {
		this.dataFim = value;
	}
	
	public java.util.Date getDataFim() {
		return dataFim;
	}
	
	public void setDescricao(String value) {
		this.descricao = value;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setVeicculo(int value) {
		setVeicculo(new Integer(value));
	}
	
	public void setVeicculo(Integer value) {
		this.veicculo = value;
	}
	
	public Integer getVeicculo() {
		return veicculo;
	}
	
	
}
