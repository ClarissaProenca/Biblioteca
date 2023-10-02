package biblioteca;

// package main.java.biblioteca;

public class Livros {
    private String titulo;
    private String autor;
    private int ISBN;
    private String edicao;
    private int ano;
    private char prateleira;
    private String sessao;
    private int CDD;
    
    
     //__________________CONSTRUTORES__________________
    public Livros() {
        titulo = "Não informado";
        autor = "Não informado";
        ISBN = 0;
        edicao = "Não informado";
        ano = 0;
        prateleira = 'z';
        sessao = "Não informado";
        CDD = 0;
    }

    public Livros(String titulo, String autor, int ISBN, String edicao, int ano, char prateleira, String sessao, int CDD) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.edicao = edicao;
        this.ano = ano;
        this.prateleira = prateleira;
        this.sessao = sessao;
        this.CDD = CDD;
    }
   
    //__________________GET__________________
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getISBN() {
        return ISBN;
    }
    public String getEdicao() {
        return edicao;
    }
    public int getAno() {
        return ano;
    }
    public char getPrateleira() {
        return prateleira;
    }
    public String getSessao() {
        return sessao;
    }
    public int getCDD() {
        return CDD;
    }
     //__________________SET__________________
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setPrateleira(char prateleira) {
        this.prateleira = prateleira;
    }
    public void setSessao(String sessao) {
        this.sessao = sessao;
    }
    public void setCDD(int CDD) {
        this.CDD = CDD;
    }
    
    
     //__________________MÉTODOS__________________

}
