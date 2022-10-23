
public class Product {
	
	private int id;
	private String name ;
	private String description;
	private double stockAmount;
	
	
	public Product(int id, String name, String description, double stockAmount) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.stockAmount = stockAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(double stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	
	

}
