package cl.iplacex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraIntegracionTest {

    @Test
    void debeIntegrarCalculadoraConServicio() {
        Calculadora calculadora = new Calculadora();
        CalculadoraService servicio = new CalculadoraService(calculadora);

        int resultado = servicio.calcularResultadoFinal(10, 5, 3);

        assertEquals(12, resultado);
    }
}