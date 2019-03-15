//Daniyal Maniar
//20064993

package assignment2;

public class Politician extends Person{
	//Instance Variable
	private String party;
	//Constructor for Date type DOB
	public Politician(String name, 
			Date dateOfBirth, 
			String gender, 
			String party,
			double difficulty) {
		super(name, dateOfBirth, gender, difficulty);
		this.party = party;
	}
	//Constructor for String type DOB
	public Politician(String name, 
			String dateString, 
			String gender, 
			String party,
			double difficulty) {
		super(name, dateString, gender, difficulty);
		this.party = party;
	}
	//Copy Constructor
	public Politician(Politician politician) {
		super(politician);
		this.party = politician.party;
	}
	//Politician debutAlbum Accessors and Mutators
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	//Abstract Clone method
	public Politician clone() {
		return new Politician(this);
	}
	//To String function that calls parent class's toString function, and gives derived class details
	public String toString() {
		return super.toString()+"Party: "+getParty()+"\n";
	}
	//Abstract entityType method. Gives details about the type of derived entity
	public String entityType() {
		return "This entity is a politician!";
	}
}
