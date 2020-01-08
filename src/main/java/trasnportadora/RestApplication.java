package trasnportadora;

import org.hibernate.boot.jaxb.hbm.spi.JaxbHbmTimestampSourceEnum;
import trasnportadora.domains.Cidade;
import trasnportadora.domains.Cliente;
import trasnportadora.domains.Frete;
import trasnportadora.repositories.CidadeRepository;
import trasnportadora.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import trasnportadora.repositories.FreteRepository;

import java.util.Arrays;

@SpringBootApplication
public class RestApplication /*implements CommandLineRunner */{
   /* @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private CidadeRepository cidadeRepository;
    @Autowired
    private FreteRepository freteRepository;*/

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }


    /*@Override
    public void run(String... args) throws Exception {
        Cidade cid1 = new Cidade("São Luís","MA", 35.0);
        Cidade cid2 = new Cidade("Pinheiro","MA", 39.0);
        Cidade cid3 = new Cidade("Teresina","PI", 23.0);

        cidadeRepository.saveAll(Arrays.asList(cid1,cid2,cid3));

        Cliente c1 = new Cliente("Davi", "rua dos manacas", "98982186943");
        Cliente c2 = new Cliente("Carol", "rua j", "98981885737");
        Cliente c3 = new Cliente("Danner", "rua de brasilia", "98981167889");

        Frete f1 = new Frete( c2, cid1,"S3564L27", "Computador", 3.4);

        freteRepository.save(f1);

        c2.getFretes().add(f1);

        clienteRepository.saveAll(Arrays.asList(c1,c2,c3));
    }*/
    @Bean
    public LocalValidatorFactoryBean validator(MessageSource messageSource) {
        LocalValidatorFactoryBean validatorFactoryBean = new LocalValidatorFactoryBean();
        validatorFactoryBean.setValidationMessageSource(messageSource);
        return validatorFactoryBean;
    }

}