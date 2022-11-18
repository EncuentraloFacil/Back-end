package pe.edu.upc.EncuentraloFacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EncuentraloFacil.entities.Factura;



import java.util.List;


@Repository
public interface FacturaRepository extends JpaRepository<Factura,Integer> {


    @Query("from Factura f where f.consumidor.nomConsumidor like %:nomConsumidor%")
    List<Factura> buscarConsumidor (@Param("nomConsumidor") String nomConsumidor);
}
