package br.fpu.controle.abastecimento.domain;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="posto")
public class Posto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column
	private String estado;

	@Column
	private String cidade;

	@Column
	private String endereco;

	@Column
	private String bandeira;

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "posto_has_combustivel", 
	joinColumns = { @JoinColumn(name = "posto_id") }, 
	inverseJoinColumns = {
			@JoinColumn(name = "combustivel_id") })
	private Collection<Combustivel> combustiveis;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public Collection<Combustivel> getCombustiveis() {
		return combustiveis;
	}

	public void setCombustiveis(Collection<Combustivel> combustiveis) {
		this.combustiveis = combustiveis;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Posto [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", cidade=");
		builder.append(cidade);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append(", bandeira=");
		builder.append(bandeira);
		builder.append(", combustiveis=");
		builder.append(combustiveis);
		builder.append("]");
		return builder.toString();
	}

}
