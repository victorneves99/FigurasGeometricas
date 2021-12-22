package com.figuras;

public class Circulos extends FigurasGeometricas {

    private Double raio;

    public Circulos(Double raio) {
        this.raio = raio;
    }

    public Circulos() {
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double calculaArea() {

        return 3.14 * (this.raio * this.raio);

    }

}
