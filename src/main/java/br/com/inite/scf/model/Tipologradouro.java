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
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Tipologradouro")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Tipologradouro implements Serializable {
	private static final long serialVersionUID = 1L;
	public Tipologradouro() {
	}
	
	@OneToMany(mappedBy = "tipologradouro")	
	private List<Logradouro> logradouro = new ArrayList<>();
	

	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int ID;
	
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

	public List<Logradouro> getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(List<Logradouro> logradouro) {
		this.logradouro = logradouro;
	}
	
}
