package co.intrena.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.intrena.model.entity.Rol;
import co.intrena.repository.RolRepository;

@Service
public class RolServiceImpl implements RolService {

	@Autowired
	private RolRepository rolRepository;//este atributo trae los métodos
	//cuando le pongo punto al final a este atributo, va listando los métodos
	
	
	@Override
	public List<Rol> findAll() {
		
		return rolRepository.findAll();
	}

	@Override
	public Optional<Rol> findById(Integer Id) {
		
		return rolRepository.findById(Id);
	}

	@Override
	public Rol save(Rol rol) {
		
		return rolRepository.save(rol);
	}

	@Override
	public void deleteById(Integer Id) {
		
		rolRepository.deleteById(Id);
	}

}

