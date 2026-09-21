package cl.iplacex;

public class CalculadoraService {

    private final Calculadora calculadora;

    public CalculadoraService(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public int calcularResultadoFinal(int valor1, int valor2, int descuento) {
        int suma = calculadora.sumar(valor1, valor2);
        return calculadora.restar(suma, descuento);
    }
}