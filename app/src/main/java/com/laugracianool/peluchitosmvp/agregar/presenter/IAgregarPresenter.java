package com.laugracianool.peluchitosmvp.agregar.presenter;

public interface IAgregarPresenter {
    void enviarDatosAgregar(int codigo, String nombre, int cantidad, int precio);

    void mostrarError(String errorMessage);


}
