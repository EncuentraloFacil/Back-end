package pe.edu.upc.EncuentraloFacil.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.EncuentraloFacil.entities.Notificacion;
import pe.edu.upc.EncuentraloFacil.repositories.NotificacionRepository;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.NotificacionService;

import java.util.Date;
import java.util.List;

@Service
public class NotificacionServiceImpl implements NotificacionService {
    @Autowired
    private NotificacionRepository nR;

    @Override
    public void insert(Notificacion notificacion) {
        nR.save(notificacion);

    }

    @Override
    public List<Notificacion> list() {
        return nR.findAll();
    }

    @Override
    public void delete(int id) {
        nR.deleteById(id);
    }

    @Override
    public List<Notificacion> buscar(Date fechaCaducidad) {
        return nR.buscarNotificacion(fechaCaducidad);
    }


}
