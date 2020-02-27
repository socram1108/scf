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
@Table(name="Bairro")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Bairro implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A8890117074CB7B8902E36")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A8890117074CB7B8902E36", strategy="native")	
	private int ID;
	private String nome;
	
	public Bairro() {
	}
	
	@OneToMany(mappedBy = "bairro")	
	private List<Endereco> endereco = new ArrayList<>();
	
	
	@ManyToOne	
	@JoinColumn(name="CidadeID")	
	private Cidade cidade;
	
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
	
	public void setCidade(Cidade value) {
		if (cidade != null) {
			cidade.getBairro().remove(this);
		}
		if (value != null) {
			value.getBairro().add(this);
		}
	}
	
	public Cidade getCidade() {
		return cidade;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cidade(Cidade value) {
		this.cidade = value;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
		
}
