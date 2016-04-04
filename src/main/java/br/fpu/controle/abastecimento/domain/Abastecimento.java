package br.fpu.controle.abastecimento.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "abastecimento")
public class Abastecimento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private Date data;

	@Column(nullable = false)
	private Long kilometragem;

	@Column(nullable = false)
	private Double litrosCombustivel;

	@Column(nullable = false)
	private Double precoLitro;

	@Column
	private boolean tanqueCheio;

	@OneToOne
	@JoinColumn(name = "combustivel_id", nullable = false)
	private Combustivel combustivel;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "veiculo_id", nullable = false)
	private Veiculo veiculo;

	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "posto_id", nullable = false)
	private Posto posto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Long getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(Long kilometragem) {
		this.kilometragem = kilometragem;
	}

	public Double getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(Double litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public Double getPrecoLitro() {
		return precoLitro;
	}

	public void setPrecoLitro(Double precoLitro) {
		this.precoLitro = precoLitro;
	}

	public boolean isTanqueCheio() {
		return tanqueCheio;
	}

	public void setTanqueCheio(boolean tanqueCheio) {
		this.tanqueCheio = tanqueCheio;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Posto getPosto() {
		return posto;
	}

	public void setPosto(Posto posto) {
		this.posto = posto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Abastecimento [id=");
		builder.append(id);
		builder.append(", data=");
		builder.append(data);
		builder.append(", kilometragem=");
		builder.append(kilometragem);
		builder.append(", litrosCombustivel=");
		builder.append(litrosCombustivel);
		builder.append(", precoLitro=");
		builder.append(precoLitro);
		builder.append(", tanqueCheio=");
		builder.append(tanqueCheio);
		builder.append(", combustivel=");
		builder.append(combustivel);
		builder.append(", veiculo=");
		builder.append(veiculo);
		builder.append(", posto=");
		builder.append(posto);
		builder.append("]");
		return builder.toString();
	}

}
