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
public class Rotulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRotulo")
	private Long idRotulo;

	@Column(name = "descricao", length = 100)
	private String descricao;
	
	@Column(name = "fechaCriacao")
	private LocalDateTime fechaCriacao;
	
	@Column(name = "fechaModificacao")
	private LocalDateTime fechaModificacao;
	
	@Column(name = "status")
	private boolean status;

	public Long getIdRotulo() {
		return idRotulo;
	}

	public void setIdRotulo(Long idRotulo) {
		this.idRotulo = idRotulo;
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
		result = prime * result + ((idRotulo == null) ? 0 : idRotulo.hashCode());
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
		Rotulo other = (Rotulo) obj;
		if (idRotulo == null) {
			if (other.idRotulo != null)
				return false;
		} else if (!idRotulo.equals(other.idRotulo))
			return false;
		return true;
	}
	
	
	
}












