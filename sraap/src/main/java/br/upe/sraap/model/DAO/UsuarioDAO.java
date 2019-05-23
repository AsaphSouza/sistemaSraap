package br.upe.sraap.model.DAO;

import br.upe.sraap.model.entidades.Usuario;

public interface UsuarioDAO {
	
	public Usuario buscarPorNome(String nome) throws Exception;
	public Usuario buscarPorEmail (String email) throws Exception;
}
