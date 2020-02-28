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
@Table(name="Estado")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int ID;
	private String nome;
	private String nomeCompleto;

	public Estado() {
	}
	
	@OneToMany(mappedBy = "estado")	
	private List<Cidade> cidade = new ArrayList<>();
	
	
	@ManyToOne	
	@JoinColumn(name="PaisID")	
	private Pais pais;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	List<Cidade> getCidade() {
		return cidade;
	}

	public void setCidade(List<Cidade> cidade) {
		this.cidade = cidade;
	}
	public void setPais(br.com.inite.scf.model.Pais value) {
		if (pais != null) {
			pais.getEstado().remove(this);
		}
		if (value != null) {
			value.getEstado().add(this);
		}
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
}
