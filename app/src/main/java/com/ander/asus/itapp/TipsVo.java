package com.ander.asus.itapp;

public class TipsVo {
    private String titulo;
    private String descripciuon;
    private int imagen;

    public TipsVo(String titulo, String descripciuon, int imagen) {
        this.titulo = titulo;
        this.descripciuon = descripciuon;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripciuon() {
        return descripciuon;
    }

    public void setDescripciuon(String descripciuon) {
        this.descripciuon = descripciuon;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
