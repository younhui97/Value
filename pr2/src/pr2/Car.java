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
		double nprice;
		double nnprice = 0;
		nprice=nnprice;
		nprice= price*0.8*(Math.pow(0.99,month));
		return nprice;
	}
	
	public double EstimateValue() {
		double nnprice;
		nnprice= price*0.8*(Math.pow(0.99,1));
		return nnprice;
	}
	public String toString(){
		return String.format("Car name:"+name+"\n"+"initial price:"+price);
		
	}
}
