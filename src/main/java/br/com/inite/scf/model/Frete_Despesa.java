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
@Table(name="Frete_Despesa")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@IdClass(Frete_DespesaPK.class)
public class Frete_Despesa implements Serializable {
	public Frete_Despesa() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Frete_Despesa))
			return false;
		Frete_Despesa frete_despesa = (Frete_Despesa)aObj;
		if (getFreteID() != frete_despesa.getFreteID())
			return false;
		if (getDespesaID() != frete_despesa.getDespesaID())
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getFreteID();
		hashcode = hashcode + (int) getDespesaID();
		return hashcode;
	}
	
	@Column(name="FreteID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A889011708DF597120B822")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A889011708DF597120B822", strategy="native")	
	private int freteID;
	
	@Column(name="DespesaID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A889011708DF597120B823")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A889011708DF597120B823", strategy="native")	
	private int despesaID;
	
	public void setFreteID(int value) {
		this.freteID = value;
	}
	
	public int getFreteID() {
		return freteID;
	}
	
	public void setDespesaID(int value) {
		this.despesaID = value;
	}
	
	public int getDespesaID() {
		return despesaID;
	}
	
}
