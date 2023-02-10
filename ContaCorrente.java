package banco;

public class ContaCorrente extends Contas {
	// Atributos
	 ContaPoupanca cp;
	 ContaCorrente cc;

	// Métodos Personalizados
	public void sacar(double valor) {
		if(this.getSaldo() <= valor) {
			this.saldo -= valor;
		}
		
	}

	public void depositar(double valor) {
		if(this.getSaldo() <= valor) {
			this.cp.saldo += valor;
			this.cc.saldo -= valor;
		}
		
	}

}
