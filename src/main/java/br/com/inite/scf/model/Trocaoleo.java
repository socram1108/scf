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
@Table(name="Trocaoleo")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ManutencaoID", referencedColumnName="ID")
public class Trocaoleo extends br.com.inite.scf.model.Manutencao implements Serializable {
	private static final long serialVersionUID = 1L;

	public Trocaoleo() {
	}
	
	@Column(name="TipoOleo", nullable=true, length=255)	
	private String tipoOleo;
	
	@Column(name="FiltroCombustivel", nullable=false, length=1)	
	private boolean filtroCombustivel;
	
	@Column(name="Observacao", nullable=true, length=255)	
	private String observacao;
	
	@Column(name="KmUltimaTroca", nullable=true, length=11)	
	private Integer kmUltimaTroca;
	
	@Column(name="KmProximaTroca", nullable=true, length=11)	
	private Integer kmProximaTroca;
	
	@Column(name="KmAtual", nullable=true, length=11)	
	private Integer kmAtual;
	
	@Column(name="FiltroDeOleo", nullable=false, length=1)	
	private boolean filtroDeOleo;
	
	@Column(name="FiltroDeAr", nullable=false, length=1)	
	private boolean filtroDeAr;
	
	@Column(name="DataUltimaTroca", nullable=true)	
	private java.util.Date DataUltimaTroca;
	
	@Column(name="DataProximaTroca", nullable=true)	
	private java.util.Date DataProximaTroca;
	
	public void setTipoOleo(String value) {
		this.tipoOleo = value;
	}
	
	public String getTipoOleo() {
		return tipoOleo;
	}
	
	public void setFiltroCombustivel(boolean value) {
		this.filtroCombustivel = value;
	}
	
	public boolean getFiltroCombustivel() {
		return filtroCombustivel;
	}
	
	public void setObservacao(String value) {
		this.observacao = value;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setKmUltimaTroca(int value) {
		setKmUltimaTroca(new Integer(value));
	}
	
	public void setKmUltimaTroca(Integer value) {
		this.kmUltimaTroca = value;
	}
	
	public Integer getKmUltimaTroca() {
		return kmUltimaTroca;
	}
	
	public void setKmProximaTroca(int value) {
		setKmProximaTroca(new Integer(value));
	}
	
	public void setKmProximaTroca(Integer value) {
		this.kmProximaTroca = value;
	}
	
	public Integer getKmProximaTroca() {
		return kmProximaTroca;
	}
	
	public void setKmAtual(int value) {
		setKmAtual(new Integer(value));
	}
	
	public void setKmAtual(Integer value) {
		this.kmAtual = value;
	}
	
	public Integer getKmAtual() {
		return kmAtual;
	}
	
	public void setFiltroDeOleo(boolean value) {
		this.filtroDeOleo = value;
	}
	
	public boolean getFiltroDeOleo() {
		return filtroDeOleo;
	}
	
	public void setFiltroDeAr(boolean value) {
		this.filtroDeAr = value;
	}
	
	public boolean getFiltroDeAr() {
		return filtroDeAr;
	}
	
	public void setDataUltimaTroca(java.util.Date value) {
		this.DataUltimaTroca = value;
	}
	
	public java.util.Date getDataUltimaTroca() {
		return DataUltimaTroca;
	}
	
	public void setDataProximaTroca(java.util.Date value) {
		this.DataProximaTroca = value;
	}
	
	public java.util.Date getDataProximaTroca() {
		return DataProximaTroca;
	}
	
}
