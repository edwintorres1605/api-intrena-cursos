package co.intrena.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.intrena.model.entity.RolPermiso;
import co.intrena.model.services.RolPermisoService;

@RestController
@RequestMapping("/api/rol-permiso")
public class RolPermisoController {


	@Autowired
	private RolPermisoService rolPermisoService;

	@GetMapping("{id}")
	public Optional<RolPermiso> buscarPorId(@PathVariable Integer id){
		return rolPermisoService.findById(id);	
	}

	@GetMapping ("/listar")
	public List<RolPermiso> listar(){
		return rolPermisoService.findAll();
	}

	@PostMapping
	public RolPermiso guardar(@RequestBody RolPermiso rolPermiso) {
		return rolPermisoService.save(rolPermiso);
	}

	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		rolPermisoService.deleteById(id);
	}

	@PutMapping("/actualizar/{id}")
	public RolPermiso actualizar(@RequestBody RolPermiso rolPermiso, @PathVariable Integer id) {

		RolPermiso rolPermisoEnBd = rolPermisoService.findById(id).get();

		rolPermisoEnBd.setRol(rolPermiso.getRol());
		rolPermisoEnBd.setPermiso(rolPermiso.getPermiso());

		rolPermisoService.save(rolPermisoEnBd);
		return rolPermiso;
	}


}

