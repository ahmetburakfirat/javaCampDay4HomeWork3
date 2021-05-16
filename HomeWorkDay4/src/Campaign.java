

public class Campaign {
	int id;
	String name;
	double discountRate;
	int startingDate;
	int endingDate;
	
	
	public Campaign(int id, String name, double discountRate, int startingDate, int endingDate) {
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
	}


	public Campaign() {
		
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


	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}


	public int getStartingDate() {
		return startingDate;
	}


	public void setStartingDate(int startingDate) {
		this.startingDate = startingDate;
	}


	public int getEndingDate() {
		return endingDate;
	}


	public void setEndingDate(int endingDate) {
		this.endingDate = endingDate;
	}
	
	
	
}
