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
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Abastecimento")
public class Abastecimento extends Despesa implements Serializable {
	private static final long serialVersionUID = 1L;

	public Abastecimento() {
	}

	public Abastecimento(Integer iD, Date dataDespesa, double valor, Date dataPagamento, String descricao,
			Integer tipoDespesa, String documentoFiscal, String forncedor, Integer tipoCombustivel, Integer quantidade, long km, double valorLitro, String observacao,
			String responsavelAbastecimento) {
		super(iD, dataDespesa, valor, dataPagamento, descricao, tipoDespesa, documentoFiscal, forncedor);
		this.tipoCombustivel = tipoCombustivel;
		this.quantidade = quantidade;
		this.km = km;
		this.valorLitro = valorLitro;
		this.observacao = observacao;
		this.responsavelAbastecimento = responsavelAbastecimento;
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

	
}
