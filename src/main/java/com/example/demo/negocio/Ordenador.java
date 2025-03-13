package com.example.demo.negocio;

public class Ordenador {

    private int numero;
    private String marca;
    public Ordenador(int numero, String marca, String modelo, int precio) {
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public Ordenador() {
    }
    public Ordenador(int numero) {
        this.numero = numero;
    }
    private String modelo;
    private int precio;
    public int getNumero() {
        return numero;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getPrecio() {
        return precio;
    }

}
