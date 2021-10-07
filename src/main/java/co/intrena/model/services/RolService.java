package co.intrena.model.services;

import java.util.List;
import java.util.Optional;

import co.intrena.model.entity.Rol;

public interface RolService {
	public List<Rol>findAll();//trae todos los registros de la tabla. Trae una lista.
	public Optional<Rol>findById(Integer Id); //Busca por Id. Trae un objeto del tipo Rol
	public Rol save(Rol rol);//Guarda en la b.d. el objeto Rol
	public void deleteById(Integer Id);//Borra de la b.d. el objeto Rol.

}