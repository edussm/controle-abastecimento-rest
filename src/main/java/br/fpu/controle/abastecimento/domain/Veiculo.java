package br.fpu.controle.abastecimento.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "veiculo")
public class Veiculo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String placa;

	@Column
	private String descricao;

	@Column(name = "consumidor_email", insertable = false)
	private Consumidor proprietario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Consumidor getProprietario() {
		return proprietario;
	}

	public void setProprietario(Consumidor proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [id=");
		builder.append(id);
		builder.append(", placa=");
		builder.append(placa);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", proprietario=");
		builder.append(proprietario);
		builder.append("]");
		return builder.toString();
	}

}
