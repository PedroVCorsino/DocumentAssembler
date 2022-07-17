package document;

import java.util.Scanner;
import java.util.TreeSet;

public class DocumentAssembler {
	
	public static void main(String[] args) throws Exception {
		Integer selection = 0;
		TreeSet<Branch> branches = new TreeSet<Branch>();
		Scanner scan = new Scanner(System.in);

		Menu menu = new Menu();

		System.out.println("_____________________");
		System.out.println("|                    |");
		System.out.println("|   Bem vindo ao     |");
		System.out.println("| Document Assembler |");
		System.out.println("|____________________|");		

		while(selection != 5){
			selection = 0;
			selection = menu.iniciar(scan, selection, branches);
	
			switch (selection) {
			case 1:
				menu.cadastrar(scan, branches);
				break;
			case 2:
				menu.listar(scan, branches);
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}

	}		
}
	class Menu{		
		public Menu() {
		}
		public int iniciar(Scanner scan, Integer selection, TreeSet<Branch> branches) {
			
			while(selection < 1 || selection > 5) {
				System.out.println("Selecione 3 a qualquer momento para sair.");
				System.out.println("");
				if (branches.isEmpty()) {
					System.out.println("árvore de documentos está vazia");
				} 
				System.out.println("Gostaria de criar nova branch?");
				System.out.println("1. Sim");
				System.out.println("2. Não, mostre o status");
				System.out.println("5. Sair");
				selection = scan.nextInt();
			}
			return selection;
		}

		public void cadastrar(Scanner scan, TreeSet<Branch> branches) {
			System.out.println("Digite o nome da branch:");
			String name = scan.next();
			branches.add(new Branch(name));
		}

		public void listar(Scanner scan, TreeSet<Branch> branches) {
			for(Branch branch : branches) {
				System.out.println(branch);
			}
		}

	}

