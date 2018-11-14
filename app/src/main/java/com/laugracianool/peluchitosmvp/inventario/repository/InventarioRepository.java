package com.laugracianool.peluchitosmvp.inventario.repository;

import com.laugracianool.peluchitosmvp.inventario.interactor.IInventarioInteractor;

public class InventarioRepository implements IInventarioRepository {

    private IInventarioInteractor inventarioInteractor;

    public InventarioRepository(IInventarioInteractor inventarioInteractor) {
        this.inventarioInteractor = inventarioInteractor;
    }
}
