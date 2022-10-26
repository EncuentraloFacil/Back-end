package pe.edu.upc.EncuentraloFacil.serviceinterfaces;



import pe.edu.upc.EncuentraloFacil.entities.Donacion;


import java.util.List;
import java.util.Optional;

public interface DonacionService {
    public boolean insertar(Donacion donacion);

    public void eliminar(int id);

    Optional<Donacion> listaId(int id);

    List<Donacion> listar();

    List<Donacion> buscarProducto(String desProducto);

    List<Donacion> buscarDonacion(String nomDonar);

    List<Donacion> buscarDireccion(String direccion);

}
