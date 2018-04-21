package hello;

public class Produto {

	private String vinho;
	private Especificacao espc;
	
	
	public Produto(String vinho, Especificacao espc){
		this.vinho = vinho;
		this.espc = espc;
		
	}
	
	public String getVinho(){
		return this.vinho;
	}
	
	public Especificacao getEspc(){
		return espc;
	}
	
	
}
