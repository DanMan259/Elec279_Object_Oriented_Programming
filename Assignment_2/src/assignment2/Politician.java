package assignment2;

public class Politician extends Person{
	private String party;
	public Politician(String name, 
			Date dateOfBirth, 
			String gender, 
			String party,
			double difficulty) {
		super(name, dateOfBirth, gender, difficulty);
		this.party = party;
	}
	public Politician(String name, 
			String dateString, 
			String gender, 
			String party,
			double difficulty) {
		super(name, dateString, gender, difficulty);
		this.party = party;
	}
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
	public Politician clone() {
		return new Politician(this);
	}
	public String toString() {
		return super.toString()+"Party: "+getParty()+"\n";
	}
	public String entityType() {
		return "This entity is a politician!";
	}
}
