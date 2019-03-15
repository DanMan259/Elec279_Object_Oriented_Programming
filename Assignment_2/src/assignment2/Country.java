//Daniyal Maniar
//20064993

package assignment2;

public class Country extends Entity{
	//Instance Variable
	private String capital;
	//Constructor for Date type DOB
	public Country(String name, 
			Date dateOfBirth, 
			String capital,
			double difficulty) {
		super(name, dateOfBirth,difficulty);
		this.capital = capital;
	}
	//Constructor for String type DOB
	public Country(String name, 
			String dateString, 
			String capital, 
			double difficulty) {
		super(name, dateString,difficulty);
		this.capital = capital;
	}
	//Copy Constructor
	public Country(Country country) {
		super(country);
		this.capital = country.capital;
	}
	//Country Capital Accessors and Mutators
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	//Abstract Clone method
	public Country clone() {
		return new Country(this);
	}
	//To String function that calls parent class's toString function, and gives derived class details
	public String toString() {
		return super.toString()+"Capital: "+getCapital()+"\n";
	}
	//Abstract entityType method. Gives details about the type of derived entity
	public String entityType() {
		return "This entity is a country!";
	}
}
