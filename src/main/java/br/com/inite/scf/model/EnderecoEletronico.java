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

import br.com.inite.scf.model.enuns.TipoEnderecoEletronico;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="EnderecoEletronico")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("EnderecoEletronico")
@PrimaryKeyJoinColumn(name="ContatoIDID", referencedColumnName="IDID")
public class EnderecoEletronico extends br.com.inite.scf.model.Contato implements Serializable {
	private static final long serialVersionUID = 1L;

	public EnderecoEletronico() {
	}
	
	@Column(name="TipoEnderecoEletronico", nullable=true, length=11)	
	private Integer tipoEnderecoEletronico;
	
	@Column(name="EnderecoEletronico", nullable=true, length=255)	
	private String enderecoEletronico;
	
	@Column(name="Observacao", nullable=true, length=255)	
	private String observacao;
	
	public void setTipoEnderecoEletronico(TipoEnderecoEletronico tipoEnderecoEletronico) {
		this.tipoEnderecoEletronico = tipoEnderecoEletronico.getCodTipoEnderecoEletronico();
	}
	
	public TipoEnderecoEletronico gttipoEnderecoEletronico() {
		return TipoEnderecoEletronico.toEnum(tipoEnderecoEletronico);
	}
	
	public void setEnderecoEletronico(String value) {
		this.enderecoEletronico = value;
	}
	
	public String getEnderecoEletronico() {
		return enderecoEletronico;
	}
	
	public void setObservacao(String value) {
		this.observacao = value;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
}
