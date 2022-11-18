package pe.edu.upc.EncuentraloFacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EncuentraloFacil.entities.Oferta;


import java.util.List;

@Repository
public interface OfertaRepository extends JpaRepository<Oferta,Integer> {

    @Query("from Oferta o where o.desOferta like %:desOferta%")
    List<Oferta> buscarOferta (@Param("desOferta") String desOferta);

    @Query("from Oferta o where o.producto.desProducto like %:desProducto%")
    List<Oferta> buscarProducto (@Param("desProducto") String desProducto);



}
