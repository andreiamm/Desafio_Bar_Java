package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill client = new Bill();
		
		System.out.print("Sexo: ");
		client.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		client.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		client.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		client.barbecue = sc.nextInt();
		
		System.out.printf("%nRELATÓRIO:%n");
		System.out.printf("Consumo = R$ %.2f%n", client.feeding());
		
		if (client.cover() == 0) {
			System.out.printf("Isento de Couvert%n");
		} else {
			System.out.printf("Couvert = R$ %.2f%n", client.cover());
		}
			
		System.out.printf("Ingresso = R$ %.2f%n", client.ticket());
		System.out.printf("%nValor a pagar = R$ %.2f%n", client.total());
		
		sc.close();
	}

}
