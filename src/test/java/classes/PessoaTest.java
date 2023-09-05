package classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void validaSeMaiorDeIdade() {

        Pessoa pessoa1 = new Pessoa("Filipe", LocalDate.of(2019, Month.SEPTEMBER, 9));
        Assertions.assertFalse(pessoa1.maiorDeIdade());

        Pessoa pessoa2 = new Pessoa("Thiago", LocalDate.of(1985, Month.NOVEMBER, 28));
        Assertions.assertTrue(pessoa2.maiorDeIdade());

        List<Pessoa> pessoas = List.of(new Pessoa("Jéssica", LocalDate.now()),
                new Pessoa("Augusta", LocalDate.now()));

        Assertions.assertAll("Pessoas",
                () -> Assertions.assertFalse(pessoas.get(0).maiorDeIdade()),
                () -> Assertions.assertFalse(pessoas.get(1).maiorDeIdade())
        );

    }

    @Test
    @Disabled("Teste não implementado")
    void deveRetornarIdade() {
    }

}
