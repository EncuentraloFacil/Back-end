package pe.edu.upc.EncuentraloFacil.entities;

import javax.persistence.*;

@Entity
@Table(name = "Donacion")
public class Donacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nomDonar",length = 45,nullable = false)
    private String nomDonar;

    @Column(name = "cantidad",length = 45,nullable = false)
    private int cantidad;

    @Column(name = "direccion",length = 45,nullable = false)
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "id_producto_id")
    private Producto idProducto;

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Donacion() {
    }

    public Donacion(int id, String nomDonar, int cantidad, String direccion, Producto idProducto) {
        this.id = id;
        this.nomDonar = nomDonar;
        this.cantidad = cantidad;
        this.direccion = direccion;
        this.idProducto = idProducto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDonar() {
        return nomDonar;
    }

    public void setNomDonar(String nomDonar) {
        this.nomDonar = nomDonar;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
