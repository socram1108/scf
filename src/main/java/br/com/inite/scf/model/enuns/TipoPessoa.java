package br.com.inite.scf.model.enuns;

public enum TipoPessoa {
	
	PESSOAFISICA(1, "Pessoa F�sica"),
	PESSOAJURIDICA(2, "Pessoa Jur�dica");
	
	private int codTipoPessoa;
	private String descricao;
	
	private TipoPessoa(int codTipoPessoa, String descricao) {
		this.codTipoPessoa = codTipoPessoa;
		this.descricao = descricao;
		
	}

	public int getCodTipoPessoa() {
		return codTipoPessoa;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoPessoa toEnum(Integer codTipoPessoa) {
		if (codTipoPessoa == null) {
			return null;
		}
		for(TipoPessoa x : TipoPessoa.values()) {
			if(codTipoPessoa.equals(x.getCodTipoPessoa())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id Inv�lido: " +codTipoPessoa);
	}
	

}
