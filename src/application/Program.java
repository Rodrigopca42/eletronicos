package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
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
			
			if(ch == 'i') {
				System.out.print("Taxa alfandegária: ");
				double customsFee = tec.nextDouble();
				
				Product pro = new ImportedProduct(name, price, customsFee);
				list.add(pro);
			}
			if(ch == 'u') {
				System.out.print("Data de fabricação (DD/MM/AAAA): ");
				Date manufature = sdf.parse(tec.next());
				
				Product pro = new UsedProduct(name, price, manufature);
				list.add(pro);
			}
			if(ch == 'c');
				Product pro = new Product(name, price);
				list.add(pro);
		}
		tec.close();
		
		System.out.println("");
		System.out.println("ETIQUETAS DE PREÇO: ");
		for(Product pro: list) {
			System.out.println(pro.priceTag());
		}

	}

}
