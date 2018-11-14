package com.laugracianool.peluchitosmvp.buscar.presenter;

public interface IBuscarPresenter {
    void enviarDatosBuscar(String nombre);

    void mostrarError(String errorMessage);
}
