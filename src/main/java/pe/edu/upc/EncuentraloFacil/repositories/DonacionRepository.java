package pe.edu.upc.EncuentraloFacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EncuentraloFacil.entities.Donacion;

import java.util.List;

@Repository
public interface DonacionRepository extends JpaRepository<Donacion,Integer> {

    @Query("from Donacion d where d.nomDonar like %:nomDonar%")
    List<Donacion> buscarDonacion(@Param("nomDonar") String nomDonar);

    @Query("from Donacion d where d.producto.desProducto like %:desProducto%")
    List<Donacion> buscarProducto(@Param("desProducto") String desProducto);

    @Query("from Donacion d where d.direccion like %:direccion%")
    List<Donacion> buscarDireccion(@Param("direccion") String direccion);



}
