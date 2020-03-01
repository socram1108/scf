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
@Embeddable
public class Frete_DespesaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Frete_DespesaPK))
			return false;
		Frete_DespesaPK frete_despesapk = (Frete_DespesaPK)aObj;
		if (getFreteID() != frete_despesapk.getFreteID())
			return false;
		if (getDespesaID() != frete_despesapk.getDespesaID())
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
	@GeneratedValue(generator="VC0A889011708DF597370B824")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A889011708DF597370B824", strategy="native")	
	private int freteID;
	
	public void setFreteID(int value)  {
		this.freteID =  value;
	}
	
	public int getFreteID()  {
		return this.freteID;
	}
	
	@Column(name="DespesaID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A889011708DF597380B825")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A889011708DF597380B825", strategy="native")	
	private int despesaID;
	
	public void setDespesaID(int value)  {
		this.despesaID =  value;
	}
	
	public int getDespesaID()  {
		return this.despesaID;
	}
	
}
