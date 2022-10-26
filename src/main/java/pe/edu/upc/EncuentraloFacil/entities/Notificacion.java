package pe.edu.upc.EncuentraloFacil.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Notificacion")
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fechaCaducidad",length = 45,nullable = false)
    private Date fechaCaducidad;

    @Column(name = "stock",length = 45,nullable = false)
    private int stock;


    public Notificacion() {
    }

    public Notificacion(int id, Date fechaCaducidad, int stock) {
        this.id = id;
        this.fechaCaducidad = fechaCaducidad;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
