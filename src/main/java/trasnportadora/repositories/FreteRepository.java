package trasnportadora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import trasnportadora.domains.Cliente;
import trasnportadora.domains.Frete;

import java.util.List;


@Repository
public interface FreteRepository extends JpaRepository<Frete, Integer> {

}
