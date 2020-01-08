package trasnportadora.domains;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.*;

import javax.validation.constraints.NotNull;
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
    @Positive(message = "A cidade deve possuir um valor ")
    private double valor;

    public Cidade() {
    }

    public Cidade(String nome, String uf, double valor) {
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
