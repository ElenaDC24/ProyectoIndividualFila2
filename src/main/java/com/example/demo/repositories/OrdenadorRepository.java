package com.example.demo.repositories;

import java.util.List;

import com.example.demo.negocio.Ordenador;

public interface OrdenadorRepository {
    List<Ordenador>buscarTodos();
    void insertar(Ordenador ordenador);
    void borrar(Ordenador ordenador);
}
