package com.example.davidperalvogomez.listafutbol;

import java.io.Serializable;

/**
 * Created by DavidPeralvoGomez on 11/3/16.
 */
public class Equipo implements Serializable {
    private String nombre;
    private String historia;
    private String descripcion;
    private int imagen;


    public Equipo(int imagen,String nombre,String descripcion, String historia){
        setImagen(imagen);
        setNombre(nombre);
        setDescripcion(descripcion);
        setHistoria(historia);

    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getHistoria() {
        return this.historia;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public int getImagen() {
        return this.imagen;
    }

}
