package replacemethod.bad;

public class Product {

    double price;
    int quantity;
    double discount;
    double shipping;

    // constructores

    // metodos

    // tostring

    public double calculatePrice(){
        double result = 0;
        double priceQuantity = this.price * this.quantity;
        double priceDiscount = this.price * this.discount;
        double priceShipping = shipping * 0.50;

        // .......

        // ......
        return result;
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
