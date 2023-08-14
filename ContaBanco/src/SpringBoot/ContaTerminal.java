package SpringBoot;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	int numero;
	String Agencia;
	String NomeCliente;
	Double saldo;
	
	System.out.println("Por favor, Digite o número da conta! : ");
	numero = scanner.nextInt();
	
	System.out.println("Por favor, Digite o número da Agência! : ");
	Agencia = scanner.next();
	
	System.out.println("Por favor, Digite o Nome do Cliente? : ");
	NomeCliente = scanner.next();
	
	System.out.println("Conta : " + numero);
	

		
	}
}
