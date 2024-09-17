package prjExercicio02;

public class Livro {
    //Atributos
	
	String titulo;
	String autor;
	int numPaginas;
	double Preco;
	
	//Construtores
	
	public Livro() {
		
	}
	public Livro(String parametroTitulo,String parametroAutor,int parametronumPaginas, double parametroPreco) {
		this.titulo = parametroTitulo;
		this.autor = parametroAutor;
		this.numPaginas = parametronumPaginas;
		this.Preco = parametroPreco;
	}
	//metodos Setters
	
	public void aplicacaoDesconto() {
	    if (this.Preco <= 15) {
	    System.out.println("Nao é possivel aplicar desconto");	
	    }
		this.Preco-= 15;

	}
	public void exibirInfo() {
		System.out.println("Titulo "+ this.titulo);
		System.out.println("Autor "+ this.autor);
		System.out.println("Ele tem "+ this.numPaginas+ "paginas");
		System.out.println("O valor é de" +this.Preco + "reais");
	}
	
	//getters e setters
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
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public double getPreco() {
		return Preco;
	}
	public void setPreco(double preco) {
		Preco = preco;
	}
	
}
