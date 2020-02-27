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
@Table(name="Multas")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ObrigacaoID", referencedColumnName="ID")
public class Multas extends br.com.inite.scf.model.Obrigacao implements Serializable {
	private static final long serialVersionUID = 1L;

	public Multas() {
	}
	
	@Column(name="Dia", nullable=true)	
	private java.sql.Timestamp dia;
	
	@Column(name="HistoMulta", nullable=true, length=255)	
	private String histoMulta;
	
	@Column(name="Ponto", nullable=true, length=255)	
	private String ponto;
	
	@Column(name="Placa", nullable=true, length=255)	
	private String placa;
	
	@Column(name="IdMotorista", nullable=true, length=11)	
	private Integer idMotorista;
	
	@Column(name="Baixa", nullable=true)	
	private java.util.Date baixa;
	
	@Column(name="Situacao", nullable=true, length=255)	
	private String situacao;
	
	public void setDia(java.sql.Timestamp value) {
		this.dia = value;
	}
	
	public java.sql.Timestamp getDia() {
		return dia;
	}
	
	public void setHistoMulta(String value) {
		this.histoMulta = value;
	}
	
	public String getHistoMulta() {
		return histoMulta;
	}
	
	public void setPonto(String value) {
		this.ponto = value;
	}
	
	public String getPonto() {
		return ponto;
	}
	
	public void setPlaca(String value) {
		this.placa = value;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setIdMotorista(int value) {
		setIdMotorista(new Integer(value));
	}
	
	public void setIdMotorista(Integer value) {
		this.idMotorista = value;
	}
	
	public Integer getIdMotorista() {
		return idMotorista;
	}
	
	public void setBaixa(java.util.Date value) {
		this.baixa = value;
	}
	
	public java.util.Date getBaixa() {
		return baixa;
	}
	
	public void setSituacao(String value) {
		this.situacao = value;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
}
