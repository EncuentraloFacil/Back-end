package pe.edu.upc.EncuentraloFacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EncuentraloFacil.entities.Categoria;

import java.util.List;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
    @Query("from Categoria c where  c.nomCategoria like %:nomCategoria")
    List<Categoria> buscarCategoria(@Param("nomCategoria") String nomCategoria);

}
