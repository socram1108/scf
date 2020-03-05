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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
	@GeneratedValue(generator="VC0A8890117098C1CCE607A4A")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A8890117098C1CCE607A4A", strategy="native")	
	private Integer ID;
	
	@JsonManagedReference
	@ManyToOne(targetEntity=br.com.inite.scf.model.Veiculo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="VeiculosID", referencedColumnName="ID") })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Veiculo veiculos;
	
	@Column(name="DataInicio", nullable=true)	
	private java.util.Date dataInicio;
	
	@Column(name="DataFim", nullable=true)	
	private java.util.Date dataFim;
	
	@Column(name="Descricao", nullable=true, length=255)	
	private String descricao;
	
	@Column(name="Veicculo", nullable=true, length=11)	
	private Integer veicculo;
	
	@JsonManagedReference
	@ManyToOne(targetEntity=br.com.inite.scf.model.Funcionario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="FuncionarioPessoaID", referencedColumnName="PessoaID") })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Funcionario funcionarioPessoa;
	
	@JsonBackReference
	@OneToMany(mappedBy="frota", targetEntity=br.com.inite.scf.model.Frete.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.List<Frete> frete = new ArrayList<>();
	
	public void setID(Integer value) {
		this.ID = value;
	}
	
	public Integer getID() {
		return ID;
	}
	
	public Integer getORMID() {
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
	
	public void setVeicculo(Integer value) {
		this.veicculo = value;
	}
	
	public Integer getVeicculo() {
		return veicculo;
	}
	
	public void setFuncionarioPessoa(br.com.inite.scf.model.Funcionario value) {
		if (funcionarioPessoa != null) {
			funcionarioPessoa.getFrota().remove(this);
		}
		if (value != null) {
			value.getFrota().add(this);
		}
	}
	
	public br.com.inite.scf.model.Funcionario getFuncionarioPessoa() {
		return funcionarioPessoa;
	}

	public java.util.List<Frete> getFrete() {
		return frete;
	}

	public void setFrete(java.util.List<Frete> frete) {
		this.frete = frete;
	}
	
	
}
