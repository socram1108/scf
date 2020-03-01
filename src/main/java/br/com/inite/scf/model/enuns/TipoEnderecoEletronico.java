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

public enum TipoEnderecoEletronico {
	
	EMAIL(1, "E-mail"),
	HOMEPAGE(2, "Home Page"),
	OUTRO(3, "Outro");
	
	private int codTipoEnderecoEletronico;
	private String descricao;
	
	private TipoEnderecoEletronico(int codTipoEnderecoEletronico, String descricao) {
		this.codTipoEnderecoEletronico = codTipoEnderecoEletronico;
		this.descricao = descricao;
	}
	
	public int getCodTipoEnderecoEletronico() {
		return codTipoEnderecoEletronico;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoEnderecoEletronico toEnum(Integer codTipoEnderecoEletronico) {
		if (codTipoEnderecoEletronico == null) {
		return null;
		}
		
		for (TipoEnderecoEletronico x : TipoEnderecoEletronico.values()){
			if(codTipoEnderecoEletronico.equals(x.getCodTipoEnderecoEletronico()))
			return x;
		}
		throw new IllegalArgumentException("Id Invalido: " + codTipoEnderecoEletronico);
	}
	
}
