package prZoologico;
public class Aplicacao {

	public static void main(String[] args) {
    ClasseAnimal elefante = new ClasseAnimal();
    elefante.atributoNome = "Dumbo";
    elefante.atributoRaca = "Africano";
    elefante.atributoSexo = "Macho";
    elefante.atributoPeso = 170;
    
    ClasseAnimal girafa = new ClasseAnimal("Github","Russa","Femea",50);
    
    
    SubclasseCarnivoro leao = new SubclasseCarnivoro();
    leao.atributoNome = "Simba";
    leao.atributoRaca = "Australeandro";
    leao.atributoSexo = "Neutro";
    leao.atributoPeso = 123;
    
    elefante.exibirInfo();
    
    elefante.metodoComer();
    
    elefante.exibirInfo();
    
    girafa.exibirInfo();
    
    elefante.metodoComer();
    
    System.out.println(elefante.atributoNome);
    System.out.println(elefante.atributoPeso);
	}

}
