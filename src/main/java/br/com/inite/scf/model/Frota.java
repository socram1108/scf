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
import java.util.List;

import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Frota")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Frota implements Serializable {
	private static final long serialVersionUID = 1L;
	public Frota() {
	}
	
	@OneToMany(targetEntity=br.com.inite.scf.model.Frete.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumn(name="FrotaID", nullable=false)	
	private List<Frete> frete = new ArrayList<Frete>();

	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A8890117074CB7CE502E3C")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A8890117074CB7CE502E3C", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=br.com.inite.scf.model.Veiculos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="VeiculosID", referencedColumnName="ID", insertable=false, updatable=false) })	
	@Basic(fetch=FetchType.LAZY)	
	private Veiculos veiculos;
	
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
	
	public void setFuncionarioPessoa(br.com.inite.scf.model.Funcionario value) {
		if (this.funcionarioPessoa != value) {
			br.com.inite.scf.model.Funcionario lfuncionarioPessoa = this.funcionarioPessoa;
			this.funcionarioPessoa = value;
			if (value != null) {
				funcionarioPessoa.setFrota1(this);
			}
			else {
				lfuncionarioPessoa.setFrota1(null);
			}
		}
	}
	
	public br.com.inite.scf.model.Funcionario getFuncionarioPessoa() {
		return funcionarioPessoa;
	}
	
	public void setVeiculos(br.com.inite.scf.model.Veiculos value) {
		if (veiculos != null) {
			veiculos.getFrota().remove(this);
		}
		if (value != null) {
			value.getFrota().add(this);
		}
	}
	
	public br.com.inite.scf.model.Veiculos getVeiculos() {
		return veiculos;
	}
	
	public List<Frete> getFrete() {
		return frete;
	}

	public void setFrete(List<Frete> frete) {
		this.frete = frete;
	}

}
