package classes;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
    
    @Test
    void validaSeMaiorDeIdadePessoaIndividual() {
        
        Pessoa pessoa = new Pessoa("Thiago", LocalDate.of(1985, Month.NOVEMBER, 28));
        
        assertTrue(pessoa.maiorDeIdade());
        
    }
    
    @Test
    void validaSeMaiorDeIdadeListaDePessoas() {
        
        List<Pessoa> pessoas = List.of(new Pessoa("Jéssica", LocalDate.now()),
                new Pessoa("Augusta", LocalDate.now()));
        
        assertAll("Pessoas",
                () -> assertFalse(pessoas.get(0).maiorDeIdade()),
                () -> assertFalse(pessoas.get(1).maiorDeIdade())
        );
        
    }
    
    @Test
    void validaArraysEquals() {
        
        int[] arrayReferencia = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int[] arrayASerTestado = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60};
        
        assertArrayEquals(arrayReferencia, arrayASerTestado);
        
    }
    
    @Test
    void validaArraysNotEquals() {
        
        int[] arrayReferencia = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int[] arrayASerTestado = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60};
        
        assertNotEquals(arrayReferencia, arrayASerTestado);
        
    }
    
    @Test
    void validaSeNulo() {
        
        Pessoa pessoa = null;
        
        assertNull(pessoa);
        
    }    
    
}
