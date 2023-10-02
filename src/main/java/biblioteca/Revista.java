package biblioteca;

// package main.java.biblioteca;
public class Revista extends Livros{
    public int ISSN;
    
    public Revista(){}

    public Revista(String titulo, String autor, int ISBN, String edicao, int ano, char prateleira, String sessao, int CDD, int ISSN) {
        super(titulo, autor, ISBN, edicao, ano, prateleira, sessao, CDD);
        this.ISSN = ISSN;
    }

    public int getISSN() {
        return ISSN;
    }

    public void setISSN(int ISSN) {
        this.ISSN = ISSN;
    }
    
}
