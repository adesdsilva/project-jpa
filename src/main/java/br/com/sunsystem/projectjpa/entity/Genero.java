package br.com.sunsystem.projectjpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Genero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idGenero")
	private Long idGenero;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "fechaCriacao")
	private LocalDateTime fechaCriacao;
	
	@Column(name = "fechaModificacao")
	private LocalDateTime fechaModificacao;
	
	@Column(name = "status")
	private boolean status;

	public Long getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Long idGenero) {
		this.idGenero = idGenero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getFechaCriacao() {
		return fechaCriacao;
	}

	public void setFechaCriacao(LocalDateTime fechaCriacao) {
		this.fechaCriacao = fechaCriacao;
	}

	public LocalDateTime getFechaModificacao() {
		return fechaModificacao;
	}

	public void setFechaModificacao(LocalDateTime fechaModificacao) {
		this.fechaModificacao = fechaModificacao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idGenero == null) ? 0 : idGenero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genero other = (Genero) obj;
		if (idGenero == null) {
			if (other.idGenero != null)
				return false;
		} else if (!idGenero.equals(other.idGenero))
			return false;
		return true;
	}
	
	
}
