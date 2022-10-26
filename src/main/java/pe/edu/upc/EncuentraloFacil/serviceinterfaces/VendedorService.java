package pe.edu.upc.EncuentraloFacil.serviceinterfaces;

import pe.edu.upc.EncuentraloFacil.entities.Vendedor;

import java.util.List;

public interface VendedorService {
    public void insert(Vendedor vendedor);
    List<Vendedor> list();
    public void delete( int id );
    List<Vendedor> search(String nomVendedor);

}
