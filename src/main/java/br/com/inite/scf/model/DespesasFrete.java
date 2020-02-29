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
@Table(name="DespesasFrete")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class DespesasFrete implements Serializable {
	private static final long serialVersionUID = 1L;

	public DespesasFrete() {
	}
	
	@Column(name="IDID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A889011708DF596C70B821")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A889011708DF596C70B821", strategy="identity")	
	private int ID;
	
	@Column(name="Descricao", nullable=true, length=255)	
	private String descricao;
	
	@Column(name="TipoDespesa", nullable=true, length=11)	
	private Integer tipoDespesa;
	
	@Column(name="DataDespesa", nullable=true)	
	private java.util.Date dataDespesa;
	
	@ManyToOne(targetEntity=br.com.inite.scf.model.Despesa.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="DespesaID", referencedColumnName="ID") })	
	private br.com.inite.scf.model.Despesa despesa;
	
	@ManyToOne(targetEntity=br.com.inite.scf.model.Frete.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="FreteID", referencedColumnName="ID") })	
	private br.com.inite.scf.model.Frete frete;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDescricao(String value) {
		this.descricao = value;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setTipoDespesa(int value) {
		setTipoDespesa(new Integer(value));
	}
	
	public void setTipoDespesa(Integer value) {
		this.tipoDespesa = value;
	}
	
	public Integer getTipoDespesa() {
		return tipoDespesa;
	}
	
	public void setDataDespesa(java.util.Date value) {
		this.dataDespesa = value;
	}
	
	public java.util.Date getDataDespesa() {
		return dataDespesa;
	}
	
	
}
