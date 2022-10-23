
public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(15, "Asus", "Laptop", 1500);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product1);

	}

}
