package com.laugracianool.peluchitosmvp.buscar.presenter;

import com.laugracianool.peluchitosmvp.buscar.interactor.BuscarInteractor;
import com.laugracianool.peluchitosmvp.buscar.interactor.IBuscarInteractor;
import com.laugracianool.peluchitosmvp.buscar.view.IBuscarFragment;

public class BuscarPresenter implements IBuscarPresenter {

    private IBuscarInteractor buscarInteractor;
    private IBuscarFragment buscarFragment;

    public BuscarPresenter(IBuscarFragment buscarFragment) {
        this.buscarFragment = buscarFragment;
        buscarInteractor = new BuscarInteractor(this);
    }

    @Override
    public void enviarDatosBuscar( String nombre) {
        buscarInteractor.enviarDatos( nombre);
    }

    @Override
    public void mostrarError(String errorMessage) {
        buscarFragment.mostrarError(errorMessage);
    }
}
