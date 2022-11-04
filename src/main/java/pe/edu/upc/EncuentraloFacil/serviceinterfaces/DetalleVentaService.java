package pe.edu.upc.EncuentraloFacil.serviceinterfaces;


import pe.edu.upc.EncuentraloFacil.entities.DetalleVenta;

import java.util.List;
import java.util.Optional;

public interface DetalleVentaService {

    public boolean insertar(DetalleVenta venta);

    public void eliminar(int id);

    Optional<DetalleVenta> listarId(int id);

    List<DetalleVenta> listar();

    List<DetalleVenta> buscarDetalleVenta(int id);

    List<DetalleVenta> buscarOfertas(String desOferta);




}
