package pe.edu.upc.EncuentraloFacil.entities;

public class Respuesta {
    private String nomVendedor;
    private String cantidad;

    public Respuesta() {
    }

    public Respuesta(String nomVendedor, String cantidad) {
        this.nomVendedor = nomVendedor;
        this.cantidad = cantidad;
    }

    public String getNomVendedor() {
        return nomVendedor;
    }

    public void setNomVendedor(String nomVendedor) {
        this.nomVendedor = nomVendedor;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
