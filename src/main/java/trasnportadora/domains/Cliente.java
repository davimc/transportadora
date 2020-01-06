package trasnportadora.domains;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonBackReference

    @OneToMany(mappedBy = "cliente")
    private List<Frete> fretes;
    @NotEmpty(message = "O nome deve ser preenchido")
    private String nome;
    @NotEmpty(message = "O endereço deve ser preenchido")
    private String endereco;
    @NotEmpty(message = "O telefone deve ser preenchido")
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, String endereco, String telefone) {

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public List<Frete> getFretes() {
        return fretes;
    }

    public void setFretes(List<Frete> fretes) {
        this.fretes = fretes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
