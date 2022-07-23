package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	Scanner ent = new Scanner(System.in);
	public ArrayList<Funcionario> funcionarios;

	public Empresa() {
		super();
		funcionarios = new ArrayList<Funcionario>();
	}
	
	public void cadastrarFuncionario() {
		System.out.println("Qual a matricula do funcionario? ");
		int matricula = ent.nextInt();
		//TODO validade a matricula
		
		System.out.println("Qual o nome do funcionario? ");
		String nome = ent.next();
		//TODO converter tudo para maiusculo
		
		System.out.println("Qual a idade do funcinario? ");
		int idade = ent.nextInt();
		//TODO validar idade >= 18
		
		System.out.println("Qual o cargo do funcionario? ");
		String cargo = ent.next();
		
		System.out.println("Qual a situacoa do funcionario? ");
		char situacao = ent.next().charAt(0);
		//TODO validar situação A ou D ou L
		
		System.out.println("Qual o salario do funcionario? ");
		double salario = ent.nextDouble();
		//TODO validar para ser >= salario minimo
		
		Funcionario temp = 
				new Funcionario(matricula, nome, idade, 
				cargo, salario, 'A');
		
		this.funcionarios.add(temp);
		System.out.println("Funcionario Cadastrado com sucesso");
	}
	
	public void mostrarRelatorio() {
		
		for(int i = 0; i < this.funcionarios.size(); i++  ) {
			if (funcionarios.get(i).idade > 30) {
				System.out.println(funcionarios.get(i).toString());
			}
		}
	}
	
	public void mostrarSalarios() {
		double soma = 0;
		for(int i = 0; i < this.funcionarios.size(); i++  ) {
			soma = soma + this.funcionarios.get(i).salario;
		}
	}
	
	public void demitirFuncionario() {
		Integer matTemp;
		System.out.println("Digite a matricula do funcionario que será demitido");
		matTemp = ent.nextInt();
		Funcionario funcTemp;
		funcTemp = buscarFuncionarioPelaMatricula(matTemp);
		if (funcTemp == null) {
			System.out.println("Matricula não encontrada");
		}
		else {
			if (funcTemp.getSituacao() == 'D') {
				System.out.println("Funcinário já está demitido.");
			}
			if (funcTemp.getSituacao() == 'L') {
				System.out.println("Funcionario está em licença");
			}
			if (funcTemp.getSituacao() == 'A') {
				funcTemp.setSituacao('D');
				System.out.println("Demissão concluída.");
			}
		}
	} 
	
	public void licenciarFuncionario() {
		Integer matTemp;
		System.out.println("Digite a matricula do funcionario "
				+ "que entrará em licença:");
		matTemp = ent.nextInt();
		Funcionario funcTemp;
		funcTemp=buscarFuncionarioPelaMatricula(matTemp);
		if (funcTemp == null) {
			System.out.println("Funcionário não existe");
		}
		else {
			if (funcTemp.getSituacao() == 'D') {
				System.out.println("Funcionario está demitido.");
			}
			if (funcTemp.getSituacao() == 'L' ) {
				System.out.println("Funcionario já está em licença.");
			}
			if (funcTemp.getSituacao() == 'A') {
				funcTemp.setSituacao('L');
			}
		}
		
		
	}
	
	public void encerrarLicenca() {
		Integer matTemp;
		System.out.println("Digite a matricula do funcionario "
				+ "que entrará em licença:");
		matTemp = ent.nextInt();
		Funcionario funcTemp;
		funcTemp=buscarFuncionarioPelaMatricula(matTemp);
		if (funcTemp == null) {
			System.out.println("Funcionário não existe");
		}
		else {
			if (funcTemp.getSituacao() == 'D') {
				System.out.println("Funcionario está demitido.");
			}
			if (funcTemp.getSituacao() == 'A' ) {
				System.out.println("Funcionario não está em licença.");
			}
			if (funcTemp.getSituacao() == 'L') {
				funcTemp.setSituacao('A');
			}
		}
		
		
	}

	
	public Funcionario buscarFuncionarioPelaMatricula(Integer matricula) {
		Funcionario retorno = null;
		for (int i=0; i < this.funcionarios.size(); i++) {
			if (matricula == this.funcionarios.get(i).getMatricula()) {
				retorno = this.funcionarios.get(i);
			}
		}
		return retorno;
	}
	
}
