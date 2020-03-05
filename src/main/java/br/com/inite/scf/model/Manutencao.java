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
@Table(name="Manutencao")
@Inheritance(strategy=InheritanceType.JOINED)
public class Manutencao implements Serializable {
	private static final long serialVersionUID = 1L;

	public Manutencao() {
	}
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A8890117074CB7D5802E3E")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A8890117074CB7D5802E3E", strategy="native")	
	private Integer ID;
	
	@ManyToOne(targetEntity=br.com.inite.scf.model.Veiculo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="VeiculosID", referencedColumnName="ID", insertable=false, updatable=false) })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Veiculo veiculos;
	
	@Column(name="Tipo", nullable=true, length=255)	
	private String tipo;
	
	@Column(name="DataAgendamento", nullable=true)	
	private java.util.Date dataAgendamento;
	
	@Column(name="DataManutencao", nullable=true)	
	private java.util.Date dataManutencao;
	
	@Column(name="DataRetirada", nullable=true)	
	private java.util.Date dataRetirada;
	
	@Column(name="Valor", nullable=true)	
	private Double valor;
	
	@Column(name="DataPagamento", nullable=true)	
	private Double dataPagamento;
	
	@Column(name="Descricao", nullable=true, length=255)	
	private String descricao;
	
	public void setID(Integer value) {
		this.ID = value;
	}
	
	public Integer getID() {
		return ID;
	}
	
	public Integer getORMID() {
		return getID();
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setDataAgendamento(java.util.Date value) {
		this.dataAgendamento = value;
	}
	
	public java.util.Date getDataAgendamento() {
		return dataAgendamento;
	}
	
	public void setDataManutencao(java.util.Date value) {
		this.dataManutencao = value;
	}
	
	public java.util.Date getDataManutencao() {
		return dataManutencao;
	}
	
	public void setDataRetirada(java.util.Date value) {
		this.dataRetirada = value;
	}
	
	public java.util.Date getDataRetirada() {
		return dataRetirada;
	}
	
	public void setValor(double value) {
		setValor(new Double(value));
	}
	
	public void setValor(Double value) {
		this.valor = value;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setDataPagamento(double value) {
		setDataPagamento(new Double(value));
	}
	
	public void setDataPagamento(Double value) {
		this.dataPagamento = value;
	}
	
	public Double getDataPagamento() {
		return dataPagamento;
	}
	
	public void setDescricao(String value) {
		this.descricao = value;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setVeiculos(br.com.inite.scf.model.Veiculo value) {
		if (veiculos != null) {
			veiculos.getManutencao().remove(this);
		}
		if (value != null) {
			value.getManutencao().add(this);
		}
	}
	
	public br.com.inite.scf.model.Veiculo getVeiculos() {
		return veiculos;
	}
	
	public void setORM_Veiculos(br.com.inite.scf.model.Veiculo value) {
		this.veiculos = value;
	}
	
}
