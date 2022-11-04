package pe.edu.upc.EncuentraloFacil.serviceinterfaces;

import pe.edu.upc.EncuentraloFacil.entities.Vendedor;

import java.util.List;
import java.util.Optional;

public interface VendedorService {
    public void insert(Vendedor vendedor);
    List<Vendedor> list();
    public void delete( int id );
    List<Vendedor> search(String nomVendedor);

    Optional<Vendedor> listarId(int idVendedor);


}
