package model;

public class Funcionario {
	private Integer matricula;
	private String nome;
	public Integer idade;
	public String cargo;
	public Double salario;
	private Character situacao;
	
	public Funcionario() {
		super();
	}

	public Funcionario(Integer matricula, String nome, Integer idade, String cargo, Double salario,
			Character situacao) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", nome=" + nome + ", idade=" + idade + ", cargo=" + cargo
				+ ", salario=" + salario + ", situacao=" + situacao + "]";
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Character getSituacao() {
		return situacao;
	}

	public void setSituacao(Character situacao) {
		this.situacao = situacao;
	}
	
	
}
