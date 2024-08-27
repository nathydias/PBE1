package prZoologico;

public class prjPokemon {
	prjPokemon pikachu = new prjPokemon(); 
	pikachu.nome = "pikachu";
    pikachu.tipo = "Eletrico";
	pikachu.hp = 100;
	pikachu.nivel = 50;
	prjPokemon charmander = new prjPokemon("charmander","Fogo",50,90);
	prjPokemon bulbassauro = new prjPokemon("bulbassauro","Planta",18,60);
	prjPokemon pidgey = new prjPokemon("pidgey","voador",25,100);
	prjPokemon magicarp = new prjPokemon("magicarp","Agua",22,95);
	
	pikachu.exibirInfo();
	pikachu.metodoAtacar();
	pikachu.metodoEvolucao();
	
	charmander.exibirInfo();
	charmander.metodoAtacar();
	charmander.metodoEvolucao();
	
	bulbassauro.exibirInfo();
	bulbassauro.metodoAtacar();
	bulbassauro.metodoEvolucao();
	
	pidgey.exibirInfo();
	pidgey.metodoAtacar();
	pidgey.metodoEvolucao();
	
	 magicarp.exibirInfo();
	 magicarp.metodoAtacar();
	 magicarp.metodoEvolucao();
	
}
	
	
	
}
