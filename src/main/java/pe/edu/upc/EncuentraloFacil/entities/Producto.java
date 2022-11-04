package pe.edu.upc.EncuentraloFacil.entities;

import javax.persistence.*;

@Entity
@Table(name="Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "desProducto",length = 45,nullable = false)
    private String desProducto;
    @Column(name = "MarcaProducto",length = 45,nullable = false)
    private String marcaProducto;

    @ManyToOne
    @JoinColumn(name = "vendedor_id")
    private Vendedor vendedor;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "notificacion_id")
    private Notificacion notificacion;

    public Producto() {
    }

    public Producto(int id, String desProducto, String marcaProducto, Vendedor vendedor, Categoria categoria, Notificacion notificacion) {
        this.id = id;
        this.desProducto = desProducto;
        this.marcaProducto = marcaProducto;
        this.vendedor = vendedor;
        this.categoria = categoria;
        this.notificacion = notificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesProducto() {
        return desProducto;
    }

    public void setDesProducto(String desProducto) {
        this.desProducto = desProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }


}
