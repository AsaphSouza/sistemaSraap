package br.upe.sraap.model.model;

import java.util.List;
import org.hibernate.HibernateException;
import br.upe.sraap.model.DAO.DAO;
import br.upe.sraap.model.DAO.UsuarioDAO;
import br.upe.sraap.model.entidades.Administrador;
import br.upe.sraap.model.entidades.Aluno;
import br.upe.sraap.model.entidades.Professor;
import br.upe.sraap.model.entidades.Usuario;
import br.upe.sraap.model.hibernate.UsuarioHibernate;

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

	public List<Usuario> buscarPorNome(Usuario user) throws Exception {
		try {
			return ((UsuarioHibernate) usuarioHibernate).buscarPorNome(user.getNomeCompleto());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Usuario buscarPorEmail(Usuario user) throws Exception {
		try {
			return ((UsuarioHibernate) usuarioHibernate).buscarPorEmail(user.getEmail());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public String login (String email, String senha) throws Exception {
		if (((UsuarioDAO) usuarioHibernate).login(email, senha) != null) {
			Usuario user = ((UsuarioDAO) usuarioHibernate).login(email, senha);
			
			if (user instanceof Aluno) {
				return "sraap/aluno/home.xhtml";
				
			} else if (user instanceof Professor) {
				return "sraap/professor/home.xhtml";
				
			} else if (user instanceof Administrador) {
				return "sraap/administrador/home.xhtml";
				
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
}
