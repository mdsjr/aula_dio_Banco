package aula_dio_Banco;



public class main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("MoacirJ");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(49, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}