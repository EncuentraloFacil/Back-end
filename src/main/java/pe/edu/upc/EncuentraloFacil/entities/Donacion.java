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
    @JoinColumn(name = "producto_id")
    private Producto producto;

    public Donacion() {
    }

    public Donacion(int id, String nomDonar, int cantidad, String direccion, Producto producto) {
        this.id = id;
        this.nomDonar = nomDonar;
        this.cantidad = cantidad;
        this.direccion = direccion;
        this.producto = producto;
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
