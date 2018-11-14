package com.laugracianool.peluchitosmvp.inventario.presenter;

import com.laugracianool.peluchitosmvp.inventario.interactor.IInventarioInteractor;
import com.laugracianool.peluchitosmvp.inventario.interactor.InventarioInteractor;
import com.laugracianool.peluchitosmvp.inventario.view.IInventarioFragment;
import com.laugracianool.peluchitosmvp.inventario.view.InventarioFragment;

public class InventarioPresenter implements IInventarioPresenter {

    private IInventarioInteractor inventarioInteractor;
    private IInventarioFragment inventarioFragment;

    public InventarioPresenter(InventarioFragment inventarioFragment) {
        this.inventarioFragment = inventarioFragment;
        inventarioInteractor = new InventarioInteractor(this);
    }
}
