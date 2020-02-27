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
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Veiculos")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Veiculos implements Serializable {
	private static final long serialVersionUID = 1L;
	public Veiculos() {
	}
	
	@OneToMany(targetEntity=br.com.inite.scf.model.Frota.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumn(name="VeiculosID", nullable=false)	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)
	private List<Frota> frota = new ArrayList<>();
	
	@OneToMany(targetEntity=br.com.inite.scf.model.Manutencao.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumn(name="VeiculosID", nullable=false)	
	private List<Manutencao> manutencao = new ArrayList<>();
	
	
	@OneToMany(targetEntity=br.com.inite.scf.model.Obrigacao.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumn(name="VeiculosID", nullable=false)	
	private List<Obrigacao> obrigacao = new ArrayList<>();

	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A8890117074CB7DB102E41")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A8890117074CB7DB102E41", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=br.com.inite.scf.model.Empresa.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="EmpresaPessoaID", referencedColumnName="PessoaID", insertable=false, updatable=false) })	
	@Basic(fetch=FetchType.LAZY)	
	private br.com.inite.scf.model.Empresa empresa;
	
	@Column(name="Placa", nullable=true, length=255)	
	private String placa;
	
	@Column(name="Tipo", nullable=true, length=255)	
	private String tipo;
	
	@Column(name="Modelo", nullable=true, length=255)	
	private String modelo;
	
	@Column(name="AnoModelo", nullable=true, length=11)	
	private Integer anoModelo;
	
	@Column(name="AnoFabricacao", nullable=true, length=11)	
	private Integer anoFabricacao;
	
	@Column(name="Marca", nullable=true, length=255)	
	private String marca;
	
	@Column(name="Combustivel", nullable=true, length=255)	
	private String combustivel;
	
	@Column(name="Cor", nullable=true, length=255)	
	private String cor;
	
	@Column(name="Chassi", nullable=true, length=255)	
	private String chassi;
	
	@Column(name="Situacao", nullable=true, length=255)	
	private String situacao;
	
	@Column(name="Status", nullable=true, length=255)	
	private String status;
	
	@Column(name="Proprietario", nullable=true, length=255)	
	private String proprietario;
	
	@Column(name="Renavan", nullable=true, length=255)	
	private String renavan;
	
	@Column(name="Ipva", nullable=true, length=255)	
	private String ipva;
	
	@Column(name="Licenca", nullable=true, length=255)	
	private String licenca;
	
	@Column(name="Observacao", nullable=true, length=255)	
	private String observacao;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setPlaca(String value) {
		this.placa = value;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setModelo(String value) {
		this.modelo = value;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setAnoModelo(int value) {
		setAnoModelo(new Integer(value));
	}
	
	public void setAnoModelo(Integer value) {
		this.anoModelo = value;
	}
	
	public Integer getAnoModelo() {
		return anoModelo;
	}
	
	public void setAnoFabricacao(int value) {
		setAnoFabricacao(new Integer(value));
	}
	
	public void setAnoFabricacao(Integer value) {
		this.anoFabricacao = value;
	}
	
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public void setMarca(String value) {
		this.marca = value;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setCombustivel(String value) {
		this.combustivel = value;
	}
	
	public String getCombustivel() {
		return combustivel;
	}
	
	public void setCor(String value) {
		this.cor = value;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setChassi(String value) {
		this.chassi = value;
	}
	
	public String getChassi() {
		return chassi;
	}
	
	public void setSituacao(String value) {
		this.situacao = value;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setProprietario(String value) {
		this.proprietario = value;
	}
	
	public String getProprietario() {
		return proprietario;
	}
	
	public void setRenavan(String value) {
		this.renavan = value;
	}
	
	public String getRenavan() {
		return renavan;
	}
	
	public void setIpva(String value) {
		this.ipva = value;
	}
	
	public String getIpva() {
		return ipva;
	}
	
	public void setLicenca(String value) {
		this.licenca = value;
	}
	
	public String getLicenca() {
		return licenca;
	}
	
	public void setObservacao(String value) {
		this.observacao = value;
	}
	
	public String getObservacao() {
		return observacao;
	}
	
	public void setEmpresa(br.com.inite.scf.model.Empresa value) {
		if (empresa != null) {
			empresa.getVeiculos().remove(this);
		}
		if (value != null) {
			value.getVeiculos().add(this);
		}
	}
	
	public br.com.inite.scf.model.Empresa getEmpresa() {
		return empresa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Empresa(br.com.inite.scf.model.Empresa value) {
		this.empresa = value;
	}

	public List<Frota> getFrota() {
		return frota;
	}

	public void setFrota(List<Frota> frota) {
		this.frota = frota;
	}

	public List<Manutencao> getManutencao() {
		return manutencao;
	}

	public void setManutencao(List<Manutencao> manutencao) {
		this.manutencao = manutencao;
	}

	public List<Obrigacao> getObrigacao() {
		return obrigacao;
	}

	public void setObrigacao(List<Obrigacao> obrigacao) {
		this.obrigacao = obrigacao;
	}
	
}
