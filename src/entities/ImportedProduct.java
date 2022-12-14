package entities;


//subclasse que recebe herança da classe produto
public class ImportedProduct extends Product{
	
	private Double customsFee;  // taxa alfendegaria para produtos importados
	
	
	public ImportedProduct() {
		super();
	}


	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}


	public Double getCustomsFee() {
		return customsFee;
	}


	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	
	public double totalPrice() {
		return getPrice() + customsFee;
	}
	
	
	//metodo toString que retorna no programa principal a o texto formatado da classe produto importado
	
	@Override
		public String priceTag() {
			return getName() 
					+ " R$"
					+ String.format("%.2f", totalPrice()) 
							+ "(Taxa alfandegária: R$" 
					+ String.format("%.2f", customsFee) + ")";
	}
	

}