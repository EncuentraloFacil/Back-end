package pe.edu.upc.EncuentraloFacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EncuentraloFacil.entities.Producto;


import java.util.Date;
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {

    @Query("from Producto p where p.desProducto like %:desProducto%")
    List<Producto> buscarProducto (@Param("desProducto") String desProducto);

    @Query("from Producto p where p.marcaProducto like %:marcaProducto%")
    List<Producto> buscarMarca(@Param("marcaProducto") String marcaProducto);

    @Query("from Producto p where p.vendedor.nomVendedor like %:nomVendedor%")
    List<Producto> buscarVendedor(@Param("nomVendedor") String nomVendedor);

    @Query("from Producto p where p.categoria.nomCategoria like %:nomCategoria%")
    List<Producto> buscarCategoria (@Param("nomCategoria") String nomCategoria);

    @Query("from Producto p where p.notificacion.fechaCaducidad =:fechaCaducidad" )
    List<Producto> buscarNotificacion(@Param("fechaCaducidad") Date fechaCaducidad);
}
