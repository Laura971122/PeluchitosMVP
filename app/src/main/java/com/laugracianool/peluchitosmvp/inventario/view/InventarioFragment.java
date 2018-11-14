package com.laugracianool.peluchitosmvp.inventario.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.laugracianool.peluchitosmvp.R;
import com.laugracianool.peluchitosmvp.inventario.presenter.IInventarioPresenter;
import com.laugracianool.peluchitosmvp.inventario.presenter.InventarioPresenter;


public class InventarioFragment extends Fragment implements IInventarioFragment {

    private TextView tInventario;
    private IInventarioPresenter inventarioPresenter;


    public InventarioFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_inventario, container, false);
        inventarioPresenter= new InventarioPresenter(this);

        tInventario= view.findViewById(R.id.tInventario);

        Bundle data = getArguments();
        tInventario.setText(data.getString("info"));

        return view;



    }

}
