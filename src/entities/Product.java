package entities;


//Classe pai : Produto 
public class Product {
	
	private String name;  //nome do produto	
	private Double price; // preço do produto
	
	// Contrutores
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//metodo toString que retorna no programa principal a o texto formatado da classe produto
	public String priceTag() {
		return name + " R$"+ String.format("%.2f", price);
	}
	

}
