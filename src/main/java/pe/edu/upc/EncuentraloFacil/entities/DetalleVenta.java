package pe.edu.upc.EncuentraloFacil.entities;

import javax.persistence.*;

@Entity
@Table(name = "DetalleVenta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cantidadVenta",length = 45,nullable = false)
    private int cantidadVenta;
    @Column(name = "totalVenta",length = 45,nullable = false)
    private int totalVenta;

    @ManyToOne
    @JoinColumn(name = "ofer_id")
    private Oferta ofer;

    public DetalleVenta() {
    }

    public DetalleVenta(int id, int cantidadVenta, int totalVenta, Oferta ofer) {
        this.id = id;
        this.cantidadVenta = cantidadVenta;
        this.totalVenta = totalVenta;
        this.ofer = ofer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(int cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public int getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(int totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Oferta getOfer() {
        return ofer;
    }

    public void setOfer(Oferta ofer) {
        this.ofer = ofer;
    }


}
