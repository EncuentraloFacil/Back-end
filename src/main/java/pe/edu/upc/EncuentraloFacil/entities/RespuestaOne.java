package pe.edu.upc.EncuentraloFacil.entities;

public class RespuestaOne {
    private String marca;
    private String cantidad;

    public RespuestaOne() {
    }

    public RespuestaOne(String marca, String cantidad) {
        this.marca = marca;
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
