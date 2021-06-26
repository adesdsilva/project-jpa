package br.com.sunsystem.projectjpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table
public class SubGenero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSubGenero")
	private Long idSubGenero;

	@Column(name = "descricao", length = 100)
	private String descricao;
	
	@Column(name = "fechaCriacao")
	private LocalDateTime fechaCriacao;
	
	@Column(name = "fechaModificacao")
	private LocalDateTime fechaModificacao;
	
	@Column(name = "status")
	private boolean status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idGenero")
	@Cascade(CascadeType.PERSIST)
	private Genero genero;
 
	public Long getIdSubGenero() {
		return idSubGenero;
	}

	public void setIdSubGenero(Long idSubGenero) {
		this.idSubGenero = idSubGenero;
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
		result = prime * result + ((idSubGenero == null) ? 0 : idSubGenero.hashCode());
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
		SubGenero other = (SubGenero) obj;
		if (idSubGenero == null) {
			if (other.idSubGenero != null)
				return false;
		} else if (!idSubGenero.equals(other.idSubGenero))
			return false;
		return true;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	
}
