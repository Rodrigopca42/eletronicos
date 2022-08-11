package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

//subclasse Produtos Usados que recebe herança da classe Produtos
public class UsedProduct extends Product {
	
	private Date manufacturDate;  //data de fabricação do produto usádo
	
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//construtores
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufacturDate) {
		super(name, price);
		this.manufacturDate = manufacturDate;
	}

	//metodos getters e setters
	public Date getManufacturDate() {
		return manufacturDate;
	}

	public void setManufacturDate(Date manufacturDate) {
		this.manufacturDate = manufacturDate;
	}
	
	//metodo toString que retorna no programa principal o texto formatado da classe produto usádo
	
	@Override
		public String priceTag() {
			return getName() 
					+ " (usado) R$"
					+ String.format("%.2f", getPrice()) 
							+ "(Data de fabricação: " 
					+ sdf.format(manufacturDate) + ")";
	}
	

}
