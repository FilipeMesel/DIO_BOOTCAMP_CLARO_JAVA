import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void calculoDeIdade() {
        Pessoa p = new Pessoa("Julia", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(4, p.getIdade());
    }
}
