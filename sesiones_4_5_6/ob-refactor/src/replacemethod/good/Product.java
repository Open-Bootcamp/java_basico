package replacemethod.good;

/**
 * Técnica de refactoring para componer métodos
 * (Composing Methods)
 * 
 * Replace method with method object
 */
public class Product {
	
    private double price;
    private int quantity;
    private double discount;
    private double shipping;
    
    
    // metodos especiales
    
    double calculatePrice(){
    	// ProductPriceCalculator calculator = new ProductPriceCalculator(this);
    	// return calculator.calculatePrice();
    	
    	return new ProductPriceCalculator(this).calculatePrice();
    }
    
    // getter y setter 
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getDiscount() {
		return discount;
	}
	public double getShipping() {
		return shipping;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public void setShipping(double shipping) {
		this.shipping = shipping;
	}
    
    

}
