package cl.iplacex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraAcceptanceTest {

    @Test
    void debeCompletarOperacionEsperadaPorElUsuario() {
        Calculadora calculadora = new Calculadora();
        CalculadoraService servicio = new CalculadoraService(calculadora);

        int resultado = servicio.calcularResultadoFinal(20, 10, 5);

        assertEquals(25, resultado);
    }
}