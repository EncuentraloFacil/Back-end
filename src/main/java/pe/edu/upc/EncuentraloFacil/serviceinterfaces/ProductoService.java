package pe.edu.upc.EncuentraloFacil.serviceinterfaces;

import pe.edu.upc.EncuentraloFacil.entities.Producto;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ProductoService {

    public boolean insertar(Producto producto);

    public void eliminar(int id);

    Optional<Producto> listarId(int id);

    List<Producto> listar();

    List<Producto> buscarProducto(String desProducto);

    List<Producto> buscarMarca(String MarcaProducto);

    List<Producto> buscarVendedor(String nomVendedor);

    List<Producto> buscarCategoria(String nomCategoria);

    List<Producto> buscarNotificacion(Date fechaCaducidad);

}
