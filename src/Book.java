import java.util.ArrayList;
import java.util.List;
public class Book {

        private String titulo;
        private String autor;
        private int anoPublicacao;

        public Book(String titulo, String autor, int anoPublicacao) {
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacao = anoPublicacao;
        }

        public String getTitulo() {
            return titulo;
        }

        public void exibirInfo() {
            System.out.println("Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao);
        }
    }

