package com.figuras;


public class TesteCalcularArea {

    private Circulos circulos;
    private Poligono poligono;

    public void testAreaCirculo() {

        circulos = new Circulos(2.0);
        Double resultadoEsperado = 12.56;

        Double resultado = circulos.calculaArea();

        if (resultadoEsperado.equals(resultado)) {

            System.out.println("Test OK");
        } else {

            System.out.println("Teste Falhou =/");

        }

    }

    public void testAreaPoligono() {

        poligono = new Poligono(4.0, 2.0, 1);

        Double resultadoEsperado = 8.0;

        Double resultado = poligono.calculaArea();

        if (resultadoEsperado.equals(resultado)) {

            System.out.println("Test OK");
        } else {

            System.out.println("Teste Falhou =/");

        }

    }

}
