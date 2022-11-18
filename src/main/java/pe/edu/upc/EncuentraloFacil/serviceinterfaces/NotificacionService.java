package pe.edu.upc.EncuentraloFacil.serviceinterfaces;

import pe.edu.upc.EncuentraloFacil.entities.Notificacion;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface NotificacionService {

    public void insert(Notificacion notificacion);
    List<Notificacion> list();
    public void delete( int id );
    List<Notificacion> buscar(String fechaCaducidad);

    Optional<Notificacion> listarId(int idNotificacion);

    List<Notificacion> buscarFecha();
}
