package br.upe.sraap.model.model;

import org.hibernate.HibernateException;

import br.upe.sraap.model.DAO.DAO;
import br.upe.sraap.model.entidades.Professor;
import br.upe.sraap.model.entidades.Usuario;

public class ProfessorModel {
	
	DAO<Professor> professorHibernate;
	
	public void inserir(Professor prof) throws HibernateException, Exception{
		try {
			this.professorHibernate.inserir(prof);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Professor prof) throws HibernateException, Exception{
		try {
			this.professorHibernate.deletar(prof);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Professor prof) throws HibernateException, Exception{
		try {
			this.professorHibernate.atualizar(prof);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Usuario buscarID(Professor prof) throws HibernateException, Exception{
		try {
			return this.professorHibernate.buscarPeloID(Professor.class, prof.getId());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
