package launcher;

import java.util.Scanner;

import model.Empresa;

public class Main {

	public static Scanner e = new Scanner(System.in);
	
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		int opcao;
		do {
			opcao = mostrarMenu();
			switch(opcao) {
			case 1: //Cadastrar um funcionario
					empresa.cadastrarFuncionario();
					break;
			case 2: //Mostrar relatorio
				empresa.mostrarRelatorio();
				break;
			case 3: 
				empresa.mostrarSalarios();
				break;
			case 4: //demitir funcionario
				empresa.demitirFuncionario();
				break;
			case 5: //colocar funcionario em licença
				empresa.licenciarFuncionario();
				break;
			case 6: //retirar funcionario da licença
				empresa.encerrarLicenca();
				break;
			case 7: //encerrar
				System.out.println("Saindo da aplicação");
				break;
			default: 
				System.out.println("Opção invalida. Digite novamente");
			} //fim do switch
		} while (opcao != 7); 

	}

	public static int mostrarMenu() {
		int opcao;
		System.out.println("\n1- Cadastrar Funcionario");
		System.out.println("\n2- Mostrar um relatório ");
		System.out.println("\n3- Mostrar valor total salários");
		System.out.println("\n4- Demitir funcionário");
		System.out.println("\n5- Colocar funcionário em licença");
		System.out.println("\n6- Interromper licença de um funcionário");
		System.out.println("\n7- Finalizar");
		System.out.println("\nQual a opção desejada? ");
		opcao = e.nextInt();
		return opcao;
	}
}
