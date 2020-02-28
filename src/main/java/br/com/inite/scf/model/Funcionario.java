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
@Table(name="Funcionario")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Funcionario")
public class Funcionario extends br.com.inite.scf.model.Pessoafisica implements Serializable {
	private static final long serialVersionUID = 1L;

	public Funcionario() {
	}
	
	@Column(name="FoneResid", nullable=true, length=255)	
	private String foneResid;
	
	@Column(name="FoneCom", nullable=true, length=255)	
	private String foneCom;
	
	@Column(name="Celular", nullable=true, length=255)	
	private String celular;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Rg", nullable=true, length=255)	
	private String rg;
	
	@Column(name="Cnh", nullable=true, length=255)	
	private String cnh;
	
	@Column(name="DataEmissao", nullable=true)	
	private java.sql.Timestamp dataEmissao;
	
	@Column(name="Vencimento", nullable=true)	
	private java.sql.Timestamp vencimento;
	
	@Column(name="Categoria", nullable=true, length=255)	
	private String categoria;
	
	@Column(name="Observacao", nullable=true, length=255)	
	private String observacao;
	
	@Column(name="Aso", nullable=true, length=255)	
	private String aso;
	
	@Column(name="AsoData", nullable=true)	
	private java.sql.Timestamp asoData;
	
	@Column(name="Integra", nullable=true)	
	private java.sql.Timestamp integra;
	
	@Column(name="Capacitacao", nullable=true)	
	private java.sql.Timestamp capacitacao;
	
	@Column(name="Admitido", nullable=true)	
	private java.sql.Timestamp admitido;
	
	@Column(name="Demitido", nullable=true)	
	private java.sql.Timestamp demitido;
	
	@Column(name="PIS", nullable=true, length=255)	
	private String PIS;
	
	@Column(name="TituloEleitor", nullable=true, length=255)	
	private String tituloEleitor;
	
	@Column(name="Ctps", nullable=true, length=255)	
	private String ctps;
	
	@Column(name="Cargo", nullable=true, length=255)	
	private String Cargo;
	
	@OneToOne(mappedBy="funcionarioPessoa", targetEntity=br.com.inite.scf.model.Frota.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Frota frota1;
	
	public void setFoneResid(String value) {
		this.foneResid = value;
	}
	
	public String getFoneResid() {
		return foneResid;
	}
	
	public void setFoneCom(String value) {
		this.foneCom = value;
	}
	
	public String getFoneCom() {
		return foneCom;
	}
	
	public void setCelular(String value) {
		this.celular = value;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setRg(String value) {
		this.rg = value;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setCnh(String value) {
		this.cnh = value;
	}
	
	public String getCnh() {
		return cnh;
	}
	
	public void setDataEmissao(java.sql.Timestamp value) {
		this.dataEmissao = value;
	}
	
	public java.sql.Timestamp getDataEmissao() {
		return dataEmissao;
	}
	
	public void setVencimento(java.sql.Timestamp value) {
		this.vencimento = value;
	}
	
	public java.sql.Timestamp getVencimento() {
		return vencimento;
	}
	
	public void setCategoria(String value) {
		this.categoria = value;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setObservacao(String value) {
		this.observacao = value;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setAso(String value) {
		this.aso = value;
	}
	
	public String getAso() {
		return aso;
	}
	
	public void setAsoData(java.sql.Timestamp value) {
		this.asoData = value;
	}
	
	public java.sql.Timestamp getAsoData() {
		return asoData;
	}
	
	public void setIntegra(java.sql.Timestamp value) {
		this.integra = value;
	}
	
	public java.sql.Timestamp getIntegra() {
		return integra;
	}
	
	public void setCapacitacao(java.sql.Timestamp value) {
		this.capacitacao = value;
	}
	
	public java.sql.Timestamp getCapacitacao() {
		return capacitacao;
	}
	
	public void setAdmitido(java.sql.Timestamp value) {
		this.admitido = value;
	}
	
	public java.sql.Timestamp getAdmitido() {
		return admitido;
	}
	
	public void setDemitido(java.sql.Timestamp value) {
		this.demitido = value;
	}
	
	public java.sql.Timestamp getDemitido() {
		return demitido;
	}
	
	public void setPIS(String value) {
		this.PIS = value;
	}
	
	public String getPIS() {
		return PIS;
	}
	
	public void setTituloEleitor(String value) {
		this.tituloEleitor = value;
	}
	
	public String getTituloEleitor() {
		return tituloEleitor;
	}
	
	public void setCtps(String value) {
		this.ctps = value;
	}
	
	public String getCtps() {
		return ctps;
	}
	
	public void setCargo(String value) {
		this.Cargo = value;
	}
	
	public String getCargo() {
		return Cargo;
	}
	
	public void setFrota1(br.com.inite.scf.model.Frota value) {
		if (this.frota1 != value) {
			br.com.inite.scf.model.Frota lfrota1 = this.frota1;
			this.frota1 = value;
			if (value != null) {
				frota1.setFuncionarioPessoa(this);
			}
			else {
				lfrota1.setFuncionarioPessoa(null);
			}
		}
	}
	
	public br.com.inite.scf.model.Frota getFrota1() {
		return frota1;
	}
	
}