package com.andhire.mascotas;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


     public RecyclerView recyclerView;

    public ArrayList<Mascota> mascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar actionBar = (Toolbar) findViewById(R.id.Actionbar);
        setSupportActionBar(actionBar);
        actionBar.setTitleTextColor(getResources().getColor(R.color.Fondo));

         recyclerView= (RecyclerView) findViewById(R.id.RecyclerView);

        LinearLayoutManager li = new LinearLayoutManager(this);
        li.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(li);

        CrearMascotas();
        IniciarAdaptador();








    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){ //funcionamiento de la barra
        switch (item.getItemId()){
            case R.id.pet:
                recyclerView.smoothScrollToPosition(0);
                return true;
            case R.id.Favorite:
                Intent intent = new Intent(MainActivity.this,MascotasFavoritas.class);
                startActivity(intent);

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
        mascotas.add(new Mascota(R.drawable.pet2,"Fred",10));
        mascotas.add(new Mascota(R.drawable.pet3,"Catty",50));
        mascotas.add(new Mascota(R.drawable.pet4,"Blossom",700));
        mascotas.add(new Mascota(R.drawable.pet5,"Paco",200));
        mascotas.add(new Mascota(R.drawable.pitbull,"Pit",80));
        mascotas.add(new Mascota(R.drawable.pet4,"Blossom",200));
    }


}







