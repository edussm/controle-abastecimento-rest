package br.fpu.controle.abastecimento.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "consumidor")
public class Consumidor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(length = 100)
	private String email;

	@Column(nullable = false, length = 45)
	private String nome;

	@Column(nullable = false, length = 500)
	private String sobrenome;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Consumidor [email=");
		builder.append(email);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append("]");
		return builder.toString();
	}

}
