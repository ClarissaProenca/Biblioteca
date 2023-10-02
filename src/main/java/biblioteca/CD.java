package biblioteca;

// package main.java.biblioteca;
// import java.util.Objects;

public class CD {
    private String artista, compositor, gravadora, album, ano, UPC;


    public CD() {
    }

    public CD(String artista, String compositor, String gravadora, String album, String ano, String UPC) {
        this.artista = artista;
        this.compositor = compositor;
        this.gravadora = gravadora;
        this.album = album;
        this.ano = ano;
        this.UPC = UPC;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCompositor() {
        return this.compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getGravadora() {
        return this.gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getUPC() {
        return this.UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

}
