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

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.com.inite.scf.model.enuns.TipoTelefone;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Telefone")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Telefone")
@PrimaryKeyJoinColumn(name="ContatoIDID", referencedColumnName="IDID")
public class Telefone extends br.com.inite.scf.model.Contato implements Serializable {
	private static final long serialVersionUID = 1L;

	public Telefone() {
	}
	
	@Column(name="Ddi", nullable=true, length=255)	
	private String ddi;
	
	@Column(name="Ddd", nullable=true, length=255)	
	private String ddd;
	
	@Column(name="Numero", nullable=true, length=255)	
	private String numero;
	
	@Column(name="Ramal", nullable=true, length=255)	
	private String ramal;
	
	@Column(name="Observacao", nullable=true, length=255)	
	private String observacao;
	
	@Column(name="TipoTelefone", nullable=true, length=11)	
	private Integer tipoTelefone;
	
	public void setDdi(String value) {
		this.ddi = value;
	}
	
	public String getDdi() {
		return ddi;
	}
	
	public void setDdd(String value) {
		this.ddd = value;
	}
	
	public String getDdd() {
		return ddd;
	}
	
	public void setNumero(String value) {
		this.numero = value;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setRamal(String value) {
		this.ramal = value;
	}
	
	public String getRamal() {
		return ramal;
	}
	
	public void setObservacao(String value) {
		this.observacao = value;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone.getCodTipoTelefone();
	}
	
	public TipoTelefone gettipoTelefone() {
		return TipoTelefone.toEnum(tipoTelefone);
	}
	
}
