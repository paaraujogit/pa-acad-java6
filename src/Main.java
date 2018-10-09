
public class Main {

	public static void main(String[] args) {
		Banco b = new Banco();
		System.out.println("Sistema de Gestão Bancária: "+b.getNomeBanco());
		int opcao=5;

		do {
			System.out.print("Opções Cliente: 1-Inserir ; 2-Listar ; 3-Atualizar ; 4-Apagar ; 5-Sair : ");
			opcao=Menu.lerInt();
			switch(opcao) {
			case 1: Cliente c = Cliente.lerCliente();
			    b.addCliente(c);
				break;
			case 2: b.lstClientes(); break;
			case 3: b.updCliente(Cliente.updCliente(Menu.lerIntMsg("Diga o número do cliente a atualizar: "))); break;
			case 4: b.remCliente(Menu.lerIntMsg("Diga o número do cliente a remover: "));break;
			case 5: System.out.println("Obrigado pela utilização");
			  System.exit(0);
			}
		} while(opcao!=5);
	}

}
