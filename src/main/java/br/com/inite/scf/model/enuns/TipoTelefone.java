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
package br.com.inite.scf.model.enuns;

public enum TipoTelefone{
	
	RESIDENCIAL(1,"RESIDENCIAL"),
	COMERCIAL(2, "COMERCIAL"),
	CELULAR(3, "CELULAR"),
	CONTATO(4, "CONTATO"),
	RECADO(5, "RECADO");
	
	private int codTipoTelefone;
	private String descricao;
	


	private TipoTelefone(int codTipoTelefone, String descricao) {
		this.codTipoTelefone = codTipoTelefone;
		this.descricao = descricao;
	}

	public int getCodTipoTelefone() {
		return codTipoTelefone;
	}

	public String getDescricao() {
		return descricao;
	}
	public static TipoTelefone toEnum(Integer codTpoTelefone) {
		if (codTpoTelefone == null) {
			return null;
		}
		for(TipoTelefone x : TipoTelefone.values()) {
			if(codTpoTelefone.equals(x.getCodTipoTelefone())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id Inválido: " +codTpoTelefone);
	}
	


}
