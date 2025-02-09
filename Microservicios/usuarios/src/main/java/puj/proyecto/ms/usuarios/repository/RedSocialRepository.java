package puj.proyecto.ms.usuarios.repository;

import org.springframework.stereotype.Repository;

import puj.proyecto.ms.usuarios.model.RedSocial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;;

@Repository
public interface RedSocialRepository extends JpaRepository<RedSocial, Long>{

    public abstract RedSocial findByNombre(String nombre);
}
