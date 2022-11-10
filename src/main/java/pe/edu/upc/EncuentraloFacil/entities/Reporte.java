package pe.edu.upc.EncuentraloFacil.entities;

import javax.persistence.*;

@Entity
@Table(name = "Reporte")
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "desReporte",length = 45,nullable = false)
    private String desReporte;

    @ManyToOne
    @JoinColumn(name = "vendedor_id")
    private Vendedor vendedor;

    @ManyToOne
    @JoinColumn(name = "consumidor_id")
    private Consumidor consumidor;

    public Reporte() {
    }

    public Reporte(int id, String desReporte, Vendedor vendedor, Consumidor consumidor) {
        this.id = id;
        this.desReporte = desReporte;
        this.vendedor = vendedor;
        this.consumidor = consumidor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesReporte() {
        return desReporte;
    }

    public void setDesReporte(String desReporte) {
        this.desReporte = desReporte;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }


}
