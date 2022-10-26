package pe.edu.upc.EncuentraloFacil.entities;

import javax.persistence.*;

@Entity
@Table(name = "Consumidor")
public class Consumidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nomConsumidor",length = 45,nullable = false)
    private String nomConsumidor;

    @Column(name = "dniConsumidor",length = 45,nullable = false)
    private int dniConsumidor;

    @Column(name = "edadConsumidor",length = 45,nullable = false)
    private int edadConsumidor;

    @Column(name = "celConsumidor",length = 45,nullable = false)
    private int celConsumidor;

    @Column(name = "emailConsumidor",length = 45,nullable = false)
    private String emailConsumidor;

    @Column(name = "username",length = 45,nullable = false)
    private String username;

    @Column(name = "password",length = 45,nullable = false)
    private String password;

    public Consumidor() {
    }

    public Consumidor(int id, String nomConsumidor, int dniConsumidor, int edadConsumidor, int celConsumidor, String emailConsumidor, String username, String password) {
        this.id = id;
        this.nomConsumidor = nomConsumidor;
        this.dniConsumidor = dniConsumidor;
        this.edadConsumidor = edadConsumidor;
        this.celConsumidor = celConsumidor;
        this.emailConsumidor = emailConsumidor;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomConsumidor() {
        return nomConsumidor;
    }

    public void setNomConsumidor(String nomConsumidor) {
        this.nomConsumidor = nomConsumidor;
    }

    public int getDniConsumidor() {
        return dniConsumidor;
    }

    public void setDniConsumidor(int dniConsumidor) {
        this.dniConsumidor = dniConsumidor;
    }

    public int getEdadConsumidor() {
        return edadConsumidor;
    }

    public void setEdadConsumidor(int edadConsumidor) {
        this.edadConsumidor = edadConsumidor;
    }

    public int getCelConsumidor() {
        return celConsumidor;
    }

    public void setCelConsumidor(int celConsumidor) {
        this.celConsumidor = celConsumidor;
    }

    public String getEmailConsumidor() {
        return emailConsumidor;
    }

    public void setEmailConsumidor(String emailConsumidor) {
        this.emailConsumidor = emailConsumidor;
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
