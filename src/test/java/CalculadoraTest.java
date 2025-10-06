import org.example.Cauculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Cauculadora calculadora;

    @BeforeEach
    public void setUp(){
        calculadora = new Cauculadora();
        System.out.println("Antes de cada teste...");
    }

    @Test
    public void somarDoisValores(){

        double valora = 10;
        double valorb = 20;

        double resultado = calculadora.somar(valora,valorb);

        Assertions.assertEquals(30, resultado);

    }

    @Test
    public void diminuirDoisValores(){

        double valora = 10;
        double valorb = 2;

        double resultado = calculadora.diminuir(valora,valorb);

        Assertions.assertEquals(8,resultado);
    }

    @Test
    public void multiplicarDoisValores(){

        double valora = 10;
        double valorb = 2;

        double resultado = calculadora.multiplicar(valora,valorb);

        Assertions.assertEquals(20,resultado);
    }

    @Test
    public void dividirDoisValores(){

        double valora = 10;
        double valorb = 5;

        double resultado = calculadora.dividir(valora,valorb);

        Assertions.assertEquals(2,resultado);
    }
}
