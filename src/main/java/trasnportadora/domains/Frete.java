package trasnportadora.domains;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Frete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "A encomenda precisa de receptor")
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;
    @NotEmpty(message = "A encomenda precisa de um destino")
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="cidade_id")

    @NotEmpty(message = "A cidade deve ser preenchida")
    private Cidade cidade;
    @NotEmpty(message = "O código deve ser preenchido")
    private String codigo;
    @NotEmpty(message = "A descrição deve ser preenchida")
    private String descricao;
    private Double peso;
    private Double valor;

    public Frete() {
    }

    public Frete(Cliente cliente, Cidade cidade, String codigo, String descricao, Double peso) {
        this.cliente = cliente;
        this.cidade = cidade;
        this.codigo = codigo;
        this.descricao = descricao;
        this.peso = peso;
        this.valor = calculaValor();
    }

    public Integer getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    private Double calculaValor(){
        return 0.0;
    }
}
