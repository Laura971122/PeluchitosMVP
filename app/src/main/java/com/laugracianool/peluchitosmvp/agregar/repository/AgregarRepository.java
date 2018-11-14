package com.laugracianool.peluchitosmvp.agregar.repository;

import com.laugracianool.peluchitosmvp.agregar.interactor.IAgregarInteractor;

public class AgregarRepository implements IAgregarRepository {

    private IAgregarInteractor agregarInteractor;

    public AgregarRepository(IAgregarInteractor agregarInteractor) {
        this.agregarInteractor = agregarInteractor;
    }

    @Override
    public void agregarContacto(int codigo, String nombre, int cantidad, int precio) {
    }
}