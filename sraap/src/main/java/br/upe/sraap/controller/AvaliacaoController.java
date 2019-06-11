package br.upe.sraap.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import org.hibernate.HibernateException;
import br.upe.sraap.model.entidades.Avaliacao;
import br.upe.sraap.model.model.AvaliacaoModel;

@ManagedBean
@ViewScoped
public class AvaliacaoController {
	
	private AvaliacaoModel avaliacaoModel;
	private Avaliacao avaliacao;
	
	public AvaliacaoController () {
		avaliacao = new Avaliacao();
		avaliacaoModel = new AvaliacaoModel();
	}
	
	public void cadastrar() {
		try {
			avaliacaoModel.inserir(getAvaliacao());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deletar() {
		try {
			avaliacaoModel.excluir(getAvaliacao());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar() {
		try {
			avaliacaoModel.atualizar(getAvaliacao());

		} catch (HibernateException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Avaliacao buscarID() {
		try {
			return avaliacaoModel.buscarID(getAvaliacao());

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public AvaliacaoModel getAvaliacaoModel() {
		return avaliacaoModel;
	}

	public void setAvaliacaoModel(AvaliacaoModel avaliacaoModel) {
		this.avaliacaoModel = avaliacaoModel;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

}
