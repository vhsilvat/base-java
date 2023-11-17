package com.example.javacore;

public class LambdaStreams {

    /*
     * Expressões Lambda foram introduzidas no Java 8 para fornecer uma forma mais
     * concisa e funcional de escrever códigos em java. Elas são uma parte fundamental
     * da programação funcional no java e oferecem uma maneira mais simples de expressar
     * comportamentos de forma mais concisa.
     *
     * A sintaxe básica de uma expressão lambda é a seguinte:
     * (parâmetros) -> expressão
     * Parâmetros: lista de parâmetros separados por vírgulas, ou vazio ()
     * Seta(->): separa os parâmetros da expressão lambda
     * Expressão: corpo da expressão lambda, que pode ser uma única expressão ou
     * um bloco de código.
     */

    // (x, y) -> x + y

    // () -> "Hello, World!"

    // (x, y) -> {
    //     int sum = x + y;
    //     return sum;
    // }

    // Anotar uma interface com @FunctionalInterface é opcional, mas isso garante
    // que ela tenha apenas um método abstrato, tornando-a uma interface funcional.
    @FunctionalInterface
    interface OperacaoMatematica {
        int calcular(int a, int b);
    }

    static OperacaoMatematica soma = (a, b) -> a + b;
    static OperacaoMatematica subtracao = (a, b) -> a - b;

    public static void main(String[] args) {
        System.out.println(soma.calcular(5, 3)); // Saída: 8
        System.out.println(subtracao.calcular(5, 3)); // Saída: 2
    }

}
