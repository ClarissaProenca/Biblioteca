package biblioteca;

public class DVD {
    private String nome, regiao, distribuidora, duracao, sinopse, bonus, ano, genero, UPC;


    public DVD() {
    }

    public DVD(String nome, String regiao, String distribuidora, String duracao, String sinopse, String bonus, String ano, String genero, String UPC) {
        this.nome = nome;
        this.regiao = regiao;
        this.distribuidora = distribuidora;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.bonus = bonus;
        this.ano = ano;
        this.genero = genero;
        this.UPC = UPC;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return this.regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getDistribuidora() {
        return this.distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getDuracao() {
        return this.duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getSinopse() {
        return this.sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getBonus() {
        return this.bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUPC() {
        return this.UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

}
