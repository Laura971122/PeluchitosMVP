package com.laugracianool.peluchitosmvp;

public interface Comunicador {

    void enviarDatos(int codigo, String nombre, int cantidad, int precio);

    void enviarDatosBuscar(String s);

    void eliminarDatosBuscar(String s);
}