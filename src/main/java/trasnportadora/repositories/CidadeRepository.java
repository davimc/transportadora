package trasnportadora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trasnportadora.domains.Cidade;
import trasnportadora.domains.Cliente;


@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
    public Cidade findByNome(String nome);
}
