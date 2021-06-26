package br.com.sunsystem.projectjpa.dao;

import java.util.List;

import br.com.sunsystem.projectjpa.entity.SubGenero;

public interface SubGeneroDao {

	void guardar(SubGenero subGenero);

	void actualizar(SubGenero subGenero);

	void eliminar(Long id);

	List<SubGenero> consultar();

	SubGenero consultarById(Long id);

}
