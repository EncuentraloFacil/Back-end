package pe.edu.upc.EncuentraloFacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EncuentraloFacil.entities.Vendedor;

import java.util.List;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor,Integer> {
    @Query("from Vendedor v where  v.nomVendedor like %:nomVendedor%")
    List<Vendedor> buscarVendedor(@Param("nomVendedor") String nomVendedor);

    @Query(value = "from Vendedor  v where v.edadVendedor>30")
    List<Vendedor> buscarEdad();

    @Query(value = "select v.nom_vendedor as vendedor,count(r.id) as productos from vendedor v join producto r on v.id=r.vendedor_id join notificacion n on n.id=r.notificacion_id where n.fecha_caducidad>'01/11/2022' group by v.nom_vendedor order by 2 desc",nativeQuery = true)
    List<String[]>buscarCantidadProductos();
}
