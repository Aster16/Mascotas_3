package com.andhire.mascotas;

/**
 * Created by andres on 25/06/2016.
 */
public class Mascota {
    private int imagen;
    private String nombre;
    private int likes;

    public Mascota(int imagen, String nombre, int likes){
        this.imagen = imagen;
        this.nombre = nombre;
        this.likes  = likes;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
