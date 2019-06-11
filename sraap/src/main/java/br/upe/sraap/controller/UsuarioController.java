package br.upe.sraap.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import org.hibernate.HibernateException;
import br.upe.sraap.model.entidades.Usuario;
import br.upe.sraap.model.model.UsuarioModel;

@ManagedBean
@ViewScoped
public class UsuarioController {

	private UsuarioModel usuarioModel;
	private Usuario usuario;	

	public UsuarioController() {
		usuario = new Usuario();
		usuarioModel = new UsuarioModel();
	}

	public void cadastrar() {
		try {
			usuarioModel.inserir(getUsuario());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deletar() {
		try {
			usuarioModel.excluir(getUsuario());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar() {
		try {
			usuarioModel.atualizar(getUsuario());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Usuario buscarID() {
		try {
			return usuarioModel.buscarID(getUsuario());

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String Login() throws Exception {
		return usuarioModel.login(usuario.getEmail(), usuario.getSenha());
	}

	public UsuarioModel getUsuarioModel() {
		return usuarioModel;
	}

	public void setUsuarioModel(UsuarioModel usuarioModel) {
		this.usuarioModel = usuarioModel;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


}