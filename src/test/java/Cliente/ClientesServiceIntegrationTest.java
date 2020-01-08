package Cliente;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import trasnportadora.RestApplication;
import trasnportadora.domains.Cliente;
import trasnportadora.repositories.ClienteRepository;
import trasnportadora.services.ClienteService;
import trasnportadora.services.exceptions.ClienteException;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestApplication.class)
public class ClientesServiceIntegrationTest {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ClienteRepository clienteRepository;

    private Cliente cliente;

    private Validator validator;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void start(){

        cliente = new Cliente("Davi", "rua dos manacas", "98982186943");
    }



    @Test
    public void inserirComNomeNuloDeveLancarException() throws Exception{
        expectedException.expect((ClienteException.class));
        expectedException.expectMessage("O nome deve ser preenchido");

        cliente.setNome(null);
        clienteService.inserir(cliente);
    }
    @Test
    public void inserirComTelefoneNuloDeveLancarException() throws Exception{
        expectedException.expect((ClienteException.class));
        expectedException.expectMessage("O telefone deve ser preenchido");

        cliente.setTelefone(null);
        clienteService.inserir(cliente);
    }
    @Test
    public void inserirComEnderecoNuloDeveLancarException() throws Exception{
        expectedException.expect((ClienteException.class));
        expectedException.expectMessage("O endereço deve ser preenchido");

        cliente.setEndereco(null);
        clienteService.inserir(cliente);
    }
    @Test
    public void retornarListaDeFretesDeUmCliente() {

    }
}
