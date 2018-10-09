
public class Cliente {
	int numero;
	String nome;
	String telefone;
	String email;
	
	public Cliente(int numero, String nome, String telefone, String email) {
		this.numero = numero;
		this.nome = nome;
		this.telefone = telefone;
		this.email=email;
	}
	
	public void showClient() {
		System.out.println(toString());
	}
	
	public String toString() {
		return "Cli{"+numero+" - "+nome+"}";
	}
	
	public static Cliente lerCliente() {
		int numero = Menu.lerIntMsg("Diga o numero do cliente: ");
		String nome = Menu.lerStringMsg("Diga o nome do cliente: ");
		String telefone = Menu.lerStringMsg("Diga o telefone do cliente: ");
		String email = Menu.lerStringMsg("Diga o email do cliente: ");
		return new Cliente(numero, nome, telefone, email); 
	}

	public static Cliente updCliente(int cId) {
		String nome = Menu.lerStringMsg("Diga o novo nome do cliente "+cId+": ");
		String telefone = Menu.lerStringMsg("Diga o novo telefone do cliente "+cId+": ");
		String email = Menu.lerStringMsg("Diga o novo email do cliente +"+cId+": ");
		return new Cliente(cId, nome, telefone, email); 
	}

}
