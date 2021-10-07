package co.intrena.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.intrena.model.entity.UsuarioRol;
import co.intrena.repository.UsuarioRolRepository;

@Service
public class UsuarioRolServiceImpl implements UsuarioRolService{

	@Autowired
	private UsuarioRolRepository usuarioRolRepository;

	@Override
	public List<UsuarioRol> findAll() {
		// TODO Auto-generated method stub
		return usuarioRolRepository.findAll();
	}

	@Override
	public Optional<UsuarioRol> findById(Integer Id) {
		// TODO Auto-generated method stub
		return usuarioRolRepository.findById(Id);
	}

	@Override
	public UsuarioRol save(UsuarioRol usuarioRol) {
		// TODO Auto-generated method stub
		return usuarioRolRepository.save(usuarioRol);
	}

	@Override
	public void deleteById(Integer Id) {
		// TODO Auto-generated method stub
		usuarioRolRepository.deleteById(Id);
	}

}
