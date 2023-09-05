package classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    
    Pessoa pessoa = new Pessoa("Thiago", 37, true);
    
    @Test
    void validaIdade(){
        Assertions.assertEquals(37, pessoa.getIdade());
    }
    
}
