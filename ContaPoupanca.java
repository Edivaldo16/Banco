package banco;

public class ContaPoupanca extends Contas{

	// Métodos Personalizados
	public void resgatar(ContaCorrente cc, double valor) {
		if(this.getSaldo() >= 0) {
			this.saldo = this.getSaldo() - valor;
		}

	}

}
