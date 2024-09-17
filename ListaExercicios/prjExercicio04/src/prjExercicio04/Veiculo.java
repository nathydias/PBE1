package prjExercicio04;

public class Veiculo {
// atributos
	String marca;
	String modelo;
	int velocidade;
	
	//Construtores
	
	public veiculo() {
		
	}
public Veiculo (String parametromarca,String parametromodelo,int parametrovelocidade) {
	this.marca = parametromarca;
	this.modelo = parametromodelo;
	this.velocidade = parametrovelocidade;
	}
public void metodoAcelerar() {
this.velocidade +=10;
}
System.out.print("veiculo acelerando");
}

