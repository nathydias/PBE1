package prjCaneta;

import java.util.Scanner;

public class Aplicacao02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
		
    Livro Livro01 = new Livro("Alice no país das maravilhas","Julio Trigueiro");
    Livro Livro02 = new Livro("Quarto de despejo","Carolina Maria de Jesus");
    
    System.out.println("Livros disponiveis");
    System.out.print("01. ");
    Livro01.status();
    System.out.print("02. ");
    Livro02.status();
    
    System.out.println("Qual livro deseja alugar?");
    int escolha = sc.nextInt();
    
	}

}
