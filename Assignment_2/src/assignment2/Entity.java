//Daniyal Maniar
//20064993

package assignment2;

public abstract class Entity {
	private double difficulty;
	private String name;
	private Date born;
	
	//Constructors
	public Entity (String name, 
			Date dateOfBirth, 
			double difficulty) {
		this.name= name;
		this.born = new Date(dateOfBirth); //Avoids privacy leak
		this.difficulty = difficulty;
	}
	public Entity (String name, 
			String dateString, 
			double difficulty) {
		this.name= name;
		this.born = new Date(dateString);
		this.difficulty = difficulty;
	}
	public Entity (Entity entity) {
		this.name= entity.name;
		this.born = new Date(entity.born); //Avoids privacy leak
		this.difficulty = entity.difficulty;
	}
	//Entity Difficulty Accessors and Mutators
	public double getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(double difficulty) {
		this.difficulty = difficulty;
	}
	//Entity Date Accessors and Mutators
	public Date getBorn() {
		return new Date(born);
	}
	public void setBorn(Date dateOfBirth) {
		this.born = new Date(dateOfBirth);
	}
	public void setBorn(String dateOfBirth) {
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
		return "Name: "+name+"\nBorn at: "+born.toString()+"\n";
	}
	//Checks if the two entities are equal
	public boolean equals(Entity person) {
		if (person ==  null) {
			return false;
		} else {
			return (name == person.getName() && born.equals(person.getBorn()));
		}
	}
	//Get tickets based off the difficulty of the entity
	public int getAwardedTicketNumber(){
		return (int)(difficulty*100);
	}
	//Abstact methods for the abstract class
	public abstract String entityType();
	public abstract Entity clone();
	//Defines Welcome message based off the derived class
	public String welcomeMessage(){
		return "Welcome! Let's start the game! "+entityType()+"\n";
	}
	//Defines Closing message based off the entity details
	public String closingMessage(){
		return "Congratulations! The detailed information of the entity you guessed is:\n"+toString();
	}
}
