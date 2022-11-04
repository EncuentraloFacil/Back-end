package pe.edu.upc.EncuentraloFacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EncuentraloFacil.entities.DetalleVenta;


import java.util.List;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta,Integer> {

    @Query("from DetalleVenta dv where dv.id=:id")
    List<DetalleVenta> buscarDetalleV(@Param("id") int id);

    @Query("from DetalleVenta dv where dv.ofer.desOferta like %:desOferta")
    List<DetalleVenta> buscarOfertas(@Param("desOferta") String desOferta);
}
