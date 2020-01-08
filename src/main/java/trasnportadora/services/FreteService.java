package trasnportadora.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trasnportadora.domains.Frete;
import trasnportadora.repositories.FreteRepository;
import trasnportadora.services.exceptions.FreteException;

import javax.validation.ConstraintViolationException;

@Service
public class FreteService {

    @Autowired
    private FreteRepository freteRepository;

    public void inserir(Frete frete) throws FreteException {
        try{
            freteRepository.save(frete);
        }catch (ConstraintViolationException e){
            throw new FreteException(e);
        }
    }
    public void remover(Integer id){
        freteRepository.deleteById(id);
    }
}
