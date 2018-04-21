package hello;


import java.util.List;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Model {
	
	private List<Produto> produtos = new LinkedList<Produto>();

	
	public void addProduto(Produto produto){
		produtos.add(produto);
	}
	
	public Produto buscarVinho(String vinho){
		
		for(Produto produto:produtos){
			if(produto.getVinho().equals(vinho)) {
				//JOptionPane.showMessageDialog(null, carro);
				return produto;
			}
		}
		
		return null;
	}
	
	
	public List<Produto> buscarEspecificacao(Especificacao esp){
		List<Produto> produtosEncontrados = new LinkedList<Produto>();
		
		for(Produto produto:produtos){
			 if(esp.comparar(produto.getEspc())) produtosEncontrados.add(produto);
		}
		
		return produtosEncontrados;
		
	}
	
	
	public List<Produto> getProdutos(){
		return produtos;
	}

}
