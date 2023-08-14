package SpringBoot;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	
	int numero;
	String Agencia;
	String NomeCliente;
	BigDecimal saldo;
	
	// Exibir as mensagens para o nosso usuario
	System.out.println("Por favor, Digite o número da conta! : ");
	numero = scanner.nextInt();
	
	System.out.println("Por favor, Digite o número da Agência! : ");
	Agencia = scanner.next();
	
	System.out.println("Por favor, Digite o Nome do Cliente? : ");
	NomeCliente = scanner.next();
	
	System.out.println("Por favor, Digite o seu saldo? : ");
	saldo = scanner.nextBigDecimal();
		
	
	System.out.println("Olá [" + NomeCliente + "], obrigado por criar uma conta em nosso banco, sua agência é [" + Agencia +"], conta ["+ numero +"] e seu saldo [ " + saldo +"] já está disponível para saque");
		
	}
}
