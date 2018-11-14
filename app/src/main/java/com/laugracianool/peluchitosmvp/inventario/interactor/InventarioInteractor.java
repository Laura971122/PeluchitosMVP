package com.laugracianool.peluchitosmvp.inventario.interactor;

import com.laugracianool.peluchitosmvp.inventario.presenter.IInventarioPresenter;
import com.laugracianool.peluchitosmvp.inventario.repository.IInventarioRepository;
import com.laugracianool.peluchitosmvp.inventario.repository.InventarioRepository;

public class InventarioInteractor implements IInventarioInteractor {

    private IInventarioPresenter inventarioPresenter;
    private IInventarioRepository inventarioRepository;

    public InventarioInteractor(IInventarioPresenter inventarioPresenter) {
        this.inventarioPresenter = inventarioPresenter;
        inventarioRepository = new InventarioRepository(this);
    }
}
