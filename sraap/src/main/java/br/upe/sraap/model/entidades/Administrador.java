package br.upe.sraap.model.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "administrador")
@DiscriminatorValue("ADMINISTRADOR")
public class Administrador extends Usuario{

	private static final long serialVersionUID = 1L;
	
	public Administrador() {

	}

	@Override
	public String toString() {
		return "Administrador [toString()=" + super.toString() + "]";
	}

}
