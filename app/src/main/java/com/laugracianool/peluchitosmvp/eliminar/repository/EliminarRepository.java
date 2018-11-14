package com.laugracianool.peluchitosmvp.eliminar.repository;

import com.laugracianool.peluchitosmvp.eliminar.interactor.IEliminarInteractor;

public class EliminarRepository implements IEliminarRepository {

    private IEliminarInteractor eliminarInteractor;

    public EliminarRepository(IEliminarInteractor eliminarInteractor) {
        this.eliminarInteractor = eliminarInteractor;
    }

    @Override
    public void eliminarContacto(String nombre) {
        eliminarInteractor.eliminarDatos(nombre);
    }
}