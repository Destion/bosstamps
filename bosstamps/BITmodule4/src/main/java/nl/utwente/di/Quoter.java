package nl.utwente.di;

public class Quoter {
	public double getBookPrice(String nummer) {
		if(nummer.equals("1")){
			return 10.0;
		}
		if(nummer.equals("2")){
			return 45.0;
		}
		if(nummer.equals("3")){
			return 20.0;
		}
		if(nummer.equals("4")){
			return 35.0;
		}
		if(nummer.equals("5")){
			return 50.0;
		}
		else {
			return 0.0;
		}
	}
}
