package banco;

public class Teste {

	public static void main(String[] args) {

		ContaPoupanca cp = new ContaPoupanca();
		ContaCorrente cc = new ContaCorrente();

		Contas minhaConta = new Contas();
		Cliente c = new Cliente();
		minhaConta.titular = c;
		minhaConta.titular.cpf = "003.828.896-95";
		minhaConta.titular.nome = "Cleiton";
		minhaConta.titular.sobrenome = "Ualasse";
		
		

		/*
		minhaConta.titular.cpf = "102.819.854-05";
		minhaConta.titular.nome = "Edivaldo";
		minhaConta.titular.sobrenome = "Júnior";
		cc.deposita(100000.0);*/
		
		

		/*
		System.out.println(cc.transferePara(cp, 1000.0));
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo()); */

	}

}
