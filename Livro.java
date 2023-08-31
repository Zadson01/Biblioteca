package biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Livro {
    private int IdLivro;
    private String Titulo;
    private String Autor;
    private int Ano;
    private String Genero;
    private String Editora;
    private int Paginas;

    public Livro(int IdLivro, String Titulo, String Autor, int Ano, String Genero, String Editora, int Paginas) {
        this.IdLivro = IdLivro;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Ano = Ano;
        this.Genero = Genero;
        this.Editora = Editora;
        this.Paginas = Paginas;
    }

    public int getIdLivro() {
        return IdLivro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getAno() {
        return Ano;
    }

    public String getGenero() {
        return Genero;
    }

    public String getEditora() {
        return Editora;
    }

    public int getPaginas() {
        return Paginas;
    }

    public String toString() {
        return "ID: " + IdLivro + "\n" +
               "Título: " + Titulo + "\n" +
               "Autor: " + Autor + "\n" +
               "Ano: " + Ano + "\n" +
               "Gênero: " + Genero + "\n" +
               "Editora: " + Editora + "\n" +
               "Páginas: " + Paginas + "\n";
    }
}

class BibliotecaPessoal {
    private List<Livro> livros = new ArrayList<>();

    public int quantosLivros() {
        return livros.size();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void removerLivro(int idLivro) {
        Iterator<Livro> iterator = livros.iterator();
        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            if (livro.getIdLivro() == idLivro) {
                iterator.remove();
                System.out.println("Livro removido.");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}
