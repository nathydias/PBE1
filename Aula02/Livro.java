package prjCaneta;

public class Livro {
	String livro;
	String autor;
    boolean alugado; 
    
    public Livro(String Livro, String Autor) {
    	this.nomeLivro = livro;
    	this.nomeAutor = autor;
    	this.alugado = false;
    	
    }
    
    void status () {
    	System.out.println("Nome do livro: " + this.nomeLivro);
    	System.out.println("Autor " + this.autor);
    }
    void alugado () {
    	this.aluguel = true;
    }
    void disponivel ( ) {
    	this.aluguel = false;
    }

}
