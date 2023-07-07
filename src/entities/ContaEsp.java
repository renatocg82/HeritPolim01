package entities;

public class ContaEsp extends ContaBanc{
	
	protected double limite;
	
	public ContaEsp() {
		
	}

	public ContaEsp(String nomeCliente, Integer numConta, Double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}
	
	@Override
	
	public void sacar(double valor) {
		if (valor <= saldo && valor <= limite) {
			saldo = saldo - valor;
		}
		else {
			System.out.println("Saque não permitido. Valor desejado maior que limite ou maior que saldo da conta");
		}
	}
	
	public String toString() {
		
		return "[Conta: " +
				numConta +
				", Cliente: " +
				nomeCliente +
				", Saldo:  $" +
				String.format("%.2f", saldo) +
				", Limite para saque: $" +
				String.format("%.2f", limite) + "]";
		
	}
	
	
}
