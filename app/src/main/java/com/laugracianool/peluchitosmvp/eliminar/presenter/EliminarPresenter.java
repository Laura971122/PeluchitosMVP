package com.laugracianool.peluchitosmvp.eliminar.presenter;

import com.laugracianool.peluchitosmvp.eliminar.interactor.EliminarInteractor;
import com.laugracianool.peluchitosmvp.eliminar.interactor.IEliminarInteractor;
import com.laugracianool.peluchitosmvp.eliminar.view.IEliminarFragment;

public class EliminarPresenter implements IEliminarPresenter{

    private IEliminarInteractor eliminarInteractor;
    private IEliminarFragment eliminarFragment;

    public EliminarPresenter(IEliminarFragment eliminarFragment) {
        this.eliminarFragment = eliminarFragment;
        eliminarInteractor = new EliminarInteractor(this);
    }

    @Override
    public void eliminarDatos(String nombre) {
        eliminarInteractor.eliminarDatos(nombre);
    }

    @Override
    public void eliminarError(String eliminarMessage) {
        eliminarFragment.eliminarError(eliminarMessage);
    }
}
