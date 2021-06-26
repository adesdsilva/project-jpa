package br.com.sunsystem.projectjpa.dao;

import java.util.List;

import br.com.sunsystem.projectjpa.entity.Rotulo;

public interface RotuloDao {

	void guardar(Rotulo rotulo);

	void actualizar(Rotulo rotulo);

	void eliminar(Long id);

	List<Rotulo> consultar();

	Rotulo consultarById(Long id);

	Rotulo consultarByDescricaoJPQL(String descricao);

	Rotulo consultarByDescricaoNativo(String descricao);
}
