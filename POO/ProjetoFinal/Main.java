  public class Main {

      public static void main(String[] args) {
          // Criando e inicializando o array de Vídeos
          Video v[] = new Video[3];
          v[0] = new Video("Aula 1 de POO");
          v[1] = new Video("Aula 12 de PHP");
          v[2] = new Video("Aula 10 de HTML5");

          // Criando e inicializando o array de Gafanhotos (espectadores)
          Gafanhoto g[] = new Gafanhoto[2];
          g[0] = new ALuno("Jubileu", 22, "M", "juba");
          g[1] = new Aluno("Creuza", 12, "F", "creuzita");

          // Criando e inicializando o array de Visualizações
          Visualizacao vis[] = new Visualizacao[5];

          // Primeira visualização: Jubileu assiste HTML5
          vis[0] = new Visualizacao(g[0], v[2]); 
          vis[0].avaliar(); // Avaliação padrão
          System.out.println(vis[0].toString());

          // Segunda visualização: Jubileu assiste PHP
          vis[1] = new Visualizacao(g[0], v[1]);
          vis[1].avaliar(87.0f); // Avaliação por porcentagem
          System.out.println(vis[1].toString());

          /* // Bloco de código comentado na imagem original para testes
          System.out.println("VÍDEOS\n--------------------------");
          System.out.println(v[0].toString());
          System.out.println(v[1].toString());
          System.out.println(v[2].toString());
          System.out.println("\nGAFANHOTOS\n--------------------------");
          System.out.println(g[0].toString());
          System.out.println(g[1].toString());
          */
      }
  }