package com.laugracianool.peluchitosmvp.buscar.interactor;

import com.laugracianool.peluchitosmvp.buscar.presenter.IBuscarPresenter;
import com.laugracianool.peluchitosmvp.buscar.repository.BuscarRepository;
import com.laugracianool.peluchitosmvp.buscar.repository.IBuscarRepository;

public class BuscarInteractor implements IBuscarInteractor {

    private IBuscarPresenter buscarPresenter;
    private IBuscarRepository buscarRepository;

    public BuscarInteractor(IBuscarPresenter buscarPresenter) {
        this.buscarPresenter = buscarPresenter;
        buscarRepository = new BuscarRepository(this);
    }

    @Override
    public void enviarDatos(String nombre) {
        if (nombre.equals("")){
            buscarPresenter.mostrarError("Debe digitar el nombre");
        }else{
            buscarRepository.buscarContacto(nombre);
        }
    }
}
