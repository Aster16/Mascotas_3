package com.andhire.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    public RecyclerView recyclerView;
    ArrayList<Mascota> mascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);
        Toolbar actionBar = (Toolbar) findViewById(R.id.Actionbar);
        setSupportActionBar(actionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        actionBar.setTitleTextColor(getResources().getColor(R.color.Fondo));

        recyclerView= (RecyclerView) findViewById(R.id.RecyclerViewMascotasFav);

        LinearLayoutManager li = new LinearLayoutManager(this);
        li.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(li);
        CrearMascotas();
        IniciarAdaptador();





    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        menu.removeItem(R.id.Favorite);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){ //funcionamiento de la barra
        switch (item.getItemId()){
            case R.id.pet:
                recyclerView.smoothScrollToPosition(0);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }




    public void IniciarAdaptador(){
        AdaptadorMascota adaptadorMascota = new AdaptadorMascota(mascotas,this);
        recyclerView.setAdapter(adaptadorMascota);
    }


    public void CrearMascotas(){
        mascotas = new ArrayList<>();

        mascotas.add(new Mascota(R.drawable.pitbull,"Pit",100));
        mascotas.add(new Mascota(R.drawable.pet5,"Paco",50));
        mascotas.add(new Mascota(R.drawable.pet3,"Catty",700));
        mascotas.add(new Mascota(R.drawable.pet2,"Fred",200));
        mascotas.add(new Mascota(R.drawable.pet4,"Blossom",200));
    }


}





