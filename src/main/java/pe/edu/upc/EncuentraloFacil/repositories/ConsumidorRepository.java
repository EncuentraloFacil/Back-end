package pe.edu.upc.EncuentraloFacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EncuentraloFacil.entities.Consumidor;

import java.util.List;

@Repository
public interface ConsumidorRepository extends JpaRepository<Consumidor,Integer> {

    @Query("from Consumidor c where  c.nomConsumidor like %:nomConsumidor")
    List<Consumidor> buscarConsumidor(@Param("nomConsumidor") String nomConsumidor);
}
