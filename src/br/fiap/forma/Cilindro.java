package br.fiap.forma;

public class Cilindro extends Forma {

	private double altura;
	
	//construtor da altura, atributo altura não estava na super class por isso foi criado na class cilindro, cilidro utiliza para calcular volume 
		public Cilindro(int cx, int cy, double raio, double altura) {
			super(cx, cy, raio);
			this.altura = altura;
		}

	@Override
	public double calcularArea() {
		return 0;	
	}

	//criação do metodo para volume
	public double calcularVolume() {
		return 0;
	}

	@Override
	public String toString() {
		String aux = super.toString(); //retornar para a variavel aux o código que esta na super
		aux += "Altura: " + altura + "\n";
		return aux;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
