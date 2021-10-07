package co.intrena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.intrena.model.entity.Usuario;

@Repository

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	@Query("select u.id from Usuario u where u.password=?1 and u.email=?2")
	public Long ConsultarPorCredenciales(String ctr,String email);
}
