package pr2;

public class Car implements Valuable {
	private String name;
	private double price;

	public Car(String name,double price){
		this.name=name;
		this.price=price;
	}

	@Override
	public double EstimateValue(int month) {
		// TODO Auto-generated method stub
		return 0;
	}
	public String toString(){
		return String.format("Car name:",name,"\n","initial price:",price);
		
	}
}
