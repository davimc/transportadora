package trasnportadora.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trasnportadora.domains.Cliente;
import trasnportadora.repositories.ClienteRepository;
import trasnportadora.services.exceptions.ClienteException;

import javax.validation.ConstraintViolationException;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void inserir(Cliente cliente) throws ClienteException {
        try{
            clienteRepository.save(cliente);
        }catch (ConstraintViolationException e){
            throw new ClienteException(e);
        }
    }
    public void remover(Integer id){
        clienteRepository.deleteById(id);
    }
    
}
