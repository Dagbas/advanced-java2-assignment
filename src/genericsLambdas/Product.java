package genericsLambdas;

public class Product {
	//define the instance variables for 'name' and 'price'
	private String name;
	private double price;
	

	//define a public constructor for Product that takes a name and price as input and sets the instance variables accordingly
	public Product ( String name, double price) {
		this.name=name;
		this.price=price;

	}



	public static void main(String[] args) {
		//Make an Inventory object that holds Products
		//Add as many products as you want to your Inventory Object using the addItem() method you defined
		//Your task is to calculate the total price of all products in an Inventory object called myInventory. Follow these steps:
		//1. Call the getItems method on your inventory object to retrieve the list of all products.
		//2. Convert this list into a stream by calling the stream method.
		//3. Apply the mapToDouble operation to this stream. The operation should be applied to each Product object 
		//	 	in the stream, converting it into its price. Use the lambda expression product -> product.price to 
		//		perform this conversion. This expression means "for each product, return its price".
		//4. Apply the sum operation to the stream to get the total price of all products.
		//5. Store this total price in a double variable called priceTotal.
		//6. Print out priceTotal to the console to make sure you are properly summing your Products!
		public static void main(String[] args) {
			Inventory<Product> myInventory = new Inventory<>();
			myInventory.addItem(new Product("PS5 Console DISC Edition", 499.99));
			myInventory.addItem(new Product("Gaming Chair", 249.99));
			myInventory.addItem(new Product("4K Telivision", 699.99;

			double priceTotal = myInventory.getItems().stream().mapToDouble(product -> product.price).sum();

			System.out.println(priceTotal);
			System.out.println(myInventory.getItems());
		}

	}
