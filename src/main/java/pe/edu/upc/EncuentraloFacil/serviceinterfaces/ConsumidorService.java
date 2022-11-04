package pe.edu.upc.EncuentraloFacil.serviceinterfaces;


import pe.edu.upc.EncuentraloFacil.entities.Consumidor;

import java.util.List;
import java.util.Optional;

public interface ConsumidorService {
    public void insert(Consumidor consumidor);
    List<Consumidor> list();
    public void delete( int id );
    List<Consumidor> search(String nomConsumidor);

    Optional<Consumidor> listarId(int idConsumidor);

}
