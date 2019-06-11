package br.upe.sraap.model.model;

import org.hibernate.HibernateException;
import br.upe.sraap.model.DAO.DAO;
import br.upe.sraap.model.entidades.Atividade;

public class AtividadeModel {
	
	private DAO<Atividade> atividadeHibernate;
	
	public void inserir(Atividade atv) throws HibernateException, Exception{
		try {
			this.atividadeHibernate.inserir(atv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Atividade atv) throws HibernateException, Exception{
		try {
			this.atividadeHibernate.deletar(atv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Atividade atv) throws HibernateException, Exception{
		try {
			this.atividadeHibernate.atualizar(atv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Atividade buscarID(Atividade atv) throws HibernateException, Exception{
		try {
			return this.atividadeHibernate.buscarPeloID(Atividade.class, atv.getId());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
