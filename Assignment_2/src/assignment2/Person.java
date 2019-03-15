//Daniyal Maniar
//20064993

package assignment2;

public class Person extends Entity {
	//Instance Variable
	private String gender;
	//Constructor for Date type DOB
	public Person(String name, 
			Date dateOfBirth,  
			String gender,
			double difficulty) {
		super(name, dateOfBirth, difficulty);
		this.gender = gender;
	}
	//Constructor for String type DOB
	public Person(String name, 
			String dateString,
			String gender, 
			double difficulty) {
		super(name, dateString, difficulty);
		this.gender = gender;
	}
	//Copy Constructor
	public Person(Person person) {
		super(person);
		this.gender = person.gender;
	}
	//Country Gender Accessors and Mutators
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	//Abstract Clone method
	public Person clone() {
		return new Person(this);
	}
	//To String function that calls parent class's toString function, and gives derived class details
	public String toString() {
		return super.toString()+"Gender: "+getGender()+"\n";
	}
	//Abstract entityType method. Gives details about the type of derived entity
	public String entityType() {
		return "This entity is a person!";
	}
}
