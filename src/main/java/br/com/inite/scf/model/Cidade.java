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
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Cidade")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;
	public Cidade() {
	}
	
	
	
	@OneToMany (mappedBy = "cidade")
	private List<Endereco> endereco = new ArrayList<>();
	
	@OneToMany(mappedBy = "cidade")	
	private List<Bairro> bairro = new ArrayList<>();
	
		
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A8890117074CB7B9E02E37")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A8890117074CB7B9E02E37", strategy="native")	
	private int ID;
	
	@ManyToOne	
	@JoinColumn(name="EstadoID")	
	private Estado estado;
	
	@ManyToOne	
	@JoinColumn(name="PaisID")	
	private Pais pais;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
		
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
			
	public void setEstado(br.com.inite.scf.model.Estado value) {
		if (estado != null) {
			estado.getCidade().remove(this);
		}
		if (value != null) {
			value.getCidade().add(this);
		}
	}
	
public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public List<Bairro> getBairro() {
		return bairro;
	}

	public void setBairro(List<Bairro> bairro) {
		this.bairro = bairro;
	}
	
}
