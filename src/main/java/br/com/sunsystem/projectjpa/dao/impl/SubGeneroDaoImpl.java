package br.com.sunsystem.projectjpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.sunsystem.projectjpa.dao.SubGeneroDao;
import br.com.sunsystem.projectjpa.entity.Rotulo;
import br.com.sunsystem.projectjpa.entity.SubGenero;

public class SubGeneroDaoImpl implements SubGeneroDao {
	
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("persistenceSunSystem");

	@Override
	public void guardar(SubGenero subGenero) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.persist(subGenero);
			et.commit();
		} catch (Exception e) {

			if (et != null) {
				et.rollback();
			}

			e.printStackTrace();
		} finally {
			em.close();
		}

	}

	@Override
	public void actualizar(SubGenero subGenero) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.merge(subGenero);
			et.commit();
		} catch (Exception e) {

			if (et != null) {
				et.rollback();
			}

			e.printStackTrace();
		} finally {
			em.close();
		}

	}

	@Override
	public void eliminar(Long id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		SubGenero subGeneroConsultado = em.find(SubGenero.class, id);

		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.remove(subGeneroConsultado);
			et.commit();
		} catch (Exception e) {

			if (et != null) {
				et.rollback();
			}

			e.printStackTrace();
		} finally {
			em.close();
		}

	}

	@Override
	public List<SubGenero> consultar() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		TypedQuery<SubGenero> querySubGenero = (TypedQuery<SubGenero>) em.createQuery("FROM SubGenero ORDER BY descricao");

		return querySubGenero.getResultList();
	}

	@Override
	public SubGenero consultarById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
