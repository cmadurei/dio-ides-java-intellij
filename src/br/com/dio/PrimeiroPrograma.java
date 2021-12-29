package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        int a =2;
        int b =1;
        System.out.println("Palmeiras ganhou " + (a+b) + " vezes a Libertadores! ");
        System.out.println("Palmeiras ganhou " + (a+b+7) + " vezes o Brasileirão! \n");

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("Tri da Liberta", "CDM");
        System.out.println(livro1);
    }
}

class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

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

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
