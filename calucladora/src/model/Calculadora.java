package model;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 * É final para evitar extensão indesejada.
 */
public final class Calculadora {

    /**
     * Retorna a soma de dois valores.
     *
     * @param valor1 O primeiro valor.
     * @param valor2 O segundo valor.
     * @return A soma dos dois valores.
     */
    public double somar(final double valor1, final double valor2) {
        return valor1 + valor2;
    }

    /**
     * Retorna a subtração de dois valores.
     *
     * @param valor1 O primeiro valor.
     * @param valor2 O segundo valor.
     * @return O resultado da subtração.
     */
    public double subtrair(final double valor1, final double valor2) {
        return valor1 - valor2;
    }

    /**
     * Retorna a multiplicação de dois valores.
     *
     * @param valor1 O primeiro valor.
     * @param valor2 O segundo valor.
     * @return O resultado da multiplicação.
     */
    public double multiplicar(final double valor1, final double valor2) {
        return valor1 * valor2;
    }

    /**
     * Retorna a divisão de dois valores.
     *
     * @param valor1 O primeiro valor.
     * @param valor2 O segundo valor. Não pode ser zero.
     * @return O resultado da divisão.
     * @throws ArithmeticException se o divisor for zero.
     */
    public double dividir(final double valor1, final double valor2) {
        if (valor2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return valor1 / valor2;
    }
}
