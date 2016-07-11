package com.andhire.mascotas;

import com.andhire.mascotas.*;

import java.util.ArrayList;

/**
 * Created by inavid on 07/07/16.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascotas> contactos);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);

}
