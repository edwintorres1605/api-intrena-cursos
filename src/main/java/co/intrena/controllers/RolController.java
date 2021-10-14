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


import co.intrena.model.entity.Rol;
import co.intrena.model.services.RolService;

@RestController
@RequestMapping("/api/roles")
@CrossOrigin("*")
public class RolController {
	@Autowired
	private RolService rolService;
	
	@GetMapping("/{id}")
	public Optional <Rol> bucarPorId(@PathVariable Integer id) {
		
		return rolService.findById(id);
		
	}
	 @GetMapping("/listar")
	 public List<Rol> listar() {
		return rolService.findAll();
		 
	 }
		 
		
	 
	 @PostMapping
	  public Rol guardar(@RequestBody Rol  rol) {
		return rolService.save(rol);
	 }
	 
	 @DeleteMapping("/{id}")
	 public void eliminar (@PathVariable Integer id) {
		 rolService.deleteById(id);
	 }
	 @PutMapping ("/actualizar/{id}")
		public Rol actualizar(@RequestBody Rol rol , @PathVariable Integer id) {
			
			Rol rolEnBD= rolService.findById(id).get();//se consulta el id a actualizar
			
			System.out.println("c por body: "+rol);
			System.out.println("en DB"+rolEnBD);
			//enseguida los campos de la entidad que vamos a actualizar (en este caso 2):
			rolEnBD.setNombre(rol.getNombre()); 
			rolEnBD.setDescripcion(rol.getDescripcion());
			System.out.println("asi quedo en DB"+rolEnBD);
			
			rolService.save(rolEnBD);
			return rol;
		}
}

