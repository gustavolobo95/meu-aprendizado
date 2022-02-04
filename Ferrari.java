package oo.heranca.Desafio;

public class Ferrari extends Carro {
	
	// Por meio do comando extends nos definimos que a subclasse Ferrari vai herdar os comportamentos da classe carro.
	// Isso pode ser sinalizado que uma "Ferrari" é um Carro.
	// Porém mesmo sendo um carro, a Ferrari tem alguns comportamentos diferentes, veja a seguir:
	
	Ferrari(String nome) {
		// O construtor usa a palavra reservada super (ao inves do this) para indicar o parametro da classe pai.
		super(nome);
		// TODO Auto-generated constructor stub
	}

	boolean Acelerar(Carro carro) {
		// O metodo Acelerar da classe Ferrari, é sobrescrito para funcionar com um comportamento diferente do padrão.
		// Afinal a Ferrari na vida real tem maior desempenho em velocidade que um carro convencional.
		// Por isso no metodo Acelerar dentro da Ferrari, nos criamos 3 variaveis do tipo boolean,
		// Que RECEBEM o metodo Acelerar da classe pai por meio da palavra super.
		boolean Acelerar = super.Acelerar(carro);
		boolean Acelerar2 = super.Acelerar(carro);
		boolean Acelerar3 = super.Acelerar(carro);
		return Acelerar || Acelerar2 || Acelerar3;
		// Assim retornando uma de qualquer das 3 variaveis, conseguimos que o metodo Acelerar da classe Ferrari.
		// "Use" 3 vezes o metodo convencional em apenas uma chamada.
	}
	
}
