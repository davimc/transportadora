package trasnportadora.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trasnportadora.domains.Cidade;
import trasnportadora.repositories.CidadeRepository;
import trasnportadora.services.exceptions.CidadeException;

import javax.validation.ConstraintViolationException;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public void inserir(Cidade cidade) throws CidadeException {
        try{
            cidadeRepository.save(cidade);
        }catch (ConstraintViolationException e){
            throw new CidadeException(e);
        }
    }
    public void remover(Integer id){
        cidadeRepository.deleteById(id);
    }
}
