package br.upe.sraap.model.model;

import org.hibernate.HibernateException;

import br.upe.sraap.model.DAO.DAO;
import br.upe.sraap.model.entidades.Administrador;
import br.upe.sraap.model.entidades.Usuario;

public class AdministradorModel {
	
	private DAO<Administrador> administradorHibernate;
	
	public void inserir(Administrador adm) throws HibernateException, Exception{
		try {
			this.administradorHibernate.inserir(adm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Administrador adm) throws HibernateException, Exception{
		try {
			this.administradorHibernate.deletar(adm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Administrador adm) throws HibernateException, Exception{
		try {
			this.administradorHibernate.atualizar(adm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Usuario buscarID(Administrador adm) throws HibernateException, Exception{
		try {
			return this.administradorHibernate.buscarPeloID(Administrador.class, adm.getId());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
