package biblioteca;

// package main.java.biblioteca;

public class Artigo {
    private String DOI, chave, tema, autor, ano, instituto;

    public Artigo(){
        DOI = "Não informado";
        chave = "Não informado";
        tema = "Não informado";
        autor = "Não informado";
        ano = "1900";
        instituto = "Não informado";
    }

    public Artigo(String DOI, String chave, String tema, String autor, String ano, String instituto) {
        this.DOI = DOI;
        this.chave = chave;
        this.tema = tema;
        this.autor = autor;
        this.ano = ano;
        this.instituto = instituto;
    }


    public String getDOI() {
        return this.DOI;
    }

    public void setDOI(String DOI) {
        this.DOI = DOI;
    }

    public String getChave() {
        return this.chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getTema() {
        return this.tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getInstituto() {
        return this.instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }


}
