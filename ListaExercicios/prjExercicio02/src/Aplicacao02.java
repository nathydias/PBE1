import prjExercicio02.Livro;

public class Aplicacao02 {

	
	public static void main(String[] args) {
		Livro QuartodeDespejo = new Livro ("Quarto de Despejo" , "Carolina Maria de Jesus", 300,60);
		Livro AsCartasdoDiaboparaseuAprendiz = new Livro ("As cartas do diabo para o seu aprendiz","C. S. Lewis", 312, 50);
	    Livro ODeusquedestroiSonhos = new Livro ("O Deus que destroi sonhos", "Rodrigo bibo", 200, 45);
	    
	    QuartodeDespejo.exibirInfo();
	    AsCartasdoDiaboparaseuAprendiz.exibirInfo();
	    ODeusquedestroiSonhos.exibirInfo();
	}
}
