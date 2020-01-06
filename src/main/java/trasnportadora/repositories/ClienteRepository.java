package trasnportadora.repositories;

import org.springframework.data.jpa.repository.Query;
import trasnportadora.domains.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    public Cliente findByTelefone(String telefone);


}
