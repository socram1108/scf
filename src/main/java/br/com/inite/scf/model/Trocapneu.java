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
@Table(name="Trocapneu")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ManutencaoID", referencedColumnName="ID")
public class Trocapneu extends br.com.inite.scf.model.Manutencao implements Serializable {
	private static final long serialVersionUID = 1L;

	public Trocapneu() {
	}
	
	@Transient	
	private int motivo;
	
	@Transient	
	private Integer pneu;
	
	@Transient	
	private String tipo2;
	
}
