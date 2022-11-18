package pe.edu.upc.EncuentraloFacil.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EncuentraloFacil.entities.Reporte;


import java.util.List;

@Repository
public interface ReporteRepository extends JpaRepository<Reporte, Integer> {

    @Query("from Reporte r where r.desReporte like %:desReporte%")
    List<Reporte> buscarReporte (@Param("desReporte") String desReporte);

    @Query("from Reporte r where r.consumidor.nomConsumidor like %:nomConsumidor%")
    List<Reporte> buscarConsumidor (@Param("nomConsumidor") String nomConsumidor);

    @Query("from Reporte r where r.vendedor.nomVendedor like %:nomVendedor%")
    List<Reporte> buscarVendedor(@Param("nomVendedor") String nomVendedor);
}
