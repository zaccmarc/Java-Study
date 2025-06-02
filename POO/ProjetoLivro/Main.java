package POO.ProjetoLivro;

public class Main {
    public static void main(String[] args) {

        Pessoa leitor1 = new Pessoa("Carlos Silva", 30, "M");
        Pessoa leitor2 = new Pessoa("Ana Pereira", 25, "F");

        System.out.println("Criando livros...");
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200, leitor1);
        Livro livro2 = new Livro("Cosmos", "Carl Sagan", -50, null); // Testando totPaginas negativo e leitor null
        Livro livro3 = new Livro("Guia do Mochileiro", "Douglas Adams", 0, leitor2); // Livro com 0 páginas

        livro1.detalhes();
        // livro2.detalhes(); // Deve mostrar alerta de páginas e "Nenhum leitor"
        livro3.detalhes();

        System.out.println("\n--- Ações com Livro 1: " + livro1.getTitulo() + " - ");
        livro1.abrir();
        livro1.abrir(); // Tentar abrir de novo
        livro1.folhear(100);
        livro1.avancarPag();
        livro1.avancarPag();
        livro1.detalhes();

        livro1.folhear(1200); // Ir para a última página
        livro1.avancarPag(); // Tentar avançar além da última
        livro1.detalhes();

        livro1.folhear(0); // Ir para a primeira página
        livro1.voltarPag(); // Tentar voltar antes da primeira
        livro1.detalhes();

        livro1.folhear(1500); // Tentar folhear para página inexistente
        livro1.folhear(-10); // Tentar folhear para página negativa
        livro1.detalhes();

        livro1.fechar();
        livro1.fechar(); // Tentar fechar de novo
        livro1.avancarPag(); // Tentar avançar com livro fechado
        livro1.folhear(50); // Tentar folhear com livro fechado
        livro1.detalhes();

        System.out.println(
                "\n--- Ações com Livro 2: " + livro2.getTitulo() + "                         (após correções) ---");
        livro2.setLeitor(leitor2);
        livro2.setTotPaginas(350); // Corrigindo total de páginas
        livro2.detalhes();
        livro2.abrir();
        livro2.folhear(50);
        livro2.detalhes();
        leitor2.fazerAniversario();
        livro2.detalhes(); // Para ver a idade atualizada do leitor

        System.out.println("\n--- Testando setPagAtual diretamente no Livro 1 ---");
        livro1.abrir(); // Garante que está aberto
        livro1.setPagAtual(500);
        livro1.detalhes();
        livro1.setPagAtual(2000); // Página inválida
        livro1.detalhes();
        livro1.fechar();
        livro1.setPagAtual(10); // Livro fechado, não deve alterar
        livro1.detalhes();

        System.out.println("\n--- Ações com Livro 3: " + livro3.getTitulo() + " (0                     páginas) ---");
        livro3.detalhes();
        livro3.abrir();
        livro3.folhear(0); // Única página válida
        livro3.avancarPag(); // Não deve avançar
        livro3.voltarPag(); // Não deve voltar
        livro3.folhear(1); // Inválido
        livro3.detalhes();
        livro3.fechar();

    }
}
