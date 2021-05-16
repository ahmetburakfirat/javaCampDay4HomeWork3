

public class Game {
	int id;
	String name;
	String image;
	double price;
	double discountRate;
	double priceWithDiscount;
	int ageLimit;
	
	public Game() {
		
	}

	public Game(int id, String name, String image, double price, double discountRate, int ageLimit) {
		this.id = id;
		this.name = name;
		this.image = image;
		this.price = price;
		this.discountRate = discountRate;
		this.ageLimit = ageLimit;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public double getPriceWithDiscount() {
		return priceWithDiscount;
	}
}
