package pe.edu.upc.EncuentraloFacil.serviceinterfaces;

import pe.edu.upc.EncuentraloFacil.entities.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    public void insert(Categoria categoria);
    List<Categoria> list();
    public void delete(int idCategoria);
    List<Categoria> search(String nomCategoria);

    Optional<Categoria> listarId(int idCategoria);

}
