
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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Frete")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Frete implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonManagedReference
	@ManyToOne(targetEntity=br.com.inite.scf.model.Frota.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="FrotaID", referencedColumnName="ID") })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Frota frota;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "frete")
	private List<Despesa> despesa = new ArrayList<>();
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A8890117098C1CF2407A50")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A8890117098C1CF2407A50", strategy="native")	
	private Integer ID;
	
	@Column(name="Origem", nullable=true, length=255)	
	private String origem;
	
	@Column(name="Destino", nullable=true, length=255)	
	private String destino;
	
	@Column(name="DataSaida", nullable=true)	
	private java.sql.Timestamp dataSaida;
	
	@Column(name="DataChegada", nullable=true)	
	private java.sql.Timestamp dataChegada;
	
	@Column(name="KmInicial", nullable=true, length=11)	
	private Integer kmInicial;
	
	@Column(name="KmFinal", nullable=true, length=11)	
	private Integer kmFinal;
	
	@Column(name="ValorFrete", nullable=true)	
	private Double valorFrete;
	
	@Column(name="Comissao", nullable=true)	
	private Double comissao;
	
	@Column(name="Adiantamento", nullable=true)	
	private Double adiantamento;
	
	public Frete() {
	}
		
	public Frete(Integer iD, String origem, String destino, Timestamp dataSaida, Timestamp dataChegada, Integer kmInicial,
			Integer kmFinal, Double valorFrete, Double comissao, Double adiantamento) {
		super();
		ID = iD;
		this.origem = origem;
		this.destino = destino;
		this.dataSaida = dataSaida;
		this.dataChegada = dataChegada;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
		this.valorFrete = valorFrete;
		this.comissao = comissao;
		this.adiantamento = adiantamento;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public java.sql.Timestamp getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(java.sql.Timestamp dataSaida) {
		this.dataSaida = dataSaida;
	}

	public java.sql.Timestamp getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(java.sql.Timestamp dataChegada) {
		this.dataChegada = dataChegada;
	}

	public Integer getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(Integer kmInicial) {
		this.kmInicial = kmInicial;
	}

	public Integer getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(Integer kmFinal) {
		this.kmFinal = kmFinal;
	}

	public Double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getAdiantamento() {
		return adiantamento;
	}

	public void setAdiantamento(Double adiantamento) {
		this.adiantamento = adiantamento;
	}
	@JsonBackReference
	public List<Despesa> getDespesa() {
		return despesa;
	}

	public void setDespesa(List<Despesa> despesas) {
		this.despesa = despesas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		Integer result = 1;
		result = prime * result + ID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Frete other = (Frete) obj;
		if (ID != other.ID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Frete [ID=" + ID + ", origem=" + origem + ", destino=" + destino + ", dataSaida=" + dataSaida
				+ ", dataChegada=" + dataChegada + ", kmInicial=" + kmInicial + ", kmFinal=" + kmFinal + ", valorFrete="
				+ valorFrete + ", comissao=" + comissao + ", adiantamento=" + adiantamento + "]";
	}


	
	
}
