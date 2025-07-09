package com.higherorlower.backend_hol.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Foto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String url;
    private Integer visitas;
    private String visitastxt;

    public Foto() {
    }

    public Foto(String nombre, String url, Integer visitas, String visitastxt) {
        this.nombre = nombre;
        this.url = url;
        this.visitas = visitas;
        this.visitastxt = visitastxt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getVisitas() {
        return visitas;
    }

    public void setVisitas(Integer visitas) {
        this.visitas = visitas;
    }

    public String getVisitastxt() {
        return visitastxt;
    }

    public void setVisitastxt(String visitastxt) {
        this.visitastxt = visitastxt;
    }

}
