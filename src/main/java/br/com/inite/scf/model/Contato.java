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
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Contato")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="Discriminator", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Contato")
public abstract class Contato implements Serializable {
	private static final long serialVersionUID = 1L;

	public Contato() {
	}
	
	@Column(name="IDID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A8890117093B73D620695B")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A8890117093B73D620695B", strategy="identity")	
	private int ID;
	
	@Column(name="Inicio", nullable=true)	
	private java.util.Date inicio;
	
	@Column(name="Fim", nullable=true)	
	private java.util.Date fim;
	
	@Column(name="Tipocontato", nullable=false, length=1)	
	private boolean tipocontato;
	
	@ManyToOne(targetEntity=br.com.inite.scf.model.Pessoa.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PessoaID", referencedColumnName="ID") })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Pessoa pessoa;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setInicio(java.util.Date value) {
		this.inicio = value;
	}
	
	public java.util.Date getInicio() {
		return inicio;
	}
	
	public void setFim(java.util.Date value) {
		this.fim = value;
	}
	
	public java.util.Date getFim() {
		return fim;
	}
	
	public void setTipocontato(boolean value) {
		this.tipocontato = value;
	}
	
	public boolean getTipocontato() {
		return tipocontato;
	}
	
	public void setPessoa(br.com.inite.scf.model.Pessoa value) {
		if (pessoa != null) {
			pessoa.getContato().remove(this);
		}
		if (value != null) {
			value.getContato().add(this);
		}
	}
	
	public br.com.inite.scf.model.Pessoa getPessoa() {
		return pessoa;
	}
	

}
