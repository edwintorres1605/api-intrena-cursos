package co.intrena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.intrena.model.entity.RolPermiso;

@Repository
public interface RolPermisoRepository extends JpaRepository<RolPermiso, Integer>{

}
