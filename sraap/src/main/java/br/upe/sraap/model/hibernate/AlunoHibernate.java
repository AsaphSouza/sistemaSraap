package br.upe.sraap.model.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import br.upe.sraap.model.DAO.AlunoDAO;
import br.upe.sraap.model.DAO.GenericoDAO;
import br.upe.sraap.model.entidades.Aluno;

public class AlunoHibernate extends GenericoDAO<Aluno> implements AlunoDAO{
	
	private final EntityManager em = Persistencia.getEntityManager();

	@Override
	public List<Aluno> buscarPorPerfil(String perfil) throws NoResultException, Exception {
		TypedQuery<Aluno> query; 
		try {
			
			query = em.createQuery("from aluno where perfil =:perfil",Aluno.class);
            query.setParameter("perfil", perfil);
            return  query.getResultList();
            
		} catch (NoResultException e) {
			return null;
			
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
}