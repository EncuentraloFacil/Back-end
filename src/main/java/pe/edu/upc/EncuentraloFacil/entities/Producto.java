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
    private String MarcaProducto;
    @ManyToOne
    @JoinColumn(name = "id_vendedor_id", nullable = false)
    private Vendedor idVendedor;
    @ManyToOne
    @JoinColumn(name = "id_categoria_id", nullable = false)
    private Categoria idCategoria;
    @ManyToOne
    @JoinColumn(name = "id_notificacion_id", nullable = false)
    private Notificacion idNotificacion;

    public Notificacion getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(Notificacion idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Vendedor getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Vendedor idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Producto() {
    }

    public Producto(int id, String desProducto, String marcaProducto, Vendedor idVendedor, Categoria idCategoria, Notificacion idNotificacion) {
        this.id = id;
        this.desProducto = desProducto;
        MarcaProducto = marcaProducto;
        this.idVendedor = idVendedor;
        this.idCategoria = idCategoria;
        this.idNotificacion = idNotificacion;
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
        return MarcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        MarcaProducto = marcaProducto;
    }
}
