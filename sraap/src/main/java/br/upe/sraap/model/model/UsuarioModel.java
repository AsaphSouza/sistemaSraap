package br.upe.sraap.model.model;

import org.hibernate.HibernateException;

import br.upe.sraap.model.DAO.DAO;
import br.upe.sraap.model.entidades.Usuario;

public class UsuarioModel {
	
	private DAO<Usuario> usuarioHibernate;
	
	public void inserir(Usuario user) throws HibernateException, Exception{
		try {
			this.usuarioHibernate.inserir(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Usuario user) throws HibernateException, Exception{
		try {
			this.usuarioHibernate.deletar(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Usuario user) throws HibernateException, Exception{
		try {
			this.usuarioHibernate.atualizar(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Usuario buscarID(Usuario user) throws HibernateException, Exception{
		try {
			return this.usuarioHibernate.buscarPeloID(Usuario.class, user.getId());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Usuario buscarPorNome(Usuario user) throws Exception {
		return null;
	}

	public Usuario buscarPorEmail(Usuario user) throws Exception {
		return null;
	}
}
