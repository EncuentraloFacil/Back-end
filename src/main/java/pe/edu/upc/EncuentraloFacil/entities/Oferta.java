package pe.edu.upc.EncuentraloFacil.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Oferta")
public class Oferta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(name = "desOferta",length = 45,nullable = false)
    private String desOferta;
    @Column(name = "precioOferta",length = 45,nullable = false)
    private Double precioOferta;
    @Column(name = "fechaPublicacion",length = 45,nullable = false)
    private Date fechaPublicacion;


    public Oferta() {
    }

    public Oferta(int id, String desOferta, Double precioOferta, Date fechaPublicacion, Producto producto) {
        this.id = id;
        this.desOferta = desOferta;
        this.precioOferta = precioOferta;
        this.fechaPublicacion = fechaPublicacion;
        this.producto = producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesOferta() {
        return desOferta;
    }

    public void setDesOferta(String desOferta) {
        this.desOferta = desOferta;
    }

    public Double getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(Double precioOferta) {
        this.precioOferta = precioOferta;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @ManyToOne
    @JoinColumn(name = "producto_id")


    private Producto producto;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


}
