import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	String nomeBanco = "Banco Retalho";
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	String getNomeBanco() {
		return nomeBanco;
	}
	
	public Banco() {
	}
	
	public void addCliente(Cliente c) {
		clientes.add(c);
	}

	public void remCliente(int cId) {
		for(int i = 0 ; i < clientes.size() ; i++){
	        if(cId == clientes.get(i).numero){
	        	clientes.remove(i);
	        }
	    }
	}

	public void updCliente(Cliente c) {
		remCliente(c.numero);
		addCliente(c);
	}
	
	public void lstClientes() {
		System.out.println(clientes);
	}

}
