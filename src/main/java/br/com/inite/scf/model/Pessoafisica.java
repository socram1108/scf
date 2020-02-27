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
@org.hibernate.annotations.Proxy(lazy=true)
@Table(name="Pessoafisica")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Pessoafisica")
@PrimaryKeyJoinColumn(name="PessoaID", referencedColumnName="ID")
public class Pessoafisica extends br.com.inite.scf.model.Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	public Pessoafisica() {
	}
	
	@Column(name="DataNascto", nullable=true)	
	private java.util.Date dataNascto;
	
	@Column(name="Mae", nullable=true, length=255)	
	private String mae;
	
	@Column(name="EstCivil", nullable=true, length=255)	
	private String estCivil;
	
	@Column(name="Sexo", nullable=true, length=255)	
	private String sexo;
	
	@Column(name="Escolaridade", nullable=true, length=255)	
	private String escolaridade;
	
	@Column(name="Cargo", nullable=true, length=255)	
	private String cargo;
	
	@Column(name="Naturalidade", nullable=true, length=255)	
	private String naturalidade;
	
	@Column(name="EstNatural", nullable=true, length=255)	
	private String estNatural;
	
	@Column(name="Nacionalidade", nullable=true, length=255)	
	private String nacionalidade;
	
	public void setDataNascto(java.util.Date value) {
		this.dataNascto = value;
	}
	
	public java.util.Date getDataNascto() {
		return dataNascto;
	}
	
	public void setMae(String value) {
		this.mae = value;
	}
	
	public String getMae() {
		return mae;
	}
	
	public void setEstCivil(String value) {
		this.estCivil = value;
	}
	
	public String getEstCivil() {
		return estCivil;
	}
	
	public void setSexo(String value) {
		this.sexo = value;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setEscolaridade(String value) {
		this.escolaridade = value;
	}
	
	public String getEscolaridade() {
		return escolaridade;
	}
	
	public void setCargo(String value) {
		this.cargo = value;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setNaturalidade(String value) {
		this.naturalidade = value;
	}
	
	public String getNaturalidade() {
		return naturalidade;
	}
	
	public void setEstNatural(String value) {
		this.estNatural = value;
	}
	
	public String getEstNatural() {
		return estNatural;
	}
	
	public void setNacionalidade(String value) {
		this.nacionalidade = value;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
}
