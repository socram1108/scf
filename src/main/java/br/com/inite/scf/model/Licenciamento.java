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
@Table(name="Licenciamento")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ObrigacaoID", referencedColumnName="ID")
public class Licenciamento extends br.com.inite.scf.model.Obrigacao implements Serializable {
	private static final long serialVersionUID = 1L;

	public Licenciamento() {
	}
	
	@Column(name="Ano", nullable=false, length=11)	
	private int ano;
	
	@Column(name="Pago", nullable=true, length=1)	
	private Boolean pago;
	
	public void setAno(int value) {
		this.ano = value;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setPago(boolean value) {
		setPago(new Boolean(value));
	}
	
	public void setPago(Boolean value) {
		this.pago = value;
	}
	
	public Boolean getPago() {
		return pago;
	}
	
}
