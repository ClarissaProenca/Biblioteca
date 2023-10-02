package biblioteca;

import java.io.*;
import java.util.Scanner;

public class Main implements ILivros {

    //@Override
    public void cadastrar(String titulo, String autor, String edicao, String sessao, int ISBN, int ano, int CDD, int ISSN, char prateleira) {
    }

    static Scanner entrada = new Scanner(System.in);
    static Livros[] livro = new Livros[1000];
    static Revista[] revista = new Revista[1000];
    static Artigo[] artigo = new Artigo[1000];
    static CD[] cd = new CD[1000];
    static DVD[] dvd = new DVD[1000];
    static int opcao;
    static int i = 0, r = 0, a = 0, c = 0, d = 0;
    
    public static int Menu() {
        System.out.println("O que deseja fazer?");
        try{
            System.out.println(" 1 - Cadastrar livro, revista, artigos, cds e dvds \n "
                    + "2 - Buscar itens \n "
                    + "3 - Listar livros, revistas, artigos, cds e dvds disponíveis \n "
                    + "4 - Ver espaço disponível \n "
                    + "5 - Excluir elementos  \n "
                    + "6 - Ordenar os livros cadastrados \n "
                    + "7 - Encerrar programa");
            opcao = entrada.nextInt();
        } catch(java.util.InputMismatchException e){
            System.out.println("Por favor entre com um número inteiro. \nErro" + e);
        } catch (Throwable e){
            System.out.println("Erro: " + e);
        }
        
        return opcao;
    }

    // ------------Cadastro---------------
   public static void Cadastro() {
        System.out.println("Cadastro");
        System.out.println("1- Cadastro de livro \n2- Cadastro de revistas \n3- Cadastro de artigo \n4- Cadastro de CD \n5- Cadastro de DVD");
        int cadastro = entrada.nextInt();

        if (cadastro == 1) {
            cadastrarLivro();
        } else if (cadastro == 2) {
            cadastrarRevista();
        } else if(cadastro == 3){
            cadastrarArtigo();
        } else if(cadastro == 4){
            cadastrarCD();
        } else if(cadastro == 5){
            cadastrarDVD();
        } else{
            System.out.println("Opção inválida");
        }
    }

    public static void cadastrarLivro() {
        System.out.println("Informe o título do livro: ");
        String titulo = entrada.next();
        System.out.println("Informe o autor do livro: ");
        String autor = entrada.next();
        System.out.println("Informe o ISBN do livro: ");
        int ISBN = entrada.nextInt();
        System.out.println("Informe a edição do livro: ");
        String edicao = entrada.next();
        System.out.println("Informe o ano de publicação do livro: ");
        int ano = entrada.nextInt();
        System.out.println("Informe a prateleira onde deseja guardar o livro: ");
        char prateleira = entrada.next().charAt(0);
        System.out.println("Informe a sessão do livro: ");
        String sessao = entrada.next();
        System.out.println("Informe o CDD do livro: ");
        int CDD = entrada.nextInt();
        livro[i] = new Livros(titulo, autor, ISBN, edicao, ano, prateleira, sessao, CDD);
        i++;
    }

    public static void cadastrarRevista() {
        System.out.println("Informe o título da revista: ");
        String titulo = entrada.next();
        System.out.println("Informe o autor da revista: ");
        String autor = entrada.next();
        int ISBN = 0;
        System.out.println("Informe a edição da revista: ");
        String edicao = entrada.next();
        System.out.println("Informe o ano de publicação dda revista: ");
        int ano = entrada.nextInt();
        System.out.println("Informe a prateleira onde deseja guardar a revista: ");
        char prateleira = entrada.next().charAt(0);
        System.out.println("Informe a sessão da revista: ");
        String sessao = entrada.next();
        System.out.println("Informe o CDD da revista: ");
        int CDD = entrada.nextInt();
        System.out.println("Informe o ISSN da revista: ");
        int ISSN = entrada.nextInt();
        revista[r] = new Revista(titulo, autor, ISBN, edicao, ano, prateleira, sessao, CDD, ISSN);
        r++;
    }
    
    public static void cadastrarArtigo(){
        System.out.println("Informe o DOI do artigo: ");
        String DOI = entrada.next();
        System.out.println("Informe a chave do artigo: ");
        String chave = entrada.next();
        System.out.println("Informe o tema do artigo: ");
        String tema = entrada.next();
        System.out.println("Informe o autor do artigo: ");
        String autor = entrada.next();
        System.out.println("Informe o ano do artigo: ");
        String ano = entrada.next();
        System.out.println("Informe o instituto do artigo: ");
        String instituto = entrada.next();
        artigo[a] = new Artigo(DOI, chave, tema, autor, ano, instituto);
        a++;
    }

    public static void cadastrarCD(){
        System.out.println("Informe o artista do CD: ");
        String artista = entrada.next();
        System.out.println("Informe o/a compositor(a) do CD: ");
        String compositor = entrada.next();
        System.out.println("Informe a gravadora do CD: ");
        String gravadora = entrada.next();
        System.out.println("Informe o album do CD: ");
        String album = entrada.next();
        System.out.println("Informe o ano do CD: ");
        String ano = entrada.next();
        System.out.println("Informe a UPC do CD: ");
        String UPC = entrada.next();
        cd[c] = new CD(artista, compositor, gravadora, album, ano, UPC);
        c++;
    }

    public static void cadastrarDVD(){
        System.out.println("Informe o nome do DVD: ");
        String nome = entrada.next();
        System.out.println("Informe a região do DVD: ");
        String regiao = entrada.next();
        System.out.println("Informe a distribuidora do DVD: ");
        String distribuidora = entrada.next();
        System.out.println("Informe a duração do DVD: ");
        String duracao = entrada.next();
        System.out.println("Informe a sinopse do DVD: ");
        String sinopse = entrada.next();
        System.out.println("Informe o bonus do DVD: ");
        String bonus = entrada.next();
        System.out.println("Informe o ano do DVD: ");
        String ano = entrada.next();
        System.out.println("Informe o gênero do DVD: ");
        String genero = entrada.next();
        System.out.println("Informe a UPC do DVD: ");
        String UPC = entrada.next();
        dvd[c] = new DVD(nome, regiao, distribuidora, duracao, sinopse, bonus, ano, genero, UPC);
        c++;
    }
    //------------ToString, mas sem ser ToString---------------------
    
    public static void MostrarLivros(Livros[] livro, int l) {
 
            System.out.println("Livro: " + (l+1));
            System.out.println("Titulo: " + livro[l].getTitulo()
                    + "\nAutor: " + livro[l].getAutor()
                    + "\nISBN: " + livro[l].getISBN()
                    + "\nEdição: " + livro[l].getEdicao()
                    + "\nAno de publicação: " + livro[l].getAno()
                    + "\nPrateleira: " + livro[l].getPrateleira()
                    + "\nSessão: " + livro[l].getSessao()
                    + "\nCDD: " + livro[l].getCDD());
            System.out.println("===========================");
        }

    public static void MostrarRevistas(Revista[] revista, int k) {
        System.out.println("Revista: " + (k + 1));
        System.out.println("Titulo: " + revista[k].getTitulo()
            + "\nAutor: " + revista[k].getAutor()
            + "\nEdição: " + revista[k].getEdicao()
            + "\nAno de publicação: " + revista[k].getAno()
            + "\nPrateleira: " + revista[k].getPrateleira()
            + "\nSessão: " + revista[k].getSessao()
            + "\nCDD: " + revista[k].getCDD()
            + "ISSN: " + revista[k].getISSN());
        System.out.println("===========================");
    }

    public static void MostrarArtigos(Artigo[] artigo, int k) {
        System.out.println("Artigos: " + (k + 1));
        System.out.println("DOI: " + artigo[k].getDOI()
            + "\nChave: " + artigo[k].getTema()
            + "\nTema: " + artigo[k].getTema()
            + "\nAutor: " + artigo[k].getAutor()
            + "\nAno de publicação: " + artigo[k].getAno()
            + "\nInstituto: " + artigo[k].getInstituto());
        System.out.println("===========================");
    }

    public static void MostrarCDs(CD[] cd, int k) {
        System.out.println("Artigos: " + (k + 1));
        System.out.println("Artista: " + cd[k].getArtista()
            + "\nCompositor: " + cd[k].getCompositor()
            + "\nGravadora: " + cd[k].getGravadora()
            + "\nAlbum: " + cd[k].getAlbum()
            + "\nAno de publicação: " + cd[k].getAno()
            + "\nUPC: " + cd[k].getUPC());
        System.out.println("===========================");
    }

    public static void MostrarDVDs(DVD[] dvd, int k) {
        System.out.println("Artigos: " + (k + 1));
        //nome, regiao, distribuidora, duracao, sinopse, bonus, ano, genero, UPC
        System.out.println("Nome: " + dvd[k].getNome()
            + "\nRegião: " + dvd[k].getRegiao()
            + "\nDistribuidora: " + dvd[k].getDistribuidora()
            + "\nDuração: " + dvd[k].getDuracao()
            + "\nSinopse: " + dvd[k].getSinopse()
            + "\nBonus: " + dvd[k].getBonus()
            + "\nAno de publicação: " + dvd[k].getAno()
            + "\nGênero: " + dvd[k].getGenero()
            + "\nUPC: " + dvd[k].getUPC());
        System.out.println("===========================");
    }
    
    public static void MostraCadastro() {
        System.out.println("Arquivos cadastrados: ");
          if (i != 0) {
          System.out.println("Livros cadastrados");
          for (int k = 0; k < i; k++) {
            MostrarLivros(livro, k);
          }
        }

        if (r != 0) {
          System.out.println("Revistas cadastradas");
          for (int k = 0; k < r; k++) {
            MostrarRevistas(revista, k);
          }
        }

        if(a != 0){
            System.out.println("Artigos cadastrados");
            for (int k = 0; k < r; k++) {
                MostrarArtigos(artigo, k);
                }
        }

        if(c != 0) {
            System.out.println("CDs cadastrados");
            for(int k = 0; k < r; k++){
                MostrarCDs(cd, k);
            }
        }

        if(d != 0){
            System.out.println("DVDs cadastrados");
            for(int k = 0; k < r; k++){
                MostrarDVDs(dvd, k);
            }
        }
    }
    
    //---------------Procura-------------------

    public static void procurarItens() {
        System.out.println("Busca");

        System.out.println("O que deseja encontrar? ");
        String busca = entrada.next();

        for (int l = 0; l < i; l++) {
            if (livro[l].getTitulo().toLowerCase().indexOf(busca.toLowerCase()) >= 0
                    || livro[l].getAutor().toLowerCase().indexOf(busca.toLowerCase()) >= 0) {
                MostrarLivros(livro, l);
            }
        }
        for (int l = 0; l < r; l++) {
            if (revista[l].getTitulo().toLowerCase().indexOf(busca.toLowerCase()) >= 0
                    || revista[l].getAutor().toLowerCase().indexOf(busca.toLowerCase()) >= 0) {
                MostrarRevistas(revista, l);
            }
        }
        for (int l = 0; l < i; l++) {
            if (artigo[l].getChave().toLowerCase().indexOf(busca.toLowerCase()) >= 0
                    || artigo[l].getAutor().toLowerCase().indexOf(busca.toLowerCase()) >= 0) {
                MostrarArtigos(artigo, l);
            }
        }
        for (int l = 0; l < r; l++) {
            if (cd[l].getArtista().toLowerCase().indexOf(busca.toLowerCase()) >= 0
                    || cd[l].getAlbum().toLowerCase().indexOf(busca.toLowerCase()) >= 0) {
                MostrarCDs(cd, l);
            }
        }
        for (int l = 0; l < i; l++) {
            if (dvd[l].getNome().toLowerCase().indexOf(busca.toLowerCase()) >= 0
                    || dvd[l].getGenero().toLowerCase().indexOf(busca.toLowerCase()) >= 0) {
                MostrarDVDs(dvd, l);
            }
        }
    }
    
    public static void EspacoDisponivel() {
        System.out.println("Espaço usado para cadastro de livros: " + i);
        System.out.println("Espaço livre para cadastro de livros: " + (1000 - i));
        System.out.println("======================================");
        System.out.println("Espaço usado para cadastro de revistas: " + r);
        System.out.println("Espaço livre para cadastro de revistas: " + (1000 - r));
        System.out.println("======================================");
        System.out.println("Espaço usado para cadastro de artigos: " + a);
        System.out.println("Espaço livre para cadastro de artigos: " + (1000 - a));
        System.out.println("======================================");
        System.out.println("Espaço usado para cadastro de cds: " + c);
        System.out.println("Espaço livre para cadastro de cds: " + (1000 - c));
        System.out.println("======================================");
        System.out.println("Espaço usado para cadastro de dvds: " + d);
        System.out.println("Espaço livre para cadastro de dvds: " + (1000 - d));
    }
    
    //-------------------Exclui-------------------------
    
    public static void ExcluirLivro(int exclusao){
        System.out.println("Livros cadastrados");
        for (int k = 0; k < i; k++) {
            MostrarLivros(livro, k);
        }
        if (exclusao <= i && exclusao <= 1) {
            System.out.println("Qual livro deseja excluir? ");
            i--;
//                                for(int k=-1; k<=i; k++){
//                                    livro[k] = livro[k+1];
//                                }
//                                livro[k+1] = null;
            exclusao = entrada.nextInt();
            livro[exclusao - 1] = null;
            Livros temp = livro[i - 1];
            for (int a = 1; a <= i; a++) {
                livro[a] = livro[a + 1];
            }
            livro[0] = temp;
            System.out.println("Livro excluído com sucesso!");
            System.out.println("======================================");
        } else {
            System.out.println("Não há itens cadastrados");
        }
    }
    
    public static void ExcluirRevista(int exclusao) {
        System.out.println("Revistas cadastradas");
        for (int k = 0; k < r; k++) {
            MostrarRevistas(revista, k);
        }
        if (exclusao <= r && exclusao <= 1) {
            System.out.println("Qual revista deseja excluir? ");
            r--;
            exclusao = entrada.nextInt();
            revista[exclusao - 1] = null;
            Revista temp = revista[r - 1];
            for (int a = 1; a <= r; a++) {
                revista[a] = revista[a + 1];
            }
            revista[0] = temp;
            System.out.println("Revista excluída com sucesso!");
        } else {
            System.out.println("Não há itens cadastrados");
        }
    }

    public static void ExcluirArtigo(int exclusao) {
        System.out.println("Artigos cadastrados");
        for (int k = 0; k < r; k++) {
            MostrarArtigos(artigo, k);
        }
        if (exclusao <= a && exclusao <= 1) {
            System.out.println("Qual artigo deseja excluir? ");
            a--;
            exclusao = entrada.nextInt();
            artigo[exclusao - 1] = null;
            Artigo temp = artigo[a - 1];
            for (int i = 1; i <= r; i++) {
                artigo[a] = artigo[a + 1];
            }
            artigo[0] = temp;
            System.out.println("Artigo excluído com sucesso!");
        } else {
            System.out.println("Não há itens cadastrados");
        }
    }
    
    public static void ExcluirCD(int exclusao) {
        System.out.println("CDs cadastrados");
        for (int k = 0; k < r; k++) {
            MostrarCDs(cd, k);
        }
        if (exclusao <= c && exclusao <= 1) {
            System.out.println("Qual cd deseja excluir? ");
            c--;
            exclusao = entrada.nextInt();
            cd[exclusao - 1] = null;
            CD temp = cd[c - 1];
            for (int i = 1; i <= r; i++) {
                cd[c] = cd[c + 1];
            }
            cd[0] = temp;
            System.out.println("CD excluído com sucesso!");
        } else {
            System.out.println("Não há itens cadastrados");
        }
    }

    public static void ExcluirDVD(int exclusao) {
        System.out.println("DVDs cadastrados");
        for (int k = 0; k < r; k++) {
            MostrarCDs(cd, k);
        }
        if (exclusao <= d && exclusao <= 1) {
            System.out.println("Qual dvd deseja excluir? ");
            d--;
            exclusao = entrada.nextInt();
            dvd[exclusao - 1] = null;
            DVD temp = dvd[d - 1];
            for (int i = 1; i <= r; i++) {
                dvd[d] = dvd[d + 1];
            }
            dvd[0] = temp;
            System.out.println("DVD excluído com sucesso!");
        } else {
            System.out.println("Não há itens cadastrados");
        }
    }
    
    public static void Exclusao() {
        System.out.println("Excluir: \n 1 - Livro \n 2 - Revista \n 3 - Artigo \n 4 - CD \n 5 - DVD");
        int exclusao = entrada.nextInt();
        if (exclusao == 1) {
            ExcluirLivro(exclusao);
            System.out.println("Livros cadastrados");
            for (int k = 0; k < i; k++) {
                MostrarLivros(livro, k);
            }
        } else if (exclusao == 2) {
            ExcluirRevista(exclusao);
            System.out.println("Revistas cadastradas");
            for (int k = 0; k < i; k++) {
                MostrarRevistas(revista, k);
            }
        } else if (exclusao == 3){
            ExcluirArtigo(exclusao);
            System.out.println("Artigos cadastrados");
            for (int k = 0; k < i; k++) {
                MostrarArtigos(artigo, k);
            }
        } else if(exclusao == 4){
            ExcluirCD(exclusao);
            System.out.println("CDs cadastrados");
            for (int k = 0; k < i; k++) {
                MostrarCDs(cd, k);
            }
        } else if(exclusao == 5){
            ExcluirDVD(exclusao);
            System.out.println("DVDs cadastrados");
            for (int k = 0; k < i; k++) {
                MostrarDVDs(dvd, k);
            }
        }
    }
       
    //-------------Ordena-------------
    //TODO ordenar artigos, cds, dvds
    public static void Ordenar() {
        System.out.println("Ordenar");
        System.out.println("Ordenar itens: \n 1 - Livro \n 2 - Revista");
        int ordenar = entrada.nextInt();
        if (ordenar == 1) {
            for (int k = 0; k < (i - 1); k++) {
                for (int z = 0; z < (i - 1); z++) {
                    Livros aux = new Livros();
                    Livros aux1 = new Livros();
                    aux = livro[z];
                    aux1 = livro[z + 1];
                    if (aux.getTitulo().toLowerCase().compareTo(aux1.getTitulo().toLowerCase()) > 0) {
                        livro[z] = aux1;
                        livro[z + 1] = aux;
                    }
                }
            }
        } else {
            for (int k = 0; k < (i - 1); k++) {
                for (int z = 0; z < (i - 1); z++) {
                    Revista aux = new Revista();
                    Revista aux1 = new Revista();
                    aux = revista[z];
                    aux1 = revista[z + 1];
                    if (aux.getTitulo().toLowerCase().compareTo(aux1.getTitulo().toLowerCase()) > 0) {
                        revista[z] = aux1;
                        revista[z + 1] = aux;
                    }
                }
            }
        }
    }
    
    //---------------Persistencia depois do encerramento-----------------------------
    
    public static void SalvarArquivo() throws IOException{
        FileWriter arquivoLivro = new FileWriter(new File("D:\\documentos\\Faculdade\\Infnet\\segundoBloco\\Java\\biblioteca\\src\\main\\resources","livros.txt"), true);
        for(int k = 0; k <i; k++){
            arquivoLivro.write(livro[k].getTitulo() + ";"
                    +livro[k].getAutor() + ";"
                    +livro[k].getEdicao() + ";"
                    +livro[k].getSessao() + ";"
                    +livro[k].getISBN() + ";"
                    +livro[k].getAno() + ";"
                    +livro[k].getCDD() + ";"
                    +livro[k].getPrateleira() + "\n");
            arquivoLivro.close();
        }
        FileWriter arquivoRevista = new FileWriter(new File("D:\\documentos\\Faculdade\\Infnet\\segundoBloco\\Java\\biblioteca\\src\\main\\resources","revistas.txt"), true);
        for(int k = 0; k <i; k++){
            arquivoRevista.write(livro[k].getTitulo() + ";"
                    +revista[k].getAutor() + ";"
                    +revista[k].getEdicao() + ";"
                    +revista[k].getSessao() + ";"
                    +revista[k].getAno() + ";"
                    +revista[k].getCDD() + ";"
                    +revista[k].getPrateleira() + 
                    +revista[k].getISSN()+"\n");
            arquivoRevista.close();
        }
        FileWriter arquivoArtigo = new FileWriter(new File("D:\\documentos\\Faculdade\\Infnet\\segundoBloco\\Java\\biblioteca\\src\\main\\resources","artigos.txt"), true);
        for(int k = 0; k <i; k++){
            //DOI, chave, tema, autor, ano, instituto
            arquivoArtigo.write(artigo[k].getDOI() + ";"
                    +artigo[k].getChave() + ";"
                    +artigo[k].getTema() + ";"
                    +artigo[k].getAutor() + ";"
                    +artigo[k].getAno() + ";"
                    +artigo[k].getInstituto() + "\n");
            arquivoArtigo.close();
        }
        FileWriter arquivoCD = new FileWriter(new File("D:\\documentos\\Faculdade\\Infnet\\segundoBloco\\Java\\biblioteca\\src\\main\\resources","cds.txt"), true);
        for(int k = 0; k <i; k++){
            //artista, compositor, gravadora, album, ano, UPC
            arquivoCD.write(cd[k].getArtista() + ";"
                    +cd[k].getCompositor() + ";"
                    +cd[k].getGravadora() + ";"
                    +cd[k].getAlbum() + ";"
                    +cd[k].getAno() + ";"
                    +cd[k].getUPC() + "\n");
            arquivoCD.close();
        }
        FileWriter arquivoDVD = new FileWriter(new File("D:\\documentos\\Faculdade\\Infnet\\segundoBloco\\Java\\biblioteca\\src\\main\\resources","dvds.txt"), true);
        for(int k = 0; k <i; k++){
            //nome, regiao, distribuidora, duracao, sinopse, bonus, ano, genero, UPC
            arquivoDVD.write(dvd[k].getNome() + ";"
                    +dvd[k].getRegiao() + ";"
                    +dvd[k].getDistribuidora() + ";"
                    +dvd[k].getDuracao() + ";"
                    +dvd[k].getSinopse() + ";"
                    +dvd[k].getBonus() + ";"
                    +dvd[k].getAno() + ";"
                    +dvd[k].getGenero() + ";"
                    +dvd[k].getUPC() + "\n");
            arquivoDVD.close();
        }
    }
    
    //TODO persistencia artigo, cd, dvd
    public static void CarregaArquivo() throws IOException{
        try{
            String str;
            BufferedReader readerLivro, readerRevista;
            
            readerLivro = new BufferedReader(new FileReader(new File("livros.txt")));
            while((str = readerLivro.readLine()) != null){
                String[] livroArquivo = str.split(";");
                String titulo = livroArquivo[0];
                String autor = livroArquivo[1];
                int ISBN = Integer.parseInt(livroArquivo[2]);
                 String edicao = livroArquivo[3];
                int ano = Integer.parseInt(livroArquivo[4]);
                 char prateleira = livroArquivo[5].charAt(0);
                String sessao = livroArquivo[6];
               int CDD = Integer.parseInt(livroArquivo[7]);
               livro[i] = new Livros(titulo, autor, ISBN, edicao, ano, prateleira, sessao, CDD);
          i++;
            }
            readerLivro.close();
            
            readerRevista = new BufferedReader(new FileReader(new File("revistas.txt")));
            while((str = readerRevista.readLine()) != null){
                String[] revistaArquivo = str.split(";");
                String titulo = revistaArquivo[0];
                String autor = revistaArquivo[1];
                int ISBN = 0;
                 String edicao = revistaArquivo[3];
                int ano = Integer.parseInt(revistaArquivo[4]);
                 char prateleira = revistaArquivo[5].charAt(0);
                String sessao = revistaArquivo[6];
               int CDD = Integer.parseInt(revistaArquivo[7]);
               int ISSN = Integer.parseInt(revistaArquivo[8]);
               revista[r] = new Revista(titulo, autor, ISBN,edicao, ano, prateleira, sessao, CDD, ISSN);
                r++;
            }
            readerLivro.close();
        } catch(Exception e){
            System.out.println("Erro: " + e);
        }
//        String linha;
//        FileReader arq = new FileReader("livros.txt");
//        BufferedReader lerArq = new BufferedReader(arq);
//        while ((linha = lerArq.readLine()) != null) {
//            System.out.printf("%s\n", linha);
//            String[] livroArquivo = linha.split(";");
////            for(int a = 0; a < 8; a++){
////            System.out.println(livroArquivo[a]);
////            }
//            
//           String titulo = livroArquivo[0];
//           String autor = livroArquivo[1];
//           int ISBN = Integer.parseInt(livroArquivo[2]);
//            String edicao = livroArquivo[3];
//           int ano = Integer.parseInt(livroArquivo[4]);
//            char prateleira = livroArquivo[5].charAt(0);
//           String sessao = livroArquivo[6];
//          int CDD = Integer.parseInt(livroArquivo[7]);
//          livro[i] = new Livros(titulo, autor, ISBN, edicao, ano, prateleira, sessao, CDD);
//          i++;
////          for(int a = 0; a < livroArquivo.length; a++){
////               livroArquivo[a] = livro[i];
////      }
//      }
//        lerArq.close();
//        arq.close();
    }
    
    //----------------Main------------------

    public static void main(String[] args) throws IOException {
        CarregaArquivo();
        do {
            Menu();
            switch (opcao) {
                case 1:
                    Cadastro();
                    break;
                case 2:
                    procurarItens();
                    break;
                case 3:
                    MostraCadastro();
                    break;
                case 4:
                    EspacoDisponivel();
                    break;
                case 5:
                    Exclusao();
                    break;
                case 6:
                    Ordenar();
                    break;
            }
        } while (opcao != 7);
        
        SalvarArquivo();
        System.out.println("Volte Sempre!");
    }
}
