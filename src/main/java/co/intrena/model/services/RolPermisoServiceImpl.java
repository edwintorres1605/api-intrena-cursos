package co.intrena.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.intrena.model.entity.RolPermiso;
import co.intrena.repository.RolPermisoRepository;

@Service
public class RolPermisoServiceImpl implements RolPermisoService{

	@Autowired
	private RolPermisoRepository rolPermisoRepository;

	@Override
	public List<RolPermiso> findAll() {
		// TODO Auto-generated method stub
		return rolPermisoRepository.findAll();
	}

	@Override
	public Optional<RolPermiso> findById(Integer Id) {
		// TODO Auto-generated method stub
		return rolPermisoRepository.findById(Id);
	}

	@Override
	public RolPermiso save(RolPermiso rolPermiso) {
		// TODO Auto-generated method stub
		return rolPermisoRepository.save(rolPermiso);
	}

	@Override
	public void deleteById(Integer Id) {
		// TODO Auto-generated method stub
		rolPermisoRepository.deleteById(Id);
	}

}
