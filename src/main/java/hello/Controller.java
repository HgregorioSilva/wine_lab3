package hello;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

import javax.swing.JOptionPane;

public class Controller {
	
	private Model model;
	
	
	public Controller(Model model){
		this.model = model;
	}
	
	public void buscarProduto(){
		get("/produto/:tipo/:marca/:ano", (req, res) -> {
		
			Especificacao espec = new Especificacao(req.params(":tipo"), req.params(":marca"), req.params(":ano"));	
			List<Produto> produtosEncontrados = model.buscarEspecificacao(espec);	
			return new Gson().toJson(produtosEncontrados);
			
		});
	}
	
	public void buscarProdutoVinho() {
		get("/produto/:vinho", (req, res) -> {
			
			String vinho = req.params(":vinho");	
			
			Produto produtosEncontrados2 = model.buscarVinho(vinho);
			return new Gson().toJson(produtosEncontrados2);
		});
	}
	
	
	

}
