package com.laugracianool.peluchitosmvp.agregar.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.laugracianool.peluchitosmvp.R;
import com.laugracianool.peluchitosmvp.agregar.presenter.AgregarPresenter;
import com.laugracianool.peluchitosmvp.agregar.presenter.IAgregarPresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class AgregarFragment extends Fragment implements IAgregarFragment {

    private EditText eCodigo, eNombre, eCantidad, ePrecio;
    private Button bGuardar;
    private IAgregarPresenter agregarPresenter;

    public AgregarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_agregar, container, false);
        agregarPresenter= new AgregarPresenter(this);

        eCodigo= view.findViewById(R.id.eCodigo);
        eNombre= view.findViewById(R.id.eNombre);
        eCantidad= view.findViewById(R.id.eCantidad);
        ePrecio= view.findViewById(R.id.ePrecio);
        bGuardar= view.findViewById(R.id.bGuardar);

        bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarPresenter.enviarDatosAgregar(Integer.parseInt(eCodigo.getText().toString()),
                        (eNombre.getText().toString()),
                        (Integer.parseInt(eCantidad.getText().toString())),
                        (Integer.parseInt(ePrecio.getText().toString())));

            }
        });

        return view;


    }



    @Override
    public void mostrarError(String errorMessage) {
        Toast.makeText(getContext(), errorMessage, Toast.LENGTH_SHORT).show();
    }
}
