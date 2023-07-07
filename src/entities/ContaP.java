package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaP extends ContaBanc {
	
	protected Date diaRendimento;
	
	
	
	public ContaP() {
	}

	public ContaP(String nomeCliente, Integer numConta, Double saldo, Date diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}

		
	public Date getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(Date diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	
	


	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
		return "[Conta: " +
				numConta +
				", Cliente: " +
				nomeCliente +
				", Saldo:  $" +
				String.format("%.2f", saldo) +
				", Dia de Rendimento: " +
				sdf.format(diaRendimento) +
				"]";
	}
	
}

