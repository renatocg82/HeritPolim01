package entities;


public class ContaBanc {

	
	
	
	protected String nomeCliente;
	protected Integer numConta;
	protected Double saldo;
	
	public ContaBanc() {
	}

	public ContaBanc(String nomeCliente, Integer numConta, Double saldo) {

		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	
	public void sacar(double valor) {
		if(saldo >= valor) {
		this.saldo = saldo - valor;
		}
		else {
			System.out.println("Saque não permitido, saldo inferior ao valor de saque desejado");
		}
	}
	
	public void depositar(double valor) {
		this.saldo = saldo + valor;
	}
	
	
	public String toString() {
		
		return "Conta: " +
				numConta +
				", Cliente: " +
				nomeCliente +
				", Saldo:  $" +
				String.format("%.2f", saldo);
		
	}
	
	public void calcularNovoSaldo(double taxa) {
		 saldo = saldo + (saldo * taxa);
	}

	
	
	
}
