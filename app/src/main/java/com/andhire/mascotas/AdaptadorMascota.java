package com.andhire.mascotas;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by andres on 25/06/2016.
 */
public class AdaptadorMascota extends RecyclerView.Adapter<AdaptadorMascota.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;
    Activity activity;
    public AdaptadorMascota(ArrayList<Mascota> mascotas , Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_mascotas_favoritas,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder MascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        MascotaViewHolder.fotopet.setImageResource(mascota.getImagen());
        MascotaViewHolder.nombrePet.setText(mascota.getNombre().toString());
        MascotaViewHolder.numeroLikes.setText(String.valueOf(mascota.getLikes()));
        MascotaViewHolder.imagenHueso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int likes = mascota.getLikes()+1;
                mascota.setLikes(likes);
                MascotaViewHolder.numeroLikes.setText(String.valueOf(likes));
                MascotaViewHolder.imagenHueso.setEnabled(false);
            }
        });



    }

    @Override
    public int getItemCount() {

        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        private  ImageView fotopet;
        private  ImageButton imagenHueso;
        private  TextView nombrePet;
        private  TextView numeroLikes;
        public MascotaViewHolder(View itemView) {
            super(itemView);

            fotopet           = (ImageView) itemView.findViewById(R.id.ImagenMascota);
            imagenHueso       = (ImageButton) itemView.findViewById(R.id.huesoblanco);
            nombrePet         = (TextView) itemView.findViewById(R.id.NombreMascota);
            numeroLikes       = (TextView) itemView.findViewById(R.id.NumerodeLikes);


        }
    }
}
