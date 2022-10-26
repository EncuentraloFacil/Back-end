package pe.edu.upc.EncuentraloFacil.entities;

import javax.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nomCategoria",length = 45,nullable = false)
    private String nomCategoria;

    public Categoria() {
    }

    public Categoria(int id, String nomCategoria) {
        this.id = id;
        this.nomCategoria = nomCategoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }
}
