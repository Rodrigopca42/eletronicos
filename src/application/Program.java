package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		
		System.out.print("Digite o número de produtos:");
		int n = tec.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do produto nº "+i+" :");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char ch = tec.next().charAt(0);
			
			System.out.print("Nome do Produto: ");
			tec.nextLine();
			String name = tec.nextLine();
			
			System.out.print("Preço: R$");
			double price = tec.nextDouble();
			
		}
		
		
		tec.close();

	}

}
