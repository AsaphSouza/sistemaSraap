package br.upe.sraap.model.hibernate;

import br.upe.sraap.model.DAO.UsuarioDAO;
import br.upe.sraap.model.DAO.genericoDAO;
import br.upe.sraap.model.entidades.Usuario;

public class UsuarioHibernate extends genericoDAO<Usuario> implements UsuarioDAO{

	@Override
	public Usuario buscarPorNome(String nome) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscarPorEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
