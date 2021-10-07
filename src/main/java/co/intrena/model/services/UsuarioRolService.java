package co.intrena.model.services;

import java.util.List;
import java.util.Optional;

import co.intrena.model.entity.UsuarioRol;

public interface UsuarioRolService {


	public List<UsuarioRol>findAll();
	public Optional<UsuarioRol>findById(Integer Id);
	public UsuarioRol save(UsuarioRol usuarioRol);
	public void deleteById(Integer Id);

}
