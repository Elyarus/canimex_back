package com.canimex;

public class Anime {
    private int idAnime; // ID autoincremental del anime (int)
    private String titulo;
    private String genero;
    private String duracion;
    private String imagen;
    
    // constructor vacio necesario para deserializacion de JSON

    public Anime() {}

    public Anime(int idAnime, String titulo, String genero, String duracion, String imagen) {
        this.idAnime = idAnime;
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.imagen = imagen;
    }

    // metodo getter para obtener el id de los animes
    public int getIdAnime() {
        return idAnime;
    }

    // metodo setter para establecer el id del anime
    public void setIdAnime(int idAnime) {
        this.idAnime = idAnime;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}