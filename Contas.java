package banco;

import java.util.Random;

public class Contas implements CaixaEletronico {

	private int numero;
	public double saldo;
	private double limite;
	Cliente titular = new Cliente();
	GeradorSenha senha = new GeradorSenha();
	ContaCorrente cc = new ContaCorrente();
	ContaPoupanca cp = new ContaPoupanca();

	// Métodos Personalizados
	public boolean saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}

	}

	public double deposita(double quantidade) {
		this.saldo += quantidade;
		return this.saldo;
	}

	public boolean transferePara(Contas destino, double valor) {
		boolean retirou = this.saca(valor);
		if (!(retirou)) {
			return false;
		} else {
			destino.saldo += valor;
			return true;
		}
	}

	// Métodos Especiais
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void cadastrar() {
		int contador = 0;
		contador++;
		int senha;

		Random gerador = new Random();
		Random gera = new Random();
		Random g = new Random();

		this.numero = (gerador.nextInt(9) + 1) * 1000 + (gera.nextInt(9) + 1) * 100 + (g.nextInt(9) + 1) * 1;

		System.out.println("---------------------------");
		System.out.println("Seja bem vindo ao Banco XXX");
		System.out.println("Vamos fazer seu cadastro");
		System.out.println("Nome: " + this.titular.nome);
		System.out.println("Sobrenome: " + this.titular.sobrenome);
		System.out.println("CPF: " + this.titular.cpf);
		System.out.println("---------------------------");
		System.out.println("Aguarde seu cadastro está sendo finalizado");
		System.out.println("Número de Conta: " + this.numero);
		System.out.println("Senha: " + this.senha.getRandomString(8));
		System.out.println("---------------------------");

	}

	@Override
	public void logar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void acessarConta() {
		System.out.println("Bem vindo a sua conta corrente");
		System.out.println("Seu saldo atual é: " + this.getSaldo());

	}

	/*
	 * public String getNome() { return nome; }
	 * 
	 * public void setNome(String nome) { this.nome = nome; }
	 */
	public void setNome(String nome) {
		this.titular.nome = nome;
	}

}
