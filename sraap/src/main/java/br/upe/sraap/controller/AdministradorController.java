package br.upe.sraap.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import org.hibernate.HibernateException;
import br.upe.sraap.model.entidades.Administrador;
import br.upe.sraap.model.entidades.Usuario;
import br.upe.sraap.model.model.AdministradorModel;

@ManagedBean
@ViewScoped
public class AdministradorController {
	
	private AdministradorModel administradorModel;
	private Administrador administrador;
	
	public AdministradorController () {
		administradorModel = new AdministradorModel();
		administrador = new Administrador();
	}
	
	public void cadastrar() {
		try {
			administradorModel.inserir(getAdministrador());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deletar() {
		try {
			administradorModel.excluir(getAdministrador());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar() {
		try {
			administradorModel.atualizar(getAdministrador());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Usuario buscarID() {
		try {
			return administradorModel.buscarID(getAdministrador());

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
	
}
