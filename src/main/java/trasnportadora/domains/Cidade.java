package trasnportadora.domains;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "A cidade deve ser preenchido")
    private String nome;
    @NotEmpty(message = "O estado deve ser preenchido")
    private String uf;
    @NotNull
    private Double valor;

    public Cidade() {
    }

    public Cidade(String nome, String uf, Double valor) {
        this.nome = nome;
        this.uf = uf;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
