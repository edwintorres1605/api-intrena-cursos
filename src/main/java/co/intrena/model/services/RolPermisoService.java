package co.intrena.model.services;

import java.util.List;
import java.util.Optional;

import co.intrena.model.entity.RolPermiso;

public interface RolPermisoService {


	public List<RolPermiso>findAll();
	public Optional<RolPermiso>findById(Integer Id);
	public RolPermiso save(RolPermiso rolPermiso);
	public void deleteById(Integer Id);

}