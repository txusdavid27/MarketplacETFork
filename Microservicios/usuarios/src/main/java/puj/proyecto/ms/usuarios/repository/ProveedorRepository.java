package puj.proyecto.ms.usuarios.repository;

import org.springframework.stereotype.Repository;

import puj.proyecto.ms.usuarios.model.Proveedor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long>{

    public abstract Proveedor findByNombre(String nombre);
}
