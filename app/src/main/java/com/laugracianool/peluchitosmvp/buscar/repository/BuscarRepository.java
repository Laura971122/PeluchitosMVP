package com.laugracianool.peluchitosmvp.buscar.repository;

import com.laugracianool.peluchitosmvp.buscar.interactor.IBuscarInteractor;

public class BuscarRepository implements IBuscarRepository {

    private IBuscarInteractor buscarInteractor;

    public BuscarRepository(IBuscarInteractor buscarInteractor) {
        this.buscarInteractor = buscarInteractor;
    }

    @Override
    public void buscarContacto(String nombre) {
    }
}
