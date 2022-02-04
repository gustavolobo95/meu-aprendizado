package oo.heranca.Desafio;

import java.util.ArrayList;

public class Racha {
	
public static void main(String[] args) {
	
	// Criamos 2 objetos na classe Racha para demonstrar a diferença dos 2 modelos de carro. 
	
	Civic Civicao = new Civic("Civic");
	Ferrari Ferra = new Ferrari("Ferrari");
	
	// Um ArrayList do tipo Carro para armazena-los
	ArrayList<Carro> ListaCarros = new ArrayList<Carro>();
	
	ListaCarros.add(Ferra);
	ListaCarros.add(Civicao);
	
	// E mostramos a velocidade inicial dos 2.
	System.out.println("Velocidade atual do Civic: " + Civicao.velocidadeAtual);
	System.out.println("Velocidade atual da Ferrari: " + Ferra.velocidadeAtual);
	
	System.out.println("                   CORRAM!!!");
	
	// A partir da condição while, enquanto um dos 2 carros não atingirem a velocidade de 300km.
	// Os 2 Carros irão acelerar e atualizar imprimindo na tela a velocidadeAtual.
	while(Civicao.velocidadeAtual < 300 && (Ferra.velocidadeAtual < 300)) {
		Civicao.Acelerar(Civicao);
		Ferra.Acelerar(Ferra);
		System.out.println("----------------------------------------------");
		System.out.println("Velocidade atual do Civic: " + Civicao.velocidadeAtual);
		System.out.println("Velocidade atual da Ferrari: " + Ferra.velocidadeAtual);
	} 
	
	System.out.println("----------------------------------------------");
	
	// Após isso passamos um forEach pela lista de carros, para mostrar o vencedor da corrida.
	for(Carro carros: ListaCarros) {
		if(carros.velocidadeAtual >=300) {
			System.out.println(carros.nome + ": Ganhou a corrida!");
			System.out.println("Velocidade atingida: " + carros.velocidadeAtual);
		}
	}
	
	// Após imprimir o vencedor, utilizamos o comando while com a condição de frear os 2 carros:
	while(Civicao.velocidadeAtual > 0 || (Ferra.velocidadeAtual > 0)) {
		Civicao.Frear(Civicao);
		Ferra.Frear(Ferra);
		System.out.println("----------------------------------------------");
		System.out.println("Velocidade atual do Civic: " + Civicao.velocidadeAtual);
		System.out.println("Velocidade atual da Ferrari: " + Ferra.velocidadeAtual);
	} 
	}

}