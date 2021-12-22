package com.figuras;

import java.util.Scanner;

public class FigurasMain {

    public static void figuras() {
        Poligono poligono = new Poligono();
        Circulos circulos = new Circulos();
        Scanner entrada = new Scanner(System.in);

        int tipo;

        System.out.println("Selecione o Tipo de Poligono : 1 - Poligono plano ||| 2 - Circuferencia");
        tipo = entrada.nextInt();

        while (tipo < 1 || tipo > 2) {
            System.out.println("Valor digitado fora dos limites , digite novamente");
            tipo = entrada.nextInt();
        }

        switch (tipo) {
            case 1:
                System.out.println("Qual o tipo do poligono : 1 - Retangulo ||| 2 - Triangulo");
                int tipo2 = entrada.nextInt();
                while (tipo2 < 1 || tipo2 > 2) {
                    System.out.println("Valor digitado fora dos limites , digite novamente");
                    tipo2 = entrada.nextInt();
                }
                poligono.setTipo(tipo2);

                System.out.println("Digite a Base do poligono");
                Double base = entrada.nextDouble();
                poligono.setBase(base);

                System.out.println("Digite a Altura do poligono");
                Double altura = entrada.nextDouble();
                poligono.setAltura(altura);

                String resultadoPoligono = String.format("Valor da area : %.2f", poligono.calculaArea());

                System.out.println(resultadoPoligono);

                break;

            case 2:
                System.out.println("Digite o Raio da Circunferencia : ");
                Double raio = entrada.nextDouble();
                circulos.setRaio(raio);

                String resultadoCirculo = String.format("Valor da area : %.2f", circulos.calculaArea());

                System.out.println(resultadoCirculo);
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {

        figuras();

    }
}
