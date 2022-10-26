package pe.edu.upc.EncuentraloFacil.entities;

import javax.persistence.*;

@Entity
@Table(name = "Vendedor")
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nomVendedor",length = 45,nullable = false)
    private String nomVendedor;

    @Column(name = "dniVendedor",length = 45,nullable = false)
    private int dniVendedor;

    @Column(name = "edadVendedor",length = 45,nullable = false)
    private int edadVendedor;

    @Column(name = "celVendedor",length = 45,nullable = false)
    private int celVendedor;

    @Column(name = "emailVendedor",length = 45,nullable = false)
    private String emailVendedor;

    @Column(name = "username",length = 45,nullable = false)
    private String username;

    @Column(name = "npassword",length = 45,nullable = false)
    private String password;

    public Vendedor() {
    }

    public Vendedor(int id, String nomVendedor, int dniVendedor, int edadVendedor, int celVendedor, String emailVendedor, String username, String password) {
        this.id = id;
        this.nomVendedor = nomVendedor;
        this.dniVendedor = dniVendedor;
        this.edadVendedor = edadVendedor;
        this.celVendedor = celVendedor;
        this.emailVendedor = emailVendedor;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomVendedor() {
        return nomVendedor;
    }

    public void setNomVendedor(String nomVendedor) {
        this.nomVendedor = nomVendedor;
    }

    public int getDniVendedor() {
        return dniVendedor;
    }

    public void setDniVendedor(int dniVendedor) {
        this.dniVendedor = dniVendedor;
    }

    public int getEdadVendedor() {
        return edadVendedor;
    }

    public void setEdadVendedor(int edadVendedor) {
        this.edadVendedor = edadVendedor;
    }

    public int getCelVendedor() {
        return celVendedor;
    }

    public void setCelVendedor(int celVendedor) {
        this.celVendedor = celVendedor;
    }

    public String getEmailVendedor() {
        return emailVendedor;
    }

    public void setEmailVendedor(String emailVendedor) {
        this.emailVendedor = emailVendedor;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
