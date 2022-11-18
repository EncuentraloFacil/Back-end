package pe.edu.upc.EncuentraloFacil.serviceinterfaces;

import pe.edu.upc.EncuentraloFacil.entities.Factura;


import java.util.List;
import java.util.Optional;

public interface FacturaService {


    public boolean insertar(Factura factura);

    public void eliminar(int id);

    Optional<Factura> listarId(int id);

    List<Factura> listar();


    List<Factura> buscarConsumidor(String nomConsumidor);



}


