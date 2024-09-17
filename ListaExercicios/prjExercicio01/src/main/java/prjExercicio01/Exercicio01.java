package prjExercicio01;

public class Exercicio01 {
	
	//Aibutos
String modelo;
int ano;
String marca;
float valor;

//Construtores

public Exercicio1() {
	
}

public Exercicio01(String parametroModelo, int parametroAno,String parametroMarca, float parametroValor)
this.ano = parametroAno;
this.modelo = parametroModelo;
this.placa = parametroMarca;
this.valor = parametroValor;

}
//Metodos
public void exibirInfo() {
	System.out.println("O modelo"+ this.modelo);
	System.out.println("O Ano"+ this.ano);
	System.out.println("Com a Placa"+ this.marca);
	System.out.println("Ele custa"+ this.valor);
}