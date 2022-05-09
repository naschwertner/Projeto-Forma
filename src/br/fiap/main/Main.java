package br.fiap.main;

import br.fiap.forma.Cilindro;
import br.fiap.forma.Circulo;
import br.fiap.forma.Forma;

public class Main {

	public static void main(String[] args) {
		
		
		Forma[] forma = new Forma [4];
		
		//gerando 4 objetos 
		forma [0] = new Circulo(2, 3, 4);
		forma [1] = new Cilindro(1, -1, 3.5, 4.75);
		forma [2] = new Circulo(5, 5, 5.5);
		forma [3] = new Cilindro(3, 2, 2.5, 10);
		
		//saída de dados 
		for (Forma forma2 : forma) {
			
		}
		
		
	}

}
