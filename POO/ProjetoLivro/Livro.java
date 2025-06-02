package POO.ProjetoLivro;

// Classe Livro corrigida
public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    // Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de Páginas: " + totPaginas);
        System.out.println("Página Atual: " + pagAtual);
        System.out.println("Aberto: " + aberto);
        System.out.println("Leitor: " + leitor.getNome());
    }

    // Métodos da interface Publicacao

    @Override

    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual = 0;
            System.out.println("Página inválida. Folheando para a página 0.");
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        if (this.aberto && this.pagAtual < this.totPaginas) {
            this.pagAtual++;
        } else {
            System.out.println("Não é possível avançar a página.");
        }
    }

    @Override
    public void voltarPag() {
        if (this.aberto && this.pagAtual > 0) {
            this.pagAtual--;
        } else {
            System.out.println("Não é possível voltar a página.");
        }
    }
}
