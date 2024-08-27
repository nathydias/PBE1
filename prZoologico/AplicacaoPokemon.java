package prZoologico;

public class AplicacaoPokemon {
//Atributos
	String Nome;
	String tipo;
	double hp;
	double nivel;
	//Construtores 
	
	public prjPokemon( ) {
		
	}
	 public prjPokemon(String parametroNome, String parametrotipo, String parametrohp, double parametronivel) {
	        this.Nome = parametroNome;
	        this.tipo = parametrotipo;
	        this.hp= parametrohp;
	        this.nivel = parametronivel;
	 }
	 public void metodoEvolucao() {
		 System.out.println(this.Nome + "esta evoluindo");
	 }
	   public void metodoAtacar() {
		   System.out.println(this.Nome + "atacou");
	   }
	   public void exibirInfo() {
		   System.out.println("Nome: " + this.Nome);
		   System.out.println("Tipo: " + this.tipo);
		   System.out.println("Hp: "+ this.hp);
		   System.out.println("Nivel: " + this.nivel);
	   }
}
