package oo.heranca.Desafio;

public class Carro {
	
	// Na Orientação a Objeto temos paradigmas como herança que nos permitem a partir de uma classe mais generica,
	// Criar objetos que podem herdar caracteristicas da classe pai.
	// Essas caracteristicas podem ser atributos ou metodos
	
	// No exemplo temos a classe "Carro" que possui apenas 2 atributos, String nome e int velocidadeAtual.
	String nome;
		
	Carro(String nome) {
		// Temos um construtor que recebe como parametro o nome do carro criado.
		this.nome = nome;
	}
	
	int velocidadeAtual = 0;
	
	boolean Acelerar(Carro carro) {
		// O metodo boolean Acelerear() que recebe um carro como parametro, 
		// E altera a velocidadeAtual desse carro (atribuição aditiva de 5km).
		this.velocidadeAtual += 5;
		return true;
	}
	
	boolean Frear(Carro carro) {
		// E o metodo Frear() que assim como o metodo de cima recebe um carro como parametro,
		// E também altera sua velocidadeAtual (de forma subtrativa) com a condição dessa ser superior ou igual a 5.
		// Do contrario ele apenas retorna false e mantem a velocidadeAtual em 0 (sinalizando carro parado).
		if(velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
			return true;
		} else {
			velocidadeAtual = 0;
			return false;
		}
	}
	
		
}
