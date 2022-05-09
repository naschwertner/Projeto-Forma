package br.fiap.forma;

public abstract class Forma {

	//private --> atributos não ficam visiveis na filha 
	//protected --> atributos ficam visiveis na filha
	protected int cx;
	protected int cy;
	protected double raio;
	
	//metodo construtor
	public Forma(int cx, int cy, double raio) {
		super();
		this.cx = cx;
		this.cy = cy;
		this.raio = raio;
	}
	
	public abstract double calcularArea(); //metodo abstrato --> tem o cabeçalho mas nao tem a codificação 
	
	//tostring metodo presente na classe object que é a "classe 0"
	@Override
	public String toString(){
		String aux = "";
		aux += "Coordenada x" +cx + "\n"; // \n para que os dados nao fiquem na mesma linha
		aux += "Coordenada y" +cy + "\n";
		aux += "raio" +raio + "\n";
		return aux;
	}

	public int getCx() {
		return cx;
	}

	public void setCx(int cx) {
		this.cx = cx;
	}

	public int getCy() {
		return cy;
	}

	public void setCy(int cy) {
		this.cy = cy;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
	
	
}
