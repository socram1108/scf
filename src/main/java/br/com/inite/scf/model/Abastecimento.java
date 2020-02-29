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
@Table(name="Abastecimento")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="DespesaID", referencedColumnName="ID")
public class Abastecimento extends br.com.inite.scf.model.Despesa implements Serializable {
	private static final long serialVersionUID = 1L;

	public Abastecimento() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Abastecimento))
			return false;
		Abastecimento abastecimento = (Abastecimento)aObj;
		if (getID() != abastecimento.getID())
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getID();
		return hashcode;
	}
	
	@Column(name="TipoCombustivel", nullable=true, length=11)	
	private Integer tipoCombustivel;
	
	@Column(name="Quantidade", nullable=true, length=11)	
	private Integer quantidade;
	
	@Column(name="Km", nullable=false, length=20)	
	private long km;
	
	@Column(name="ValorLitro", nullable=false)	
	private double valorLitro;
	
	@Column(name="Observacao", nullable=true, length=255)	
	private String observacao;
	
	@Column(name="ResponsavelAbastecimento", nullable=true, length=255)	
	private String responsavelAbastecimento;
	
	public void setTipoCombustivel(int value) {
		setTipoCombustivel(new Integer(value));
	}
	
	public void setTipoCombustivel(Integer value) {
		this.tipoCombustivel = value;
	}
	
	public Integer getTipoCombustivel() {
		return tipoCombustivel;
	}
	
	public void setQuantidade(int value) {
		setQuantidade(new Integer(value));
	}
	
	public void setQuantidade(Integer value) {
		this.quantidade = value;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setKm(long value) {
		this.km = value;
	}
	
	public long getKm() {
		return km;
	}
	
	public void setValorLitro(double value) {
		this.valorLitro = value;
	}
	
	public double getValorLitro() {
		return valorLitro;
	}
	
	public void setObservacao(String value) {
		this.observacao = value;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setResponsavelAbastecimento(String value) {
		this.responsavelAbastecimento = value;
	}
	
	public String getResponsavelAbastecimento() {
		return responsavelAbastecimento;
	}
	
}
