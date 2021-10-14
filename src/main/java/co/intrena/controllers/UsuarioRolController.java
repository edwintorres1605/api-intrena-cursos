package co.intrena.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.intrena.model.entity.UsuarioRol;
import co.intrena.model.services.UsuarioRolService;

@RestController
@RequestMapping("/api/usuario-rol")
@CrossOrigin("*")
public class UsuarioRolController {


	@Autowired
	private UsuarioRolService usuarioRolService;

	@GetMapping("{id}")
	public Optional<UsuarioRol> buscarPorId(@PathVariable Integer id){
		return usuarioRolService.findById(id);	
	}

	@GetMapping ("/listar")
	public List<UsuarioRol> listar(){
		return usuarioRolService.findAll();
	}

	@PostMapping
	public UsuarioRol guardar(@RequestBody UsuarioRol usuarioRol) {
		return usuarioRolService.save(usuarioRol);
	}

	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		usuarioRolService.deleteById(id);
	}

	@PutMapping("/actualizar/{id}")
	public UsuarioRol actualizar(@RequestBody UsuarioRol usuarioRol, @PathVariable Integer id) {

		UsuarioRol usuarioRolEnBd = usuarioRolService.findById(id).get();

		usuarioRolEnBd.setUsuario(usuarioRol.getUsuario());
		usuarioRolEnBd.setRol(usuarioRol.getRol());		

		usuarioRolService.save(usuarioRolEnBd);
		return usuarioRol;
	}


}

