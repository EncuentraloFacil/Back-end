package pe.edu.upc.EncuentraloFacil.serviceinterfaces;

import pe.edu.upc.EncuentraloFacil.entities.Notificacion;

import java.util.Date;
import java.util.List;

public interface NotificacionService {

    public void insert(Notificacion notificacion);
    List<Notificacion> list();
    public void delete( int id );
    List<Notificacion> buscar(Date fechaCaducidad);

}
