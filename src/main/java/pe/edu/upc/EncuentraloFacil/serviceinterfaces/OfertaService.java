package pe.edu.upc.EncuentraloFacil.serviceinterfaces;

import pe.edu.upc.EncuentraloFacil.entities.Oferta;

import java.util.List;
import java.util.Optional;

public interface OfertaService {


    public boolean insertar(Oferta oferta);

    public void eliminar(int id);

    Optional<Oferta> listarId(int id);

    List<Oferta> listar();

    List<Oferta> buscarOferta(String desOferta);

    List<Oferta> buscarProducto(String desProducto);

    List<Oferta> buscarPrecio(Double precioOferta);


}
