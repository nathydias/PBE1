package prjExercicio01;

public class Aplicacao {

	public static void main(String[] args) {
		Carro Fiat = new Carro("Uno",2008,10000);
        Carro Volvo = new Carro("xc60",2023,"volvo", 82,900);
        
        Fiat.exibirInfo();
        Volvo.exbirInfo();
	}

}
