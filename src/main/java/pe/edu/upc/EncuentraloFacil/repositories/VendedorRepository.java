package pe.edu.upc.EncuentraloFacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EncuentraloFacil.entities.Vendedor;

import java.util.List;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor,Integer> {
    @Query("from Vendedor v where  v.nomVendedor like %:nomVendedor")
    List<Vendedor> buscarVendedor(@Param("nomVendedor") String nomVendedor);

}
