import java.util.Scanner;

import models.entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os dados da conta");
		System.out.print("Numero: ");
		int number = sc.nextInt();		
		System.out.print("Proprietario: ");
		String name = sc.next();
		System.out.print("Valor disponível: ");
		double valor = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limite = sc.nextDouble();
		
		System.out.print("Valor de saque: ");
		double saque = sc.nextDouble();
		
		if (saque > valor) {
			System.out.println("Valor de saque maior que o disponível!!");
		}
		
		else if(saque > limite) {
			System.out.println("Valor de saque maior que o limite!!");
		}
		
		else {
			Account conta = new Account(number, name, valor, limite);
			conta.withdraw(saque);;
			System.out.println("Novo valor disponível: " + String.format("%.2f", conta.getBalance()));
		}
		sc.close();
	}

}
