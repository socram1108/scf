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
@Table(name="Pessoajuridica")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Pessoajuridica")
@PrimaryKeyJoinColumn(name="PessoaID", referencedColumnName="ID")
public class Pessoajuridica extends br.com.inite.scf.model.Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	public Pessoajuridica() {
	}
	
	@Column(name="Cnpj", nullable=true, length=255)	
	private String cnpj;
	
	@Column(name="NomeFantasia", nullable=true, length=255)	
	private String nomeFantasia;
	
	@Column(name="InscEst", nullable=true, length=255)	
	private String inscEst;
	
	@Column(name="Ramo", nullable=true, length=255)	
	private String ramo;
	
	@Column(name="Criacao", nullable=true)	
	private java.util.Date criacao;
	
	@Column(name="Encerramento", nullable=true)	
	private java.util.Date encerramento;
	
	public void setCnpj(String value) {
		this.cnpj = value;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setNomeFantasia(String value) {
		this.nomeFantasia = value;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setInscEst(String value) {
		this.inscEst = value;
	}
	
	public String getInscEst() {
		return inscEst;
	}
	
	public void setRamo(String value) {
		this.ramo = value;
	}
	
	public String getRamo() {
		return ramo;
	}
	
	public void setCriacao(java.util.Date value) {
		this.criacao = value;
	}
	
	public java.util.Date getCriacao() {
		return criacao;
	}
	
	public void setEncerramento(java.util.Date value) {
		this.encerramento = value;
	}
	
	public java.util.Date getEncerramento() {
		return encerramento;
	}
	
}
