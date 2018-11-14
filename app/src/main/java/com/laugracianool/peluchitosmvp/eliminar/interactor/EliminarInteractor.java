package com.laugracianool.peluchitosmvp.eliminar.interactor;

import com.laugracianool.peluchitosmvp.eliminar.presenter.IEliminarPresenter;
import com.laugracianool.peluchitosmvp.eliminar.repository.EliminarRepository;
import com.laugracianool.peluchitosmvp.eliminar.repository.IEliminarRepository;

public class EliminarInteractor implements IEliminarInteractor {

    private IEliminarPresenter eliminarPresenter;
    private IEliminarRepository eliminarRepository;

    public EliminarInteractor(IEliminarPresenter eliminarPresenter) {
        this.eliminarPresenter = eliminarPresenter;
        eliminarRepository = new EliminarRepository(this);
    }

    @Override
    public void eliminarDatos(String nombre) {
        if (nombre.equals("")){
            eliminarPresenter.eliminarError("El dato requerido no existe");
        }else{
            eliminarRepository.eliminarContacto(nombre);
        }
    }
}
