package magicnumbers.bad;

public class Main {

    public static void main(String[] args) {
        double price = 129.99;

        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);
    }

    private static double calculateShipping(double price) {
    	return price < 100 ? 4.99 : 0; // hard coded
        
    }

    private static double calculateDiscount(double price) {
        return price * 0.1;
    }
}
