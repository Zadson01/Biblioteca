package biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BibliotecaPessoal biblioteca = new BibliotecaPessoal();
        Scanner leia = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Remover Livro");
            System.out.println("4. Quantidade de Livros");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = leia.nextInt();
            leia.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("ID do Livro: ");
                    int idLivro = leia.nextInt();
                    leia.nextLine();
                    
                    System.out.print("Título: ");
                    String titulo = leia.nextLine();
                    
                    System.out.print("Autor: ");
                    String autor = leia.nextLine();
                    
                    System.out.print("Ano: ");
                    int ano = leia.nextInt();
                    leia.nextLine();
                    
                    System.out.print("Gênero: ");
                    String genero = leia.nextLine();
                    
                    System.out.print("Editora: ");
                    String editora = leia.nextLine();
                    
                    System.out.print("Páginas: ");
                    int paginas = leia.nextInt();
                    leia.nextLine();

                    Livro novoLivro = new Livro(idLivro, titulo, autor, ano, genero, editora, paginas);
                    biblioteca.adicionarLivro(novoLivro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    biblioteca.listarLivros();
                    break;

                case 3:
                    System.out.print("Informe o ID do livro que deseja remover: ");
                    int idRemover = leia.nextInt();
                    leia.nextLine();
                    biblioteca.removerLivro(idRemover);
                    break;

                case 4:
                    System.out.println("Livros na biblioteca: " + biblioteca.quantosLivros());
                    break;

                case 5:
                    System.out.println("Xauuuuu Obrigaaaadooooooooooo");
                    leia.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Tente novamente .");
            }
        }
    }
}