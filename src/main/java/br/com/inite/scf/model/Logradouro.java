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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Logradouro")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Logradouro implements Serializable {
	private static final long serialVersionUID = 1L;
	public Logradouro() {
	}
	
	@OneToMany(mappedBy = "logradouro")	
	private List<Endereco> endereco = new ArrayList<Endereco>();
	

	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int ID;
	
	@ManyToOne	
	@JoinColumn(name="TipologradouroID")	
	private Tipologradouro tipologradouro;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	

	public void setTipologradouro(br.com.inite.scf.model.Tipologradouro value) {
		if (tipologradouro != null) {
			tipologradouro.getLogradouro().remove(this);
		}
		if (value != null) {
			value.getLogradouro().add(this);
		}
	}
	
	public br.com.inite.scf.model.Tipologradouro getTipologradouro() {
		return tipologradouro;
	}
	
	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
}
