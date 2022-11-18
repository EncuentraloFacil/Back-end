package pe.edu.upc.EncuentraloFacil.serviceinterfaces;



import pe.edu.upc.EncuentraloFacil.entities.Reporte;

import java.util.List;
import java.util.Optional;

public interface ReporteService {

    public boolean insertar(Reporte reporte);

    public void eliminar(int id);

    Optional<Reporte> listarId(int id);

    List<Reporte> listar();

    List<Reporte> buscarReporte(String desReporte);

    List<Reporte> buscarConsumidor(String nomConsumidor);

    List<Reporte> buscarVendedor(String nomVendedor);

}
