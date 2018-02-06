package br.com.cristolandia.repository.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_pessoa")
public class PessoaEntity {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pessoa")
	private Integer id;
 
	@Column(name="nome")	
	private String  nome;
 
	@Column(name="sexo")
	private String  sexo;
	
	@Column(name="calcado")
	private Integer calcado;
	
	@Column(name="calca")
	private String calca;
	
	@Column(name="blusa")
	private String blusa;
	
	@Column(name="dt_inclusao")
	private Date dtInclusao;
	
	@Column(name="dt_afastamento")
	private Date dtAfastamento;
	
	@Column(name="dt_ultmov")
	private Date dtUltimoMovimento;
	
	@Column(name="ativo")
	private String ativo;
	
	@Column(name="observacao")
	private String observacao;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private FilialEntity filialEntity;
	
	  
	public Integer getId() {
		return id;
	}
 
	public void setId(Integer id) {
		this.id = id;
	}
 
	public String getNome() {
		return nome;
	}
 
	public void setNome(String nome) {
		this.nome = nome;
	}
 
	public String getSexo() {
		return sexo;
	}
 
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getCalcado() {
		return calcado;
	}

	public void setCalcado(Integer calcado) {
		this.calcado = calcado;
	}

	public String getCalca() {
		return calca;
	}

	public void setCalca(String calca) {
		this.calca = calca;
	}

	public String getBlusa() {
		return blusa;
	}

	public void setBlusa(String blusa) {
		this.blusa = blusa;
	}

	public Date getDtInclusao() {
		return dtInclusao;
	}

	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public Date getDtAfastamento() {
		return dtAfastamento;
	}

	public void setDtAfastamento(Date dtAfastamento) {
		this.dtAfastamento = dtAfastamento;
	}

	public Date getDtUltimoMovimento() {
		return dtUltimoMovimento;
	}

	public void setDtUltimoMovimento(Date dtUltimoMovimento) {
		this.dtUltimoMovimento = dtUltimoMovimento;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public FilialEntity getFilialEntity() {
		return filialEntity;
	}

	public void setFilialEntity(FilialEntity filialEntity) {
		this.filialEntity = filialEntity;
	}

}
