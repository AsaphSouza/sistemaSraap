package br.upe.sraap.model.DAO;

import java.util.List;
import br.upe.sraap.model.entidades.Usuario;

public interface UsuarioDAO {
	
	public List<Usuario> buscarPorNome(String nome) throws Exception;
	public Usuario buscarPorEmail (String email) throws Exception;
	public Usuario login (String email, String password) throws Exception;
	public void logout() throws Exception;
}
