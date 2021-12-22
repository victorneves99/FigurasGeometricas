package com.figuras;

public class Poligono extends FigurasGeometricas {

    private Double base;
    private Double altura;
    private Integer tipo;

    public Poligono(Double area, Double base, Double altura, Integer tipo) {
        super(area);
        this.base = base;
        this.altura = altura;
        this.tipo = tipo;
    }

    public Poligono(Double base, Double altura, Integer tipo) {
        this.base = base;
        this.altura = altura;
        this.tipo = tipo;
    }

    public Poligono() {

    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Double calculaArea() {

        if (this.tipo.equals(1)) {
            return this.base * this.altura;
        } else {
            return (this.base * this.altura) / 2;
        }

    }
}
