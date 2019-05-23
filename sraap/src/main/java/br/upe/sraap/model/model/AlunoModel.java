package br.upe.sraap.model.model;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.HibernateException;

import br.upe.sraap.model.DAO.DAO;
import br.upe.sraap.model.entidades.Aluno;
import br.upe.sraap.model.hibernate.AlunoHibernate;

public class AlunoModel {
	private DAO<Aluno> alunoHibernate;

	public AlunoModel() {
		this.alunoHibernate = new AlunoHibernate();
	}

	public void inserir(Aluno aluno) throws HibernateException, Exception{
		try {
			this.alunoHibernate.inserir(aluno);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Aluno aluno) throws HibernateException, Exception{
		try {
			this.alunoHibernate.deletar(aluno);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Aluno aluno) throws HibernateException, Exception{
		try {
			this.alunoHibernate.atualizar(aluno);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Aluno buscarID(Aluno aluno) throws HibernateException, Exception{
		try {
			return this.alunoHibernate.buscarPeloID(Aluno.class, aluno.getId());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Aluno> ListarPorPerfil(String perfil) throws NoResultException, Exception{
		try {
			return ((AlunoHibernate) this.alunoHibernate).buscarPorPerfil(perfil);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
