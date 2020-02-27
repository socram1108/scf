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

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Pessoa")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Pessoa")
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	public Pessoa() {
	}
	
	@ManyToMany(targetEntity=br.com.inite.scf.model.Endereco.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Pessoa_Endereco", joinColumns={ @JoinColumn(name="PessoaID") }, inverseJoinColumns={ @JoinColumn(name="EnderecoID") })	
	private List<Endereco> endereco = new ArrayList<>();
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A8890117074CB7C2902E39")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A8890117074CB7C2902E39", strategy="native")	
	private int ID;
	
	@Column(name="TipoPessoa", nullable=false, length=11)	
	private int tipoPessoa;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@Column(name="DataCadastro", nullable=true, length=255)	
	private String dataCadastro;
	
	
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setTipoPessoa(int value) {
		this.tipoPessoa = value;
	}
	
	public int getTipoPessoa() {
		return tipoPessoa;
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDataCadastro(String value) {
		this.dataCadastro = value;
	}
	
	public String getDataCadastro() {
		return dataCadastro;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
}
