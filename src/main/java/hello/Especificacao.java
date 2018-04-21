package hello;

public class Especificacao {

	
	private String tipo;
	private String marca;
	private String ano;
	
	
	public Especificacao(String tipo, String marca, String ano){
		this.tipo = tipo;
		this.marca = marca;
		this.ano = ano;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public String getAno(){
		return ano;
	}
	
	//delegacao da comparacao de marca, modelo e cor do carro para a classe Especificacao, pois ela eh a dona dos atributos
	public boolean comparar(Especificacao esp){
		if(marca.equals(esp.marca) && tipo.equals(esp.tipo) && ano.equals(esp.ano)){
			return true;
		} else {
			return false;
		}
	}
	
}
