package br.com.sunsystem.projectjpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.sunsystem.projectjpa.dao.RotuloDao;
import br.com.sunsystem.projectjpa.entity.Rotulo;

public class RotuloDaoImpl implements RotuloDao {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("persistenceSunSystem");

	@Override
	public void guardar(Rotulo rotulo) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.persist(rotulo);
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
	public void actualizar(Rotulo rotulo) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.merge(rotulo);
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

		Rotulo rotuloConsultado = em.find(Rotulo.class, id);

		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.remove(rotuloConsultado);
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
	public List<Rotulo> consultar() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		TypedQuery<Rotulo> queryRotulo = (TypedQuery<Rotulo>) em.createQuery("FROM Rotulo ORDER BY descricao");

		return queryRotulo.getResultList();
	}

	@Override
	public Rotulo consultarById(Long id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		Rotulo rotuloConsultado = em.find(Rotulo.class, id);

		if (rotuloConsultado == null) {
			throw new EntityNotFoundException("O Rótulo com id " + id + " não se encontra!");
		}

		return rotuloConsultado;
	}
}
