package br.upe.sraap.model.DAO;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import org.hibernate.HibernateException;
import br.upe.sraap.model.hibernate.Persistencia;

public class genericoDAO<T> implements DAO<T> {

	private static EntityManager em = Persistencia.getEntityManager();

	@Override
	public void inserir(T obj) throws HibernateException, Exception {
		try {
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();

		} catch (HibernateException e) {
			em.getTransaction().rollback();
			throw new HibernateException("Erro de persistência");

		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception();

		} finally {
			em.close();
		}

	}

	@Override
	public void atualizar(T obj) throws HibernateException, Exception {
		try {
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();

		} catch (HibernateException e) {
			em.getTransaction().rollback();
			throw new HibernateException("Erro ao atualizar.");

		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception();

		} finally {
			em.close();
		}
	}

	@Override
	public void deletar(T obj) throws HibernateException,Exception {
		try {
			em.getTransaction().begin();
			obj = em.merge(obj);
			em.remove(obj);
			em.getTransaction().commit();

		} catch (HibernateException e) {
			em.getTransaction().rollback();
			throw new HibernateException("Erro de remoção.");

		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new Exception();

		} finally {
			em.close();
		}

	}

	@Override
	public T buscarPeloID(Class<T> classe, long id) throws NoResultException, Exception {
		try {
			return (T) em.find(classe, id);
		} catch (NoResultException e) {
			throw new NoResultException();

		} catch (Exception e) {
			throw new Exception("Erro de busca.");
		} finally {
			em.close();
		}
	}

}
