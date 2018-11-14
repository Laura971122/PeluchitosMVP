package com.laugracianool.peluchitosmvp.agregar.presenter;

import com.laugracianool.peluchitosmvp.agregar.interactor.AgregarInteractor;
import com.laugracianool.peluchitosmvp.agregar.interactor.IAgregarInteractor;
import com.laugracianool.peluchitosmvp.agregar.view.IAgregarFragment;

public class AgregarPresenter  implements IAgregarPresenter{

    private IAgregarInteractor agregarInteractor;
    private IAgregarFragment agregarFragment;

    public AgregarPresenter(IAgregarFragment agregarFragment) {
        this.agregarFragment = agregarFragment;
        agregarInteractor = new AgregarInteractor(this);
    }

    @Override
    public void enviarDatosAgregar(int codigo, String nombre, int cantidad, int precio) {
        agregarInteractor.enviarDatosAgregar(codigo, nombre, cantidad, precio);
    }

    @Override
    public void mostrarError(String errorMessage) {
        agregarFragment.mostrarError(errorMessage);
    }
}

