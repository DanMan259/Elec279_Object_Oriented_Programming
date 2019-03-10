package assignment1;

public class Entity {
	private String name;
	private Date born;
	
	//Constructors
	public Entity (String name, Date dateOfBirth) {
		this.name= name;
		this.born = new Date(dateOfBirth); //Avoids privacy leak
	}
	public Entity (String name, String dateString) {
		this.name= name;
		this.born = new Date(dateString);
	}
	public Entity (Entity person) {
		this.name= person.name;
		this.born = new Date(person.born); //Avoids privacy leak
	}
	//Entity Date Accessors and Mutators
	public Date getBorn() {
		return born;
	}
	public void setBorn(Date dateOfBirth) {
		this.born = new Date(dateOfBirth);
	}
	//Entity Name Accessors and Mutators
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Prints string of information about the entity
	public String toString() {
		return "Name: "+name+"\n"+"Born on: "+born.toString()+"\n";
	}
	//Checks if the two entities are equal
	public boolean equals(Entity person) {
		if (person ==  null) {
			return false;
		} else {
			return (name == person.getName() && born.equals(person.getBorn()));
		}
	}
}
