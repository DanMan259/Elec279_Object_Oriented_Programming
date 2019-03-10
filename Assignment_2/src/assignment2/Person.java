package assignment2;

public class Person extends Entity {
	private String gender;
	public Person(String name, 
			Date dateOfBirth,  
			String gender,
			double difficulty) {
		super(name, dateOfBirth, difficulty);
		this.gender = gender;
	}
	public Person(String name, 
			String dateString,
			String gender, 
			double difficulty) {
		super(name, dateString, difficulty);
		this.gender = gender;
	}
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
	public Person clone() {
		return new Person(this);
	}
	public String toString() {
		return super.toString()+"Gender: "+getGender()+"\n";
	}
	public String entityType() {
		return "This entity is a person!";
	}
}
