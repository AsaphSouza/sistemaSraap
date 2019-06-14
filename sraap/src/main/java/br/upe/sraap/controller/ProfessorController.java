package br.upe.sraap.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import org.hibernate.HibernateException;
import br.upe.sraap.model.entidades.Professor;
import br.upe.sraap.model.entidades.Usuario;
import br.upe.sraap.model.model.ProfessorModel;

@ManagedBean
@ViewScoped
public class ProfessorController {
	
	private ProfessorModel professorModel;
	private Professor professor;
	
	public ProfessorController () {
		professor = new Professor();
		professorModel = new ProfessorModel();
	}
	
	public void cadastrar() {
		try {
			professorModel.inserir(getProfessor());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deletar() {
		try {
			professorModel.excluir(getProfessor());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar() {
		try {
			professorModel.atualizar(getProfessor());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Usuario buscarID() {
		try {
			return professorModel.buscarID(getProfessor());

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
}
