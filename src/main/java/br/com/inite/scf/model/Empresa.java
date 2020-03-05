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
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Empresa")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Empresa")
public class Empresa extends br.com.inite.scf.model.Pessoajuridica implements Serializable {
	private static final long serialVersionUID = 1L;
	public Empresa() {
	}
	
	@OneToMany(targetEntity=br.com.inite.scf.model.Veiculo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumn(name="EmpresaPessoaID", nullable=false)	
	private List<Veiculo> veiculos = new ArrayList<>();
	
	
	private Blob LOGO;
		
	public void setLOGO(java.sql.Blob value) {
		this.LOGO = value;
	}
	
	public java.sql.Blob getLOGO() {
		return LOGO;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
}