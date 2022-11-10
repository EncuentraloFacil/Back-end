package pe.edu.upc.EncuentraloFacil.entities;

import javax.persistence.*;

@Entity
@Table(name = "Factura")
public class Factura {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @JoinColumn(name = "consumidor_id")
    private Consumidor consumidor;


    @ManyToOne
    @JoinColumn(name = "detalle_venta_id")
    private DetalleVenta detalleVenta;

    public Factura() {
    }

    public Factura(int id, Consumidor consumidor, DetalleVenta detalleVenta) {
        this.id = id;
        this.consumidor = consumidor;
        this.detalleVenta = detalleVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(DetalleVenta detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

}
