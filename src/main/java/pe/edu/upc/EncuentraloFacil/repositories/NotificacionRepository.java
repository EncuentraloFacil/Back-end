package pe.edu.upc.EncuentraloFacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.EncuentraloFacil.entities.Notificacion;

import java.util.Date;
import java.util.List;

@Repository
public interface NotificacionRepository extends JpaRepository<Notificacion,Integer> {


    @Query("from Notificacion n where n.fechaCaducidad =:fechaCaducidad" )
    List<Notificacion> buscarNotificacion(@Param("fechaCaducidad") String fechaCaducidad);

    @Query(value="select * from notificacion f where f.fecha_caducidad between '2022-11-01' and '2022-11-30'",nativeQuery = true)
    List<Notificacion> buscarFecha();
}
