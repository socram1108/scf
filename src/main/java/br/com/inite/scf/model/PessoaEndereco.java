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
import java.util.Date;

import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="PessoaEndereco")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class PessoaEndereco implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private Pessoa_EnderecoPK ID = new Pessoa_EnderecoPK();
	
	@Column(name="Principal", nullable=false, length=1)	
	private boolean principal;
	
	@Column(name="Tipo", nullable=true, length=255)	
	private String tipo;
	
	@Column(name="Inicio", nullable=true)	
	private java.util.Date inicio;
	
	@Column(name="Fim", nullable=true)	
	private java.util.Date fim;
	
	@Column(name="Versao", nullable=true, length=11)	
	private Integer versao;
	

	public PessoaEndereco() {
	}
	
	
	
	public PessoaEndereco(Pessoa pessoa, Endereco endereco, boolean principal, String tipo, Date inicio, Date fim, Integer versao) {
		super();
		ID.setPessoa(pessoa);
		ID.setEndereco(endereco);
		this.principal = principal;
		this.tipo = tipo;
		this.inicio = inicio;
		this.fim = fim;
		this.versao = versao;
	}



	public Pessoa_EnderecoPK getID() {
		return ID;
	}



	public void setID(Pessoa_EnderecoPK iD) {
		ID = iD;
	}



	public boolean isPrincipal() {
		return principal;
	}

	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public java.util.Date getInicio() {
		return inicio;
	}

	public void setInicio(java.util.Date inicio) {
		this.inicio = inicio;
	}

	public java.util.Date getFim() {
		return fim;
	}

	public void setFim(java.util.Date fim) {
		this.fim = fim;
	}

	public Integer getVersao() {
		return versao;
	}

	public void setVersao(Integer versao) {
		this.versao = versao;
	}
	
	


}
