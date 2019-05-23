package br.upe.sraap.model.DAO;

import java.util.List;

import br.upe.sraap.model.entidades.Aluno;

public interface AlunoDAO {
	public List<Aluno> buscarPorPerfil (String perfil) throws Exception;
}
